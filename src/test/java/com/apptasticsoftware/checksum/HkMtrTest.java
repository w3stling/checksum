package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HkMtrTest {

    @Test
    void systemMap() throws Exception {
        // https://www.mtr.com.hk/en/customer/services/system_map.html
        String checksum = Checksum.calculate(new URI("https://www.mtr.com.hk/archive/en/services/routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ce189e23d1a033a456eb09c025a32339", checksum);
    }

    @Test
    void lightRailRouteMap() throws Exception {
        // https://www.mtr.com.hk/en/customer/services/routemap_index.html
        String checksum = Checksum.calculate(new URI("https://www.mtr.com.hk/archive/en/services/LR_routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a5caede846e5dd7a6624424ee87ba8dc", checksum);
    }

    @Test
    void westboundTramwayMap() throws Exception {
        // https://hktramways.com/en/interactive-map/
        String checksum = Checksum.calculate(new URI("https://hktramways.com/images/googleMap/routeMapWB.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("e7a48ca5312e00c15cc773b121693d24", checksum);

        checksum = Checksum.calculate(new URI("https://hktramways.com/images/googleMap/HK-tram-route-map-WB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("bd2bbc8e368b5a56fa56905e192271e1", checksum);
    }

    @Test
    void eastboundTramwayMap() throws Exception {
        // https://hktramways.com/en/interactive-map/
        String checksum = Checksum.calculate(new URI("https://hktramways.com/images/googleMap/routeMapEB.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("924305cb73ed3659a453b89cc6c15c3d", checksum);

        checksum = Checksum.calculate(new URI("https://hktramways.com/images/googleMap/HK-tram-route-map-EB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a4620a0535223da71847a11fbea4df3c", checksum);
    }

    @Test
    void starferryRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.starferry.com.hk/sites/default/files/map.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("a5d6b27ef397fd904dafbbd7defd9f65", checksum);
    }

}
