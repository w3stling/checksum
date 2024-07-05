package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BostonMbtaTest {

    @Test
    void subwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/subway-map"), MessageDigest.getInstance("MD5"));
        assertEquals("3dea0296dcded52d4e5373bf43ce600a", checksum);
    }

    @Test
    void commuterRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map"), MessageDigest.getInstance("MD5"));
        assertEquals("3e1fc00f09ec1d417813215fec561cf1", checksum);
    }

    @Test
    void commuterRailZonesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map-zones"), MessageDigest.getInstance("MD5"));
        assertEquals("30386e5c1947d1ae95a5d788f04f444a", checksum);
    }

    @Test
    void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/ferry-map"), MessageDigest.getInstance("MD5"));
        assertEquals("b3067b6fcc23139c68d10267c9867bfc", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/bus-map"), MessageDigest.getInstance("MD5"));
        assertEquals("1f3075574f4b3963b3d8111daa9464b4", checksum);
    }

}
