package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MicCodeTest {

    @Test
    void testMicCode() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.iso20022.org/sites/default/files/ISO10383_MIC/iso10383_mic_newformat.csv"), MessageDigest.getInstance("MD5"));
        assertEquals("f3296aa5cc3d638391a29c8769461587", checksum);
    }
}
