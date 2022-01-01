package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BerlinBvgTest {

    @Test
    void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:60a89e3b-f88d-4d48-b8a6-98ab340ada05/S+U-Bahn_07_2021-Internetversion-BVG.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8a2c520528df6fed50621dcb15a428ea", checksum);
    }

    @Test
    void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:3f8025f2-285b-4fa0-8cef-72def24c6c21/Liniennetzplan_SUBahnnetz_mit_Regionalbahn_Tarifbereich_AB_Innenstadtausschnitt.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("82944e894b0c72a6e2778cc27ef84ffe", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:d45105f2-6752-4ec5-b882-8936572053c3/TramMetro_12_2020-Internetversion.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("87b29c79cf1e14f17ae699ba3a14db0a", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:ee4647c3-ce1e-4b0a-9546-b1848b85ee7e/BVG_BusNetzABC_202104%20(1)%20(1).pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f3da757a00d0d790423b9c4d09dc0fc9", checksum);
    }

    @Test
    void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:b40725a3-1da0-4ca7-ad1f-a214eb2d7ffe/Nachtnetz_202104.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1e4c4183df26cadf9275a705d642581c", checksum);
    }
}
