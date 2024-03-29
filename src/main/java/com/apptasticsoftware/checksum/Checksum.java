/*
 * MIT License
 *
 * Copyright (c) 2022, Apptastic Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.apptasticsoftware.checksum;

import javax.net.ssl.SSLContext;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Optional;
import java.util.zip.GZIPInputStream;

/**
 * Calculate checksum
 */
public final class Checksum {

    private Checksum() {

    }

    /**
     * Calculate checksum for the content a given file
     *
     * @param file file
     * @param digest checksum type
     * @return checksum
     * @throws IOException IOException
     */
    public static String calculate(File file, MessageDigest digest) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(file));

        return calculate(is, digest);
    }

    /**
     * Calculate checksum for the content a given URL
     *
     * @param url url
     * @param digest checksum type
     * @return checksum
     * @throws IOException - IOException
     * @throws InterruptedException - InterruptedException
     * @throws GeneralSecurityException - GeneralSecurityException
     */
    public static String calculate(URI url, MessageDigest digest) throws IOException, InterruptedException, GeneralSecurityException {
        SSLContext context = SSLContext.getInstance("TLSv1.3");
        context.init(null, null, null);

        HttpClient client = HttpClient.newBuilder()
                .sslContext(context)
                .connectTimeout(Duration.ofSeconds(20))
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();

        HttpRequest request = HttpRequest.newBuilder(url)
                .header("Accept-Encoding", "gzip")
                .timeout(Duration.ofSeconds(20))
                .GET()
                .build();

        HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());

        if (response.statusCode() >= 400 && response.statusCode() < 600) {
            throw new IOException("Response http status code: " + response.statusCode());
        }

        var inputStream = response.body();

        if (Optional.of("gzip").equals(response.headers().firstValue("Content-Encoding")))
            inputStream = new GZIPInputStream(inputStream);

        inputStream = new BufferedInputStream(inputStream);

        return calculate(inputStream, digest);
    }

    /**
     * Calculate checksum for a input stream
     *
     * @param is input stream
     * @param digest checksum type
     * @return checksum
     * @throws IOException - IOException
     */
    public static String calculate(InputStream is, MessageDigest digest) throws IOException {
        byte[] buffer = new byte[8 * 1024];
        int bytesCount;

        while ((bytesCount = is.read(buffer)) != -1) {
            digest.update(buffer, 0, bytesCount);
        }

        is.close();
        byte[] bytes = digest.digest();
        StringBuilder hashBuilder = new StringBuilder();

        for (byte aByte : bytes) {
            hashBuilder.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
        }

        return hashBuilder.toString();
    }
}
