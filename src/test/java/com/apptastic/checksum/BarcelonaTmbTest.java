package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BarcelonaTmbTest {

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tmb.cat/documents/20182/96078/Pl%C3%A0nol+xarxa+de+Metro/f5578f40-5a66-46ba-907c-cf31e0d368c0"), MessageDigest.getInstance("MD5"));
        assertEquals("03f9217502a89ad18d05f00d2975a130", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tmb.cat/documents/20182/96078/Pl%C3%A0nol+xarxa+bus.pdf/9b5bfa95-6117-4117-9843-fb3e3fde5447"), MessageDigest.getInstance("MD5"));
        assertEquals("00e2570a80f28e80088193d366a05c15", checksum);
    }

    @Test
    public void busNetworkMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tmb.cat/documents/20182/96078/Pl%C3%A0nol+Nova+Xarxa+de+Bus_febrer+2018.pdf/b1000930-9204-4f4b-b86b-576e8391588b"), MessageDigest.getInstance("MD5"));
        assertEquals("93941eae128061ebefd052ad90c1ebdc", checksum);
    }



}
