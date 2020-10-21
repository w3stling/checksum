package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BerlinBvgTest {

    @Test
    public void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=399"), MessageDigest.getInstance("MD5"));
        assertEquals("8374e7e667b08d6a6cd6bbc1088f1643", checksum);
    }

    @Test
    public void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=400"), MessageDigest.getInstance("MD5"));
        assertEquals("7ec6a691ddeab9045bb6e5c90cf67f83", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=401"), MessageDigest.getInstance("MD5"));
        assertEquals("9cef908eb23c1e1fa649aea68ab43326", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=3449"), MessageDigest.getInstance("MD5"));
        assertEquals("8a55d22d283d7765af74867942296017", checksum);
    }

    @Test
    public void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=398"), MessageDigest.getInstance("MD5"));
        assertEquals("c6941da815323ca9e4ee256ee060f7df", checksum);
    }
}
