package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BerlinUndergroundTest {

    @Test
    public void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=399"), MessageDigest.getInstance("MD5"));
        assertEquals("183c2bc1d34d9ff8d828f38e0e1e27cd", checksum);
    }

    @Test
    public void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=400"), MessageDigest.getInstance("MD5"));
        assertEquals("027ecc825743c6ed34d6034879a65c22", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=401"), MessageDigest.getInstance("MD5"));
        assertEquals("d1b331a096c25f08ed615cfe73b5e39e", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=3449"), MessageDigest.getInstance("MD5"));
        assertEquals("b30bf8574b696ef507c01024e7076227", checksum);
    }

    @Test
    public void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=398"), MessageDigest.getInstance("MD5"));
        assertEquals("18ce0747afc28aa1785d28b3ed945bca", checksum);
    }
}
