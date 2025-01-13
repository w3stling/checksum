package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class IstanbulMetroTest {

    @Test
    void railSystemsMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Rayl%C4%B1%20Sistemler%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("06eb20eeb80c46d50e10593419bc580c", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Tramvay%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9e43ece291b3c711d7e0cfbd39b98bf6", checksum);
    }

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/%C4%B0stanbul%20Metro%20Hatlar%C4%B1%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("c261f554e8bbea8a09690b9514c02077", checksum);
    }

    @Test
    void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.istanbul/Content/assets/uploaded/Gece%20Metrosu%20Haritas%C4%B1.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("cf120ab2e4058fbffb124ca8fbf6cbcd", checksum);
    }
}
