package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;


// https://www.metro.net/riding/guide/system-maps/
class LaMetroRailTest {

    @Test
    void metroAndBuswayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/8f0fe43e-da3b-4a10-bd8e-4cfd54e30eb3.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f880b7115d6dbe4d7b53cde94dadc3d9", checksum);
    }

    @Test
    void metroAndRegionalMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/90e3378c-e786-4cc7-8f4b-88fc15a4b3b3.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("58f6ead0e3a9a6a30c658ea573af99e4", checksum);
    }

    @Test
    void metroAndBuswayUnderConstructionMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/b6d676a6-d8f3-4bb9-88c2-97a7497ecf49.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3363e70aedc645cee05e17716743e26c", checksum);
    }

    @Disabled("Investigating")
    @Test
    void busSystemOverviewMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metro.net/riding_metro/maps/images/4_17-3071_BLT_BusRailOverview.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5a2ef765217dbd983a173a8b0200d4e3", checksum);
    }

    @Test
    void busSystemDetailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/a5e11b4f-11ac-4807-8cd2-0e7cff6aa94e.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7c3ab368ee930ae90e8d018280140b3a", checksum);
    }

    @Test
    void downtownMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://media.metro.net/documents/742b6116-1c6a-47af-93f3-514cbc8a4fb8.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1383396bcc79b695ec97df3ee7dd916b", checksum);
    }

    @Test
    void regionalSanFernandoValleyMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.dropbox.com/s/fufggqd4s9h4fv2/23-3109_web_MSysMap4_SanFernValley_35x17_DCR.pdf?raw=1"), MessageDigest.getInstance("MD5"));
        assertEquals("2d52ee4474856bf8b919b55b36c0529a", checksum);
    }

    @Test
    void regionalSanGabrielValleyMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.dropbox.com/s/z815hbvsy3uuvdw/23-3110_web_MSysMap1_SanGabrValley_35x17_DCR.pdf?raw=1"), MessageDigest.getInstance("MD5"));
        assertEquals("fba0228d1fcc3c19b7fd8f2bb976677b", checksum);
    }


    @Test
    void regionalSouthBayGatewayCitiesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.dropbox.com/s/apviq8rzp11e3ff/23-3108_web_MSysMap3_SoBayGateway_35x17_DCR.pdf?raw=1"), MessageDigest.getInstance("MD5"));
        assertEquals("8948ab00b3b42239fc9e58a00f3b2493", checksum);
    }


    @Test
    void regionalWestsideCentralMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.dropbox.com/s/t3xk9mbe09o2n3p/23-3107_web_MSysMap_CenLAWestside_35x17_DCR.pdf?raw=1"), MessageDigest.getInstance("MD5"));
        assertEquals("f02dfc5138b51571f31fc0de72195b16", checksum);
    }


    @Test
    void metroLinkAllConnectionsMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://metrolinktrains.com/globalassets/maps/metrolink-map---all-connections.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("bf05e4d61637b757862d866b5dda85ca", checksum);
    }

    @Test
    void metroSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://metrolinktrains.com/globalassets/maps/cc_metrolink_system-map---updated-04.24.23-.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("833f69a992bd6e38cb7acf63809decb7", checksum);
    }

}
