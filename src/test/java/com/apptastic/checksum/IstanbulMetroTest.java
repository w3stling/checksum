package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class IstanbulMetroTest {

    @Test
    public void railSystemsMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Rayl%C4%B1%20Sistemler%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ae2e03d7fe4ad4fff239f4573ebe83e6", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Tramvay%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2f0fbc36cb586a5aa68f7e66dd1269ae", checksum);
    }

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Metro%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9d6f834875b3d4c577882373e2864540", checksum);
    }

    @Test
    public void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/Gece%20Metrosu%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d22302aebad12f4ecf8236acae2874e4", checksum);
    }
}
