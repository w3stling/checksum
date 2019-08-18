package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class TokyoMetroTest {

    @Test
    public void metroMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tokyometro.jp/library_in/en/subwaymap/pdf/rosen_en_1803.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5ee097a75a9abfdac975cf25aef9053f", checksum);
    }

    @Test
    public void metroMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tokyometro.jp/station/rosen_jp_201904.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f1e20011d0991a18a5e0e0195765d64c", checksum);
    }

    @Test
    public void todenArakawaMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/eng/services/i/street_map_01.gif"), MessageDigest.getInstance("MD5"));
        assertEquals("8091e37a1838a07dfde584ea3b8b3cbc", checksum);
    }

    @Test
    public void todenArakawaMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/toden/map/i/index_map4.png"), MessageDigest.getInstance("MD5"));
        assertEquals("8576d9bd43a490a0b4da7226d290d941", checksum);
    }

    @Test
    public void nipporiToneriLinerMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/eng/services/i/liner_map_01.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("75199c49f69ac8c55e1478c2f1a8e485", checksum);
    }

    @Test
    public void nipporiToneriLinerMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/nippori_toneri/map/i/index_map.png"), MessageDigest.getInstance("MD5"));
        assertEquals("353ff2dae80e52d5b11764c61af3dc70", checksum);
    }

    @Test
    public void toeiRouteMapEn() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/eng/services/pdf/main_route_map_eng.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3eb9e2fb9e8e1f19ab048f304a7a717d", checksum);
    }

    @Test
    public void toeiRouteMapJp() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.kotsu.metro.tokyo.jp/subway/route_map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a1f98f669116bbd8bf0a2c584c88e712", checksum);
    }


}
