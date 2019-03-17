package com.apptastic.checksum;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.MessageDigest;

/**
 * Calculate checksum
 */
public final class Checksum {

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
     * @throws InterruptedException InterruptedException
     */
    public static String calculate(URI url, MessageDigest digest) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
        InputStream is = new BufferedInputStream(response.body());

        return calculate(is, digest);
    }

    private static String calculate(InputStream is, MessageDigest digest) throws IOException {
        byte[] buffer = new byte[8 * 1024];
        int bytesCount;

        while ((bytesCount = is.read(buffer)) != -1) {
            digest.update(buffer, 0, bytesCount);
        }

        is.close();
        byte[] bytes = digest.digest();
        StringBuilder hashBuilder = new StringBuilder();

        for(int i=0; i< bytes.length ;i++) {
            hashBuilder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        return hashBuilder.toString();
    }
}
