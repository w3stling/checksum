package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class LondonTflTest {

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/standard-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d22592c4a26d6d6493fb2f6fb3cab931", checksum);
    }

    @Test
    public void overgroundMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-overground-network-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dbc414c7bdd98e1d4bfd14d23a477cdb", checksum);
    }

    @Test
    public void dlrMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/dlr-route-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("82ca7e38b34554e16a06c2f08daedc02", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/tram-service-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aa3b654447edb135ffa76ddc1bb91817", checksum);
    }

    @Test
    public void railAndTubeMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-rail-and-tube-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2e4f67bcb9f3df39baf367b9f7cd3d2f", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/key-bus-routes-in-central-london.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0377959117ef6cd45dceeb07dd84955e", checksum);
    }

    @Test
    public void riverMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/river-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("31f57bfdd9afe3241df71665ce73f779", checksum);
    }



}
