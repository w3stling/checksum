package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HkMtrTest {

    @Test
    void systemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.mtr.com.hk/archive/en/services/routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("28c90fd21a9dfb6b3d14c875acbd1888", checksum);
    }

    @Test
    void lightRailRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.mtr.com.hk/archive/en/services/LR_routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a5caede846e5dd7a6624424ee87ba8dc", checksum);
    }

    @Disabled("Investigating")
    @Test
    void westboundTramwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://hktramways.com/images/googleMap/HK-tram-route-map-WB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1d960b16b7c83a9c0af85a3efb777768", checksum);
    }

    @Disabled("Investigating")
    @Test
    void eastboundTramwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://hktramways.com/images/googleMap/HK-tram-route-map-EB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8db70ab801e9254e6f53ae3a769d69ad", checksum);
    }

    @Test
    void starferryRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.starferry.com.hk/sites/default/files/routemap.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("98e9d4e062cc5d25e9b29d4c3bf3ed23", checksum);
    }

}
