package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewYorkMtaTest {

    @Test
    void subwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5256"), MessageDigest.getInstance("MD5"));
        assertEquals("4c9d82119fa9c02cb02f7525466116f4", checksum);
    }

    @Test
    void subwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5336"), MessageDigest.getInstance("MD5"));
        assertEquals("b7e08bf2c4d62b739335450d18fa451e", checksum);
    }

    @Test
    void regionalDiagramMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new2.mta.info/sites/default/files/2018-09/180907-MTA-RTD_unlock.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0397e70d3706a637ede9fe797108ef04", checksum);
    }

    @Test
    void busBrooklynMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5261"), MessageDigest.getInstance("MD5"));
        assertEquals("1080e9388afcf5c262aa27b5a1287459", checksum);
    }

    @Test
    void busBronxMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5366"), MessageDigest.getInstance("MD5"));
        assertEquals("351b1c50d0fecee296747710d6507535", checksum);
    }

    @Test
    void busManhattanMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5391"), MessageDigest.getInstance("MD5"));
        assertEquals("ce8583140f3f10494bb414acfedaa937", checksum);
    }

    @Test
    void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5371"), MessageDigest.getInstance("MD5"));
        assertEquals("49bc51ac1d40f5aec9c6fa68c457ad63", checksum);
    }

    @Test
    void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5376"), MessageDigest.getInstance("MD5"));
        assertEquals("4b2412718c48b9bb63b12aa8f93608ad", checksum);
    }

    @Test
    void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5381"), MessageDigest.getInstance("MD5"));
        assertEquals("ca19a2595c9af491738ad921a11d0378", checksum);
    }

    @Test
    void railLongIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/lirr/Timetable/SystemMap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("68145056049f27beb5b9c306ea5e31bc", checksum);
    }

    @Test
    void railMetroNorthMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/mnr/gifs/mnrmap.png"), MessageDigest.getInstance("MD5"));
        assertEquals("76a74c95e7e88e24fd1dc1b5ad4664cc", checksum);
    }

    @Test
    void railStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/service/pdf/sircur.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("18f3cd80f60d48c44c0d2a4654083cbe", checksum);
    }

}
