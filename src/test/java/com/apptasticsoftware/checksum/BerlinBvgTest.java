package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class BerlinBvgTest {

    @Test
    void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:60a89e3b-f88d-4d48-b8a6-98ab340ada05/S+U-Bahn_07_2021-Internetversion-BVG.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a32356fb99ffd414beab6b67b24d59cd", checksum);
    }

    @Test
    void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:3f8025f2-285b-4fa0-8cef-72def24c6c21/Liniennetzplan_SUBahnnetz_mit_Regionalbahn_Tarifbereich_AB_Innenstadtausschnitt.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8bb20c81c29d3e6b81119214a647dd2f", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:d45105f2-6752-4ec5-b882-8936572053c3/TramMetro_12_2020-Internetversion.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1771a7625fe6e41934d58aaa8b614b2a", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:ee4647c3-ce1e-4b0a-9546-b1848b85ee7e/BVG_BusNetzABC_202104%20(1)%20(1).pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1b7a419c33e24b1ff4a75c6379461f0f", checksum);
    }

    @Test
    void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:b40725a3-1da0-4ca7-ad1f-a214eb2d7ffe/Nachtnetz_202104.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3e1cc7ecd6846b8c6bb7ecf5c2fe6fb7", checksum);
    }
}
