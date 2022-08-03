package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LondonTflTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a6a09437e6ad88a20caacd28755c18df", checksum);
    }

    @Test
    void metroNightMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/standard-night-tube-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("cd71d57ddb54c0e272d825a1012e5b07", checksum);
    }

    @Test
    void overgroundMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/london-overground-network-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6f6607fd88fdf2391f6b3d7cee6707ee", checksum);
    }

    @Test
    void dlrMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/dlr-route-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ec51ec1809c7db10718e19d90ed2c5c9", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/tram-service-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aa3b654447edb135ffa76ddc1bb91817", checksum);
    }

    @Test
    void elizabethLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://tfl.gov.uk/cdn/static/cms/documents/elizabeth-line-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d25c6fd63f7f30ce230aa6037fe8c95d", checksum);
    }

    @Test
    void nationalRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://content.tfl.gov.uk/london-rail-and-tube-services-map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2df4de0647a2f9af97d4a01fa741ee25", checksum);
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
