package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;


// https://www.metro.net/riding/guide/system-maps/
// https://metrolinktrains.com/rider-info/general-info/maps/
class LaMetroRailTest {

    @Test
    void metroAndBuswayMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.dropbox.com/s/3aw64852ntyx380/23-1096_map_GM_Master_Jun23_DCR_final.pdf?raw=1"), MessageDigest.getInstance("MD5"));
        assertEquals("557b041ef34f165780c363f24f0f49b9", checksum);
    }

    @Test
    void busSystemDetailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.dropbox.com/s/rf7pwf7yclqgdqz/23-2445_blt_system_map_47x47.5_DCR-3.pdf?raw=1"), MessageDigest.getInstance("MD5"));
        assertEquals("aa40e7472e350d86dbbd50d32a6a2c35", checksum);
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
        String checksum = Checksum.calculate(new URI("https://metrolinktrains.com/globalassets/maps/map_allconnections_20231025_edit.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0e67baf91880a0354dc871d3703ef9ef", checksum);
    }

    @Test
    void metroLinkSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://metrolinktrains.com/globalassets/maps/cc_metrolink_system-map_2023_sept.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6d33da03b92deff988172496d84ea4a2", checksum);
    }

}
