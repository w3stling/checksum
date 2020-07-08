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
        assertEquals("d44a202e7a4f70f19a0d58fbb2d7eaf8", checksum);
    }

    @Test
    public void commuterRailZonesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/cr-map-zones"), MessageDigest.getInstance("MD5"));
        assertEquals("afdf25e1d9c514e061f01dcdb2802833", checksum);
    }

    @Test
    public void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/ferry-map"), MessageDigest.getInstance("MD5"));
        assertEquals("4d58aa70145afa7d50ebb81a2c6c86ee", checksum);
    }

    @Test
    public void downtownMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/system-map-downtown"), MessageDigest.getInstance("MD5"));
        assertEquals("ddeeda679ebc37aa4d58cb42ece9ce25", checksum);
    }

    @Test
    public void fullSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/system-map"), MessageDigest.getInstance("MD5"));
        assertEquals("64d8545b836152146f635b9ad015d1a5", checksum);
    }

}
