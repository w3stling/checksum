package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;


public class NewYorkMtaTest {

    @Test
    public void subwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/2019-07/subway_map_large_print_web.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("cfb4a1aa781bee2cb80a636547b16f9d", checksum);
    }

    @Test
    public void subwayMapWithStreets() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/2019-07/subway_map_web_2.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ec5cfa855b2e75581185717587e39694", checksum);
    }

    @Test
    public void subwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/2019-07/subway_night_map_web.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("137debd9dfc7b4222c5d3467728d76da", checksum);
    }

    @Test
    public void regionalDiagramMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new2.mta.info/sites/default/files/2018-09/180907-MTA-RTD_unlock.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0397e70d3706a637ede9fe797108ef04", checksum);
    }

    @Test
    public void busBronxMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/pdf/busbx.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3de40a49ee65390927f95c5258ef4ebe", checksum);
    }

    @Test
    public void busBrooklynMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/pdf/busbkln_2.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2ac2b9d49a8401f2de9b9b395d446562", checksum);
    }

    @Test
    public void busManhattanMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/pdf/manbus_4.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f0cf42cf6031c416785556a1645634c0", checksum);
    }

    @Test
    public void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/pdf/busqns_3.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("bf59b615b4c2a6665e5a69a0ac61d64b", checksum);
    }

    @Test
    public void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/2019-04/statenislandbusmapweb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7d5d5f9e8631501dfa476d474d1352aa", checksum);
    }

    @Test
    public void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/sites/default/files/2019-04/SIExpressBusMap.pdf"), MessageDigest.getInstance("MD5"));
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
