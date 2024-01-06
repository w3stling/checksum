package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockholmSlTest {

    @Test
    void allRailServicesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/7bf3767b47ed44ff98b06403c08eaa6b/sl-spartrafik.png"), MessageDigest.getInstance("MD5"));
        assertEquals("68c2737412a8c869d44ef9e6aa845448", checksum);
    }

    @Test
    void tramLidingoMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/7bf3767b47ed44ff98b06403c08eaa6b/lidingobanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("06ea3b214891568897ce5870c9663f46", checksum);
    }

    @Test
    void tramNockebybananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/7bf3767b47ed44ff98b06403c08eaa6b/nockebybanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("16b6f0683661a376a3b85321019e9e11", checksum);
    }

    @Test
    void tramRoslagsbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/7bf3767b47ed44ff98b06403c08eaa6b/roslagsbanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("ebcff0d6c98d23d5d786b439d595a140", checksum);
    }

    @Test
    void tramSaltsjobananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/7bf3767b47ed44ff98b06403c08eaa6b/saltsjobanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("1475f82219758a57f690bdc8a88e09e1", checksum);
    }

    @Test
    void tramCityMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/7bf3767b47ed44ff98b06403c08eaa6b/sparvag-city.png"), MessageDigest.getInstance("MD5"));
        assertEquals("4b086fcbf14903a515504019d72e62d1", checksum);
    }

    @Test
    void tramTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/7bf3767b47ed44ff98b06403c08eaa6b/tvarbanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("6e1982e802c7909d90b1f2ba7cd5bb60", checksum);
    }

    @Test
    void commuterFerryLinesLine80Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/03df56ce34df4a0b9cb6543866a81c50/linje80.png"), MessageDigest.getInstance("MD5"));
        assertEquals("9757bb5ca141774ee7eaae0ab9806c70", checksum);
    }

    @Test
    void commuterFerryLinesLine82Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/03df56ce34df4a0b9cb6543866a81c50/linje82.png"), MessageDigest.getInstance("MD5"));
        assertEquals("5625af8bb6058aa48b25f98d4a1dfbe8", checksum);
    }

    @Test
    void commuterFerryLinesLine83Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/03df56ce34df4a0b9cb6543866a81c50/linje83.png"), MessageDigest.getInstance("MD5"));
        assertEquals("491e344795535782eae1c9cc3dacdfd5", checksum);
    }

    @Test
    void commuterFerryLinesLine89Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://sl.se/contentassets/03df56ce34df4a0b9cb6543866a81c50/linje89.png"), MessageDigest.getInstance("MD5"));
        assertEquals("115f12afd64e7330336730ddae58d673", checksum);
    }

}
