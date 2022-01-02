package com.apptasticsoftware.checksum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.net.URL;
import java.security.MessageDigest;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FileTest {

    private static Stream<Arguments> checksumParameters() {
        return Stream.of(
                arguments("MD5", "8ddd8be4b179a529afa5f2ffae4b9858"),
                arguments("SHA1", "a0b65939670bc2c010f4d5d6a0b3e4e4590fb92b"),
                arguments("SHA-256", "03ba204e50d126e4674c005e04d82e84c21366780af1f43bd54a37816b6ab340")
        );
    }

    @ParameterizedTest
    @MethodSource("checksumParameters")
    void calcFileChecksum(String checksumName, String expectedChecksum) throws Exception {
        URL filename = getClass().getClassLoader().getResource("test_file.txt");
        assertNotNull(filename);
        String checksum = Checksum.calculate(new File(filename.getFile()),  MessageDigest.getInstance(checksumName));
        assertEquals(expectedChecksum, checksum);
    }

}
