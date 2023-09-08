package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarcelonaTmbTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tmb.cat/documents/20182/96078/Pl%C3%A0nol+xarxa+de+Metro/f5578f40-5a66-46ba-907c-cf31e0d368c0"), MessageDigest.getInstance("MD5"));
        assertEquals("7eafbd3bbb1d3275f9dd1f745e723530", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tmb.cat/documents/20182/96078/Pl%C3%A0nol+xarxa+bus.pdf/9b5bfa95-6117-4117-9843-fb3e3fde5447"), MessageDigest.getInstance("MD5"));
        assertEquals("8f8f96e6962d09f2d7523614b90ce818", checksum);
    }

    @Test
    void busNetworkMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tmb.cat/documents/20182/96078/Pl%C3%A0nol+Nova+Xarxa+de+Bus_octubre+2020.pdf/b1000930-9204-4f4b-b86b-576e8391588b"), MessageDigest.getInstance("MD5"));
        assertEquals("2010fd8fb3aa2e08d1923aa6c3e3abaa", checksum);
    }

}
