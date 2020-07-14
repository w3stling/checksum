package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class MicCodeTest {

    @Test
    public void MicCodeTest() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.iso20022.org/sites/default/files/ISO10383_MIC/ISO10383_MIC.csv"), MessageDigest.getInstance("MD5"));
        assertEquals("33987b5c9bcebcbf696a56513a11f3f6", checksum);
    }
}
