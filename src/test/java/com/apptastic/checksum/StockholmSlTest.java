package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class StockholmSlTest {

    @Test
    public void allRailServicesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/SL_Sp%C3%A5rtrafik.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("061ac92473d88c25862996eb9615d179", checksum);
    }

    @Test
    public void pendeltagMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Ptag.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1bb8c5906dd4fad4aef8ade38072e40a", checksum);
    }

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Tub.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5de4c129461cd8f581bd263d069c69e0", checksum);
    }

    @Test
    public void tramLidingoMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/LB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("698a6257fb1a142f6c5b544dec810453", checksum);
    }

    @Test
    public void tramNockebybananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Nb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("58090a6915fa6c7092cee120c6a6a9a5", checksum);
    }

    @Test
    public void tramNockebybananTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/NbTB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1107bfa6758a97f196be7b2ce898dc0f", checksum);
    }

    @Test
    public void tramRoslagsbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Rb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dfec071e3fc0c1262c37e1a6e288a7ad", checksum);
    }

    @Test
    public void tramSaltsjobananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/SB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ce62db544aa7d8f7483817b62e723d05", checksum);
    }

    @Test
    public void tramCityMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/Sparvag_city.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1f0bb1bce244cc47bb946258350e5857", checksum);
    }

    @Test
    public void tramTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/ficktid/karta/vinter/tb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a16f8c23269b519761ef85df8b57ee78", checksum);
    }

    @Test
    public void commuterFerryLinesLine80Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://mitt.sl.se/globalassets/terminalkarta/linje80.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ceddc1dd7224ddb081d52545c2c2eff8", checksum);
    }

    @Test
    public void commuterFerryLinesLine82Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/globalassets/terminalkarta/linje-82.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("65bb564894419e2003825f0efda85188", checksum);
    }

    @Test
    public void commuterFerryLinesLine89Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/globalassets/terminalkarta/linje-89.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("077591b0bff7028fe5ee42e2d62b20b2", checksum);
    }

}
