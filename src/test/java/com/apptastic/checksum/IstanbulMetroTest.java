package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class IstanbulMetroTest {

    @Test
    public void railSystemsMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Rayl%C4%B1%20Sistemler%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("47873138526aa20645f2543bbd425426", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Tramvay%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e8cf6557b892dbaf63b411af14bdecd4", checksum);
    }

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Metro%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9e643aec8a7713195cbd628065d80380", checksum);
    }

    @Test
    public void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/Gece%20Metrosu%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d22302aebad12f4ecf8236acae2874e4", checksum);
    }
}
