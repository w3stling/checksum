package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

// https://www.metro.net/riding/guide/system-maps/
public class LosAngelesMetroRail {

    @Test
    public void metroAndBuswayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/8f0fe43e-da3b-4a10-bd8e-4cfd54e30eb3.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("54fc31198630a341bfe45e2f3df08b04", checksum);
    }

    @Test
    public void metroAndRegionalMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/90e3378c-e786-4cc7-8f4b-88fc15a4b3b3.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("96fc0769f187a72e8221255e5a4bfbeb", checksum);
    }

    @Test
    public void metroAndBuswayUnderConstructionMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/b6d676a6-d8f3-4bb9-88c2-97a7497ecf49.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f48be3fbba8e80b6108b5f5a43574a0a", checksum);
    }

    @Test
    public void busSystemOverviewMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/riding_metro/maps/images/4_17-3071_BLT_BusRailOverview.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5a2ef765217dbd983a173a8b0200d4e3", checksum);
    }

}
