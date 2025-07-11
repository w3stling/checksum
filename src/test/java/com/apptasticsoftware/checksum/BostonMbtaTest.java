package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BostonMbtaTest {

    @Test
    void subwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/subway-map"), MessageDigest.getInstance("MD5"));
        assertEquals("273e085e2462937575bec1bdd819af09", checksum);
    }

    @Test
    void commuterRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map"), MessageDigest.getInstance("MD5"));
        assertEquals("f586a54a3824626c01348ce63c6850d2", checksum);
    }

    @Test
    void commuterRailZonesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map-zones"), MessageDigest.getInstance("MD5"));
        assertEquals("05637bbd19cad9a989c482bc13b8dd42", checksum);
    }

    @Test
    void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/ferry-map"), MessageDigest.getInstance("MD5"));
        assertEquals("6185520b15d09f340bcf765067e6d562", checksum);
    }

    @Test
    void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/bus-map"), MessageDigest.getInstance("MD5"));
        assertEquals("a1918b3e9f405a395be9713def03d298", checksum);
    }

}
