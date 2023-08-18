package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//https://www.bvg.de/en/connections/network-maps-and-routes

@Disabled
class BerlinBvgTest {

    @Test
    void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:60a89e3b-f88d-4d48-b8a6-98ab340ada05/S+U-Bahn_07_2021-Internetversion-BVG.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("58eb23cb11c78a421e1f013ed69f16ac", checksum);
    }

    @Test
    void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:3f8025f2-285b-4fa0-8cef-72def24c6c21/Liniennetzplan_SUBahnnetz_mit_Regionalbahn_Tarifbereich_AB_Innenstadtausschnitt.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("fd4ec8428dd6ad06871bd33e12bb601b", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:d45105f2-6752-4ec5-b882-8936572053c3/TramMetro_12_2020-Internetversion.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aae07dc55eb558fd792188fe387d32ab", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:ee4647c3-ce1e-4b0a-9546-b1848b85ee7e/BVG_BusNetzABC_202104%20(1)%20(1).pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("193a2b79e8a7bbe6d36600dd7c031c75", checksum);
    }

    @Test
    void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:b40725a3-1da0-4ca7-ad1f-a214eb2d7ffe/Nachtnetz_202104.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8c318c1166b037978154a4c6cc8a5f0b", checksum);
    }
}
