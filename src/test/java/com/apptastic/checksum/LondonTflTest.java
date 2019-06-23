package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class LondonTflTest {

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/standard-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("bca907493630467d7fbe5039367a6fbf", checksum);
    }

    @Test
    public void overgroundMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-overground-network-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dbc414c7bdd98e1d4bfd14d23a477cdb", checksum);
    }

    @Test
    public void dlrMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/dlr-route-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e3ccb5f54fea042cc72000acc38cca83", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/tram-service-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aa3b654447edb135ffa76ddc1bb91817", checksum);
    }

    @Test
    public void railAndTubeMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-rail-and-tube-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ad71704df68d882520a8281b98569257", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/key-bus-routes-in-central-london.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d78a62abb07fb9f521369450b9b7c150", checksum);
    }

    @Test
    public void riverMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/river-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("31f57bfdd9afe3241df71665ce73f779", checksum);
    }



}
