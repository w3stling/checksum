package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class OsloRuterTest {

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/t-bane/t-banen-linjekart-03042016.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4de147650b6e26481816a9fc17f03d28", checksum);
    }

    @Test
    public void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/trikk/trikk-linjekart-04102020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f067d4cf0819c98e5615690bfa2e9caa", checksum);
    }

    @Test
    public void busMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/buss-oslo-linjekart-19082019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("edb0db66ccfdf4f8607857d0603df7c8", checksum);
    }

    @Test
    public void nightBusMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/nattbuss-oslo-linjekart-19082019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4f43fd84a9b2ef2d791628fba926d51d", checksum);
    }

    @Test
    public void nightBusAndFerryMapInAkershus() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-akershus/linjekart/nattbuss-akershus-linjekart-28062020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("34cf6e8d0e491d2990efd1d345b6fefd", checksum);
    }

    @Test
    public void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/bat/baat-linjekart-04112019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5b8d176c97aa6458df7c424c42e328a0", checksum);
    }

    @Test
    public void trainRoutesInNorwayDetailed() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.vy.no/globalassets/vy.no/filer-no/linjekart/linjekart-vy-norge-detaljert.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("27874fb18d06fe2b2b895275f92e4b6e", checksum);
    }

    @Test
    public void trainRoutesInSoutheasternNorway() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.vy.no/globalassets/vy.no/filer-no/linjekart/linjekart-lokaltog-ostlandet.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("215379af763a148f181b9b5b430b61bf", checksum);
    }
}
