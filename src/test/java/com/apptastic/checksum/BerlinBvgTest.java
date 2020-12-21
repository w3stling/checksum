package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BerlinBvgTest {

    @Test
    public void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=399"), MessageDigest.getInstance("MD5"));
        assertEquals("44bbcae10cd2868918138b82713b9548", checksum);
    }

    @Test
    public void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=400"), MessageDigest.getInstance("MD5"));
        assertEquals("75a740659c8ee8c909e90be5f1485a1a", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=401"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=3449"), MessageDigest.getInstance("MD5"));
        assertEquals("e04d0a1a85bebea9c52a7036c6a905e9", checksum);
    }

    @Test
    public void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=398"), MessageDigest.getInstance("MD5"));
        assertEquals("7722da0d84bcb920c51c9f7a41765f11", checksum);
    }
}
