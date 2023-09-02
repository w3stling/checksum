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
        assertEquals("e0e8a5a02271666713a50b180248dda4", checksum);
    }

    @Test
    void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/ferry-map"), MessageDigest.getInstance("MD5"));
        assertEquals("9ad9b5eaea5336dda8de79494ce7aba2", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/bus-map"), MessageDigest.getInstance("MD5"));
        assertEquals("77af188d087f56f3dbc6b05db5504363", checksum);
    }

}
