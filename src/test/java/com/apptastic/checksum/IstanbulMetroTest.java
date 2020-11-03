package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class IstanbulMetroTest {

    @Test
    public void railSystemsMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Rayl%C4%B1%20Sistemler%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6209ae8c6b53811c1598df3ea0199ecd", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Tramvay%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("fbe99a87e28cac94ad4a031fd33bc27e", checksum);
    }

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Metro%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d0f6fea8485411022fb2dd6c7fff8924", checksum);
    }

    @Test
    public void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/Gece%20Metrosu%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d22302aebad12f4ecf8236acae2874e4", checksum);
    }
}
