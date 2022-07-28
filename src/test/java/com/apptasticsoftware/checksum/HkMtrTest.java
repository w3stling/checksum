package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HkMtrTest {

    @Test
    void systemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mtr.com.hk/archive/en/services/routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("28c90fd21a9dfb6b3d14c875acbd1888", checksum);
    }

    @Test
    void lightRailRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mtr.com.hk/archive/en/services/LR_routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a5caede846e5dd7a6624424ee87ba8dc", checksum);
    }

    @Test
    void westboundTramwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://hktramways.com/images/googleMap/routeMapWB.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("da6a7e630e40e0d378d120da2d32b77d", checksum);
    }

    @Test
    void eastboundTramwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://hktramways.com/images/googleMap/routeMapEB.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("411897bff81ff59cbc8c9ceb31d8046c", checksum);
    }

    @Disabled("Investigating")
    @Test
    void starferryRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.starferry.com.hk/sites/default/files/routemap.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("98e9d4e062cc5d25e9b29d4c3bf3ed23", checksum);
    }

}
