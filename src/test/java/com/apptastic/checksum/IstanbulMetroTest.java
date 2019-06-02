package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class IstanbulMetroTest {

    @Test
    public void railSystemsMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Rayl%C4%B1%20Sistemler%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f51acd0143e4bb533da666d9cd8c7c96", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Tramvay%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("349e29c88b4ab4f22f703263167c5490", checksum);
    }

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Metro%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3f703256e54ccd3094ebb6fac7da28f6", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://en.wikipedia.org/wiki/Public_transport_in_Istanbul#/media/File:Istanbul_Metrob%C3%BCs_Lines.png"), MessageDigest.getInstance("MD5"));
        assertEquals("9a07cf0cfcd8f241193789f80791385e", checksum);
    }

    @Test
    public void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.sehirhatlari.istanbul/themplate/images/b-merkez-hatlari.png"), MessageDigest.getInstance("MD5"));
        assertEquals("657a054c2c14f7e6ccca891f2cd8bbd5", checksum);
    }

}
