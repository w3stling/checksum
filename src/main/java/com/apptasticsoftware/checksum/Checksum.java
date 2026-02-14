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
import java.net.CookieManager;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.Optional;
import java.util.zip.GZIPInputStream;

/**
 * Calculate checksum
 */
public final class Checksum {
    private static final String[] HTTP_USER_AGENTS = {
            // Chrome
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36",
            // Firefox
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:147.0) Gecko/20100101 Firefox/147.0",
            // Safari
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 14_7_3) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.3 Safari/605.1.15"
    };

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

        CookieManager cookieManager = new CookieManager();

        HttpClient client = HttpClient.newBuilder()
                .sslContext(context)
                .cookieHandler(cookieManager)
                .connectTimeout(Duration.ofSeconds(20))
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder(url)
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
                .header("Accept-Encoding", "gzip, deflate, zstd")
                .header("User-Agent", getUserAgent())
                .header("Accept-Language", "sv,en-US;q=0.9,en;q=0.8,de-DE;q=0.7,de;q=0.6,es-ES;q=0.5,es;q=0.4,ca;q=0.3,tr;q=0.2,ja;q=0.1,hi;q=0.1")
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

    private static String getUserAgent() {
        return HTTP_USER_AGENTS[new SecureRandom().nextInt(HTTP_USER_AGENTS.length)];
    }
}
