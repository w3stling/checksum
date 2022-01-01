package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockholmSlTest {

    @Test
    void allRailServicesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/SL_Sp%C3%A5rtrafik.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("af960ebefdab4158f02ef2f59e517ed2", checksum);
    }

    @Test
    void pendeltagMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Ptag.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7bd1cf3310bc90853f2acfc70e2d1e70", checksum);
    }

    @Disabled("Investigating")
    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Tub.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5de4c129461cd8f581bd263d069c69e0", checksum);
    }

    @Test
    void tramLidingoMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/LB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("698a6257fb1a142f6c5b544dec810453", checksum);
    }

    @Test
    void tramNockebybananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Nb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("58090a6915fa6c7092cee120c6a6a9a5", checksum);
    }

    @Test
    void tramNockebybananTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/NbTB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1107bfa6758a97f196be7b2ce898dc0f", checksum);
    }

    @Test
    void tramRoslagsbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Rb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dfec071e3fc0c1262c37e1a6e288a7ad", checksum);
    }

    @Test
    void tramSaltsjobananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/SB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ce62db544aa7d8f7483817b62e723d05", checksum);
    }

    @Test
    void tramCityMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Sparvag_city.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1f0bb1bce244cc47bb946258350e5857", checksum);
    }

    @Test
    void tramTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/tb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a16f8c23269b519761ef85df8b57ee78", checksum);
    }

    @Test
    void commuterFerryLinesLine80Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/globalassets/terminalkarta/linje80.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ceddc1dd7224ddb081d52545c2c2eff8", checksum);
    }

    @Test
    void commuterFerryLinesLine82Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/globalassets/terminalkarta/linje-82.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("65bb564894419e2003825f0efda85188", checksum);
    }

    @Test
    void commuterFerryLinesLine89Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/globalassets/terminalkarta/linje-89.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("077591b0bff7028fe5ee42e2d62b20b2", checksum);
    }

}
