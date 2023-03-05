package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MicCodeTest {

    @Test
    void testMicCode() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.iso20022.org/sites/default/files/ISO10383_MIC/ISO10383_MIC.csv"), MessageDigest.getInstance("MD5"));
        assertEquals("c27b7ac16a85ecd603f95f64b0f0c6db", checksum);
    }

    public static void main(String[] args) {
        //Locale.setDefault(Locale.GERMAN);
        System.out.println(Locale.getDefault());
        var formatter = DateTimeFormatter.ofPattern("E, d LLL yyyy HH:mm:ss O");
        System.out.println(formatter);
        var timestamp = ZonedDateTime.parse("Sat, 21 Jan 2023 11:12:30 GMT", formatter);
        System.out.println(timestamp);
    }
}
