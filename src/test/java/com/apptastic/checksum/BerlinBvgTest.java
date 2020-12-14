package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BerlinBvgTest {

    @Test
    public void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=399"), MessageDigest.getInstance("MD5"));
        assertEquals("5eb162d203d20106f858cc138dda3f6e", checksum);
    }

    @Test
    public void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=400"), MessageDigest.getInstance("MD5"));
        assertEquals("16a1b2db6f1104073b01c209af3bf469", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=401"), MessageDigest.getInstance("MD5"));
        assertEquals("14b9fc36348b875efebf01e4b3fa360f", checksum);
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
