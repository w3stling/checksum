package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class StockholmSlTest {

    @Test
    public void allRailServicesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/SL_Sp%C3%A5rtrafik.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("061ac92473d88c25862996eb9615d179", checksum);
    }

    @Test
    public void pendeltagMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/Ptag.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1bb8c5906dd4fad4aef8ade38072e40a", checksum);
    }

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/Tub.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("53520bd45960c1aab1738407ac4df750", checksum);
    }

    @Test
    public void tramLidingoMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/LB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("698a6257fb1a142f6c5b544dec810453", checksum);
    }

    @Test
    public void tramNockebybananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/Nb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("58090a6915fa6c7092cee120c6a6a9a5", checksum);
    }

    @Test
    public void tramNockebybananTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/NbTB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b866e37527781232d93eb5f6c3c19794", checksum);
    }

    @Test
    public void tramRoslagsbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/Rb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dc2005ffff944064b5078946c98d25fa", checksum);
    }

    @Test
    public void tramSaltsjobananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/SB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1af39feee5cda715150b789c31dc3ce1", checksum);
    }

    @Test
    public void tramCityMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/Sparvag_city.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1f0bb1bce244cc47bb946258350e5857", checksum);
    }

    @Test
    public void tramTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/tb.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a16f8c23269b519761ef85df8b57ee78", checksum);
    }

    @Test
    public void commuterFerryLinesLine80_82Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/globalassets/terminalkarta/linje8082.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("c0b0c43901313e5c0c53f344fa3590a8", checksum);
    }

    @Test
    public void commuterFerryLinesLine82Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/globalassets/terminalkarta/linje82.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("de4a07b95f69546cc1a3ba800e9e0446", checksum);
    }

    @Test
    public void commuterFerryLinesLine89Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/ficktid/karta/vinter/linje89.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f9c3bf68d31e1fc027d81cdb88047915", checksum);
    }

}
