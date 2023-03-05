package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LondonTflTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("89c6cb1985f59d34a84e1e510ad3011c", checksum);
    }

    @Test
    void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-night-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e53a8156c482ea767cf2d5d94d1d0f8e", checksum);
    }

    @Test
    void overgroundMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/london-overground-network-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6f6607fd88fdf2391f6b3d7cee6707ee", checksum);
    }

    @Test
    void dlrMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/dlr-route-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ab2dfe13f5f4f654a0e21a7065ea8752", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/tram-service-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aa3b654447edb135ffa76ddc1bb91817", checksum);
    }

    @Test
    void elizabethLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/elizabeth-line-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("63c1d826beb5900b436b1f619bd0abaf", checksum);
    }

    @Test
    void nationalRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-rail-and-tube-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f76fd858dd3ff2a0e963ed807b245cf1", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/key-bus-routes-in-central-london.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("01e917561e3aeec7dbbe87f51c581002", checksum);
    }

    @Test
    void riverMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/riverservices-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("90eeef4e849d0f237b6e1cb7a1280306", checksum);
    }

}
