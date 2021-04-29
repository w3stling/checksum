package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;


public class NewYorkMtaTest {

    @Test
    public void subwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5256"), MessageDigest.getInstance("MD5"));
        assertEquals("0bda1680ece905af46d96371478d28bd", checksum);
    }

    @Test
    public void subwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5336"), MessageDigest.getInstance("MD5"));
        assertEquals("cbb24479dbfac931336e6864eef4625b", checksum);
    }

    @Test
    public void regionalDiagramMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new2.mta.info/sites/default/files/2018-09/180907-MTA-RTD_unlock.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0397e70d3706a637ede9fe797108ef04", checksum);
    }

    @Test
    public void busBrooklynMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5261"), MessageDigest.getInstance("MD5"));
        assertEquals("1879521d47dcc7f1d2ec0eefb7ac5767", checksum);
    }

    @Test
    public void busBronxMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5366"), MessageDigest.getInstance("MD5"));
        assertEquals("e29e0843dd40671dc9aa30bef537fcde", checksum);
    }

    @Test
    public void busManhattanMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5391"), MessageDigest.getInstance("MD5"));
        assertEquals("1c67550bc0cde236f4cc678d0152d58e", checksum);
    }

    @Test
    public void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5371"), MessageDigest.getInstance("MD5"));
        assertEquals("bb0ed73ff2d359d1262b1528514afb4b", checksum);
    }

    @Test
    public void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5376"), MessageDigest.getInstance("MD5"));
        assertEquals("4b2412718c48b9bb63b12aa8f93608ad", checksum);
    }

    @Test
    public void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5381"), MessageDigest.getInstance("MD5"));
        assertEquals("ca19a2595c9af491738ad921a11d0378", checksum);
    }

    @Test
    public void railLongIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/lirr/Timetable/SystemMap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2aeccc9e67f62d3a5d724a1c0d90d844", checksum);
    }

    @Test
    public void railMetroNorthMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/mnr/gifs/mnrmap.png"), MessageDigest.getInstance("MD5"));
        assertEquals("76a74c95e7e88e24fd1dc1b5ad4664cc", checksum);
    }

    @Test
    public void railStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/service/pdf/sircur.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("18f3cd80f60d48c44c0d2a4654083cbe", checksum);
    }

}
