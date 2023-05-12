package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TokyoMetroTest {

    @Test
    void metroMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tokyometro.jp/lang_en/station/202303_number_en.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a9f627becc66701c780ace6aa95902b8", checksum);
    }

    @Test
    void metroMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tokyometro.jp/station/202303_number_ja.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5a9461a67533df202b8ad5db6037dbc4", checksum);
    }

    @Test
    void todenArakawaMapEn() throws Exception {
            String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/eng/maps/images/street_map_01.gif"), MessageDigest.getInstance("MD5"));
        assertEquals("8091e37a1838a07dfde584ea3b8b3cbc", checksum);
    }

    @Test
    void todenArakawaMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/toden/map/i/index_map4.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("96a8d40e958b9bf7b66f90cd7a9f0c77", checksum);
    }

    @Test
    void nipporiToneriLinerMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/eng/maps/images/liner_map_01.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("579f2bbc864e66124b6e5468d2d46b35", checksum);
    }

    @Test
    void nipporiToneriLinerMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/nippori_toneri/map/i/index_map.png"), MessageDigest.getInstance("MD5"));
        assertEquals("374769bd36490dced99675a889ccffde", checksum);
    }

    @Test
    void toeiRouteMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/eng/services/pdf/main_route_map_eng.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("98e489eb67752d245714003b06eb2464", checksum);
    }

    @Test
    void toeiRouteMapJp() throws Exception {
        // Not updated for a long time
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/subway/route_map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a1f98f669116bbd8bf0a2c584c88e712", checksum);
    }

    @Test
    void toeiBusRouteMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/bus/routes/common/pdf/toeibus_routemap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7fbb35b1a186aa304824732e4a10030d", checksum);
    }
}
