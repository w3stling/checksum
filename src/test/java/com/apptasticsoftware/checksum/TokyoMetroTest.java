package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TokyoMetroTest {

    @Test
    void metroMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tokyometro.jp/lang_en/station/202006_number_en.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("990a50d42c49f7a70138b6a7a6c60ab5", checksum);

        // Don't use this map
        checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/eng/services/pdf/sub_map_eng.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("06dce852802405a8163cfc706d0f810e", checksum);
    }

    @Test
    void metroMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tokyometro.jp/station/202006_number_ja.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e5ca04505d626c591a189c3c717e7cbd", checksum);
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
        assertEquals("75199c49f69ac8c55e1478c2f1a8e485", checksum);
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
