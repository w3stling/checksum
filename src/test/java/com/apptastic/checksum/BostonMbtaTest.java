package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BostonMbtaTest {

    @Test
    public void subwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/subway-map"), MessageDigest.getInstance("MD5"));
        assertEquals("d5ae12cd1b99f30dafdb671df3db2152", checksum);
    }

    @Test
    public void commuterRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map"), MessageDigest.getInstance("MD5"));
        assertEquals("7ee1750a593e5fea65d55d3f9130cb44", checksum);
    }

    @Test
    public void commuterRailZonesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map-zones"), MessageDigest.getInstance("MD5"));
        assertEquals("b18039de00ad03f735ba027e296698b3", checksum);
    }

    @Test
    public void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/ferry-map"), MessageDigest.getInstance("MD5"));
        assertEquals("4d58aa70145afa7d50ebb81a2c6c86ee", checksum);
    }

    @Test
    public void downtownMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/system-map-downtown"), MessageDigest.getInstance("MD5"));
        assertEquals("bc14e78960de5f42688b769528c0ec91", checksum);
    }

    @Test
    public void fullSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/system-map"), MessageDigest.getInstance("MD5"));
        assertEquals("ca266ffc91c77118f447faf3338068fc", checksum);
    }

}
