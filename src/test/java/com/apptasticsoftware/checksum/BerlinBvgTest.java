package com.apptasticsoftware.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BerlinBvgTest {

    @Test
    public void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:60a89e3b-f88d-4d48-b8a6-98ab340ada05/S+U-Bahn_07_2021-Internetversion-BVG.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2e5f5d2088bbb6b7af163d559916c928", checksum);
    }

    @Test
    public void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:3f8025f2-285b-4fa0-8cef-72def24c6c21/Liniennetzplan_SUBahnnetz_mit_Regionalbahn_Tarifbereich_AB_Innenstadtausschnitt.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e10793bc0db8e6d849dffac9769821d8", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:d45105f2-6752-4ec5-b882-8936572053c3/TramMetro_12_2020-Internetversion.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("14b9fc36348b875efebf01e4b3fa360f", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:ee4647c3-ce1e-4b0a-9546-b1848b85ee7e/BVG_BusNetzABC_202104%20(1)%20(1).pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f3da757a00d0d790423b9c4d09dc0fc9", checksum);
    }

    @Test
    public void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/dam/jcr:b40725a3-1da0-4ca7-ad1f-a214eb2d7ffe/Nachtnetz_202104.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1e4c4183df26cadf9275a705d642581c", checksum);
    }
}
