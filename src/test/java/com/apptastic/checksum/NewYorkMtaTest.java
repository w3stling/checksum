package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;


public class NewYorkMtaTest {

    @Test
    public void subwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/maps/Large_Print_Map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b9502ab6a9736cb34f0fd4f39d63a000", checksum);
    }

    @Test
    public void subwayMapWithStreets() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/maps/subway_map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ea3cbd6c83eeea3b7b4700d9c1d7b358", checksum);
    }

    @Test
    public void subwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/maps/night_map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("95072e58ad0fa313acc70f212fa92153", checksum);
    }

    @Test
    public void regionalDiagramMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/maps/RegionalDiagram.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("295ffdf8e0b4219130b509135cd56832", checksum);
    }

    @Test
    public void busBronxMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/maps/busbx.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3de40a49ee65390927f95c5258ef4ebe", checksum);
    }

    @Test
    public void busBrooklynMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/maps/busbkln.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2ac2b9d49a8401f2de9b9b395d446562", checksum);
    }

    @Test
    public void busManhattanMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/maps/manbus_2.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1e2868693cc0a9bf296a2a6dcf65a8e8", checksum);
    }

    @Test
    public void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/maps/busqns.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("20600ada59db2654e5287ef626701d7c", checksum);
    }

    @Test
    public void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/maps/bussi.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7d5d5f9e8631501dfa476d474d1352aa", checksum);
    }

    @Test
    public void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/maps/bussi_express.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("68ae1b347c640e4581cc0ae4c1eca4a5", checksum);
    }

    @Test
    public void railLongIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/lirr/Timetable/images/lirr.gif"), MessageDigest.getInstance("MD5"));
        assertEquals("debbca8555d3994d182036fd432e8b6a", checksum);
    }

    @Test
    public void railMetroNorthMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/mnr/gifs/mnrmap.png"), MessageDigest.getInstance("MD5"));
        assertEquals("e8855dd7971b1201fe89562481a28a0a", checksum);
    }

    @Test
    public void railStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/service/pdf/sircur.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("18f3cd80f60d48c44c0d2a4654083cbe", checksum);
    }

}
