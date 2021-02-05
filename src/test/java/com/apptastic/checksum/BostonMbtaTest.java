package com.apptastic.checksum;

import org.junit.Ignore;
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
        assertEquals("0deead5ad8f269cd1f6d95a284e496ab", checksum);
    }

    @Ignore
    @Test
    public void downtownMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/system-map-downtown"), MessageDigest.getInstance("MD5"));
        assertEquals("ed8d13f384ee5fe021619172dcce6d69", checksum);
    }

    @Test
    public void fullSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.mbta.com/system-map"), MessageDigest.getInstance("MD5"));
        assertEquals("96f8fb237b2a509630ab1f6b648d61c7", checksum);
    }

}
