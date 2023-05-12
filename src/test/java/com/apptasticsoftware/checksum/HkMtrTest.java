package com.apptasticsoftware.checksum;

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

        checksum = Checksum.calculate(new URI("http://hktramways.com/images/googleMap/HK-tram-route-map-WB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1d960b16b7c83a9c0af85a3efb777768", checksum);
    }

    @Test
    void eastboundTramwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://hktramways.com/images/googleMap/routeMapEB.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("411897bff81ff59cbc8c9ceb31d8046c", checksum);

        checksum = Checksum.calculate(new URI("http://hktramways.com/images/googleMap/HK-tram-route-map-EB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8db70ab801e9254e6f53ae3a769d69ad", checksum);
    }

    @Test
    void starferryRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.starferry.com.hk/sites/default/files/map.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("a5d6b27ef397fd904dafbbd7defd9f65", checksum);
    }

}
