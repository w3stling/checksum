package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class BerlinBvgTest {

    @Test
    public void undergroundBerlinABC() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=399"), MessageDigest.getInstance("MD5"));
        assertEquals("afea5204f29be1311ecd39994f3eb789", checksum);
    }

    @Test
    public void undergroundBerlinCityCenter() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=400"), MessageDigest.getInstance("MD5"));
        assertEquals("e10793bc0db8e6d849dffac9769821d8", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=401"), MessageDigest.getInstance("MD5"));
        assertEquals("14b9fc36348b875efebf01e4b3fa360f", checksum);
    }

    @Test
    public void busMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=3449"), MessageDigest.getInstance("MD5"));
        assertEquals("f3da757a00d0d790423b9c4d09dc0fc9", checksum);
    }

    @Test
    public void nightBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.bvg.de/de/index.php?section=downloads&cmd=58&download=398"), MessageDigest.getInstance("MD5"));
        assertEquals("1e4c4183df26cadf9275a705d642581c", checksum);
    }
}
