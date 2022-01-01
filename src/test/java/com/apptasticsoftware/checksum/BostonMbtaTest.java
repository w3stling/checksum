package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BostonMbtaTest {

    @Test
    void subwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/subway-map"), MessageDigest.getInstance("MD5"));
        assertEquals("3733f53589cb96b2e3f158834e58b1a5", checksum);
    }

    @Test
    void commuterRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map"), MessageDigest.getInstance("MD5"));
        assertEquals("7ee1750a593e5fea65d55d3f9130cb44", checksum);
    }

    @Test
    void commuterRailZonesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map-zones"), MessageDigest.getInstance("MD5"));
        assertEquals("d20a0107726f4ba43b1cb3af9a380dae", checksum);
    }

    @Test
    void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/ferry-map"), MessageDigest.getInstance("MD5"));
        assertEquals("67112361d2abb8c215869922e2e7a264", checksum);
    }

    @Test
    void BusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/bus-map"), MessageDigest.getInstance("MD5"));
        assertEquals("67939671f11afdd5b7bafddf519bd567", checksum);
    }

}
