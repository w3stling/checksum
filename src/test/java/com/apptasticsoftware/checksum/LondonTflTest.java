package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LondonTflTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8548f6f8684299ec9efdceb3ed97ee7e", checksum);
    }

    @Test
    void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-night-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6e79244cd694efbedeed8ab40b8c1b59", checksum);
    }

    @Test
    void overgroundMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/london-overground-network-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dbc414c7bdd98e1d4bfd14d23a477cdb", checksum);
    }

    @Test
    void dlrMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/dlr-route-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e3ccb5f54fea042cc72000acc38cca83", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/tram-service-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aa3b654447edb135ffa76ddc1bb91817", checksum);
    }

    @Test
    void railMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/tfl-rail-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f4068c66a5de681e29e4c4b7e6a4f952", checksum);
    }

    @Test
    void nationalRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-rail-and-tube-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a7cdd2861c4349685c4c843f4f315609", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/key-bus-routes-in-central-london.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("01e917561e3aeec7dbbe87f51c581002", checksum);
    }

    @Test
    void riverMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/riverservices-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8a49d9edc38b17bea65a713f3855bee0", checksum);
    }

}
