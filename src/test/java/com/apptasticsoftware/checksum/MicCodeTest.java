package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MicCodeTest {

    @Test
    void testMicCode() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.iso20022.org/sites/default/files/ISO10383_MIC/ISO10383_MIC.csv"), MessageDigest.getInstance("MD5"));
        assertEquals("963535ce045f5056f38e6079c2c65724", checksum);
    }
}
