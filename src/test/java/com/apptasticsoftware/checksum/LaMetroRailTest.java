package com.apptasticsoftware.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

// https://www.metro.net/riding/guide/system-maps/
public class LaMetroRailTest {

    @Test
    public void metroAndBuswayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/8f0fe43e-da3b-4a10-bd8e-4cfd54e30eb3.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f880b7115d6dbe4d7b53cde94dadc3d9", checksum);
    }

    @Test
    public void metroAndRegionalMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/90e3378c-e786-4cc7-8f4b-88fc15a4b3b3.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("58f6ead0e3a9a6a30c658ea573af99e4", checksum);
    }

    @Test
    public void metroAndBuswayUnderConstructionMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/b6d676a6-d8f3-4bb9-88c2-97a7497ecf49.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3363e70aedc645cee05e17716743e26c", checksum);
    }

    @Test
    public void busSystemOverviewMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.net/riding_metro/maps/images/4_17-3071_BLT_BusRailOverview.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5a2ef765217dbd983a173a8b0200d4e3", checksum);
    }

    @Test
    public void busSystemDetailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/a5e11b4f-11ac-4807-8cd2-0e7cff6aa94e.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7c3ab368ee930ae90e8d018280140b3a", checksum);
    }

    @Test
    public void downtownMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/742b6116-1c6a-47af-93f3-514cbc8a4fb8.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1383396bcc79b695ec97df3ee7dd916b", checksum);
    }

    @Test
    public void regionalSanFernandoValleyMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://media.metro.net/riding_metro/maps/images/san_fernando_valley.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b7d8955fda3969d6eab56bee9764128f", checksum);
    }

    @Test
    public void regionalSanGabrielValleyMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/riding_metro/maps/images/SanGabrielValley_2017-0523.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9a8abfa675badfd7eaead577653d68ae", checksum);
    }


    @Test
    public void regionalSouthBayGatewayCitiesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://media.metro.net/riding_metro/maps/images/south_bay.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("958862ba3609c5f6c1438eba693ba227", checksum);
    }


    @Test
    public void regionalWestsideCentralMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/riding_metro/maps/images/CentLAWestsd.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("36af39b22a51a694f6ba11c5439a2bc6", checksum);
    }

}
