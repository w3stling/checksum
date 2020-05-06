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
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/trikk/trikk-linjekart-03052020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("eaecd419e8355473f706113550e7175b", checksum);
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
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-akershus/linjekart/nattbuss-akershus-linjekart-05072019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2002d01e104ecb9193fdb5e1adf706b4", checksum);
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
        assertEquals("24b1a7383f3389fee90e62e94fc01d2d", checksum);
    }
}
