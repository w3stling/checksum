package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class HkMtrTest {

    @Test
    public void systemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.mtr.com.hk/archive/en/services/routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("68bc9714f01ee2cbc16c4511079098f0", checksum);
    }

    @Test
    public void lightRailRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.mtr.com.hk/archive/en/services/LR_routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b652b2cb5cc83870727ac75a74a3efb4", checksum);
    }

    @Test
    public void westboundTramwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://hktramways.com/images/googleMap/HK-tram-route-map-WB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1d960b16b7c83a9c0af85a3efb777768", checksum);
    }

    @Test
    public void eastboundTramwayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://hktramways.com/images/googleMap/HK-tram-route-map-EB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8db70ab801e9254e6f53ae3a769d69ad", checksum);
    }


    @Test
    public void starferryRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.starferry.com.hk/sites/default/files/routemap.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("98e9d4e062cc5d25e9b29d4c3bf3ed23", checksum);
    }

}
