package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class LondonTflTest {

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4b7516bcd923f6ee73e378e75d067f2d", checksum);
    }

    @Test
    public void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-night-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4faf85e44fe7c4931abd7a2771e6f5d8", checksum);
    }

    @Test
    public void overgroundMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/london-overground-network-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dbc414c7bdd98e1d4bfd14d23a477cdb", checksum);
    }

    @Test
    public void dlrMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/dlr-route-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e3ccb5f54fea042cc72000acc38cca83", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/tram-service-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aa3b654447edb135ffa76ddc1bb91817", checksum);
    }

    @Test
    public void railMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/tfl-rail-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f4068c66a5de681e29e4c4b7e6a4f952", checksum);
    }

    @Test
    public void nationalRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-rail-and-tube-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0decc71599692163a0abf46806a91b7b", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/key-bus-routes-in-central-london.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("01e917561e3aeec7dbbe87f51c581002", checksum);
    }

    @Test
    public void riverMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/river-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1b90f8943a3e9561f88fc74a63c075c3", checksum);
    }



}
