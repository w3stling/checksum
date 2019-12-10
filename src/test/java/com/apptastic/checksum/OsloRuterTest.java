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
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/trikk/trikk-linjekart-28112019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("3d8a7ba4c7d5c7ec1bc0056441493a67", checksum);
    }

    @Test
    public void busMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/buss-oslo-linjekart-01072019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4d8559866217fa67df92625b7281e0b4", checksum);
    }

    @Test
    public void nightBusMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/nattbuss-oslo-linjekart-01012019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("82853e50ca99b850afa7686f39032fce", checksum);
    }

    @Test
    public void nightBusAndFerryMapInAkershus() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-akershus/linjekart/nattbuss-akershus-linjekart-05072019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2002d01e104ecb9193fdb5e1adf706b4", checksum);
    }

    @Test
    public void ferryB1Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/bat/b1-linjekart-vinter-01092019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8e2810902f2f665a6566c3eeeb6ea437", checksum);
    }

    @Test
    public void ferryB1B2B3B4Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/bat/b1-b2-b3-b4-linjekart-sommer-08062019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8d3f27e2032721dcebdf8b0f832ef657", checksum);
    }

    @Test
    public void trainRoutesInNorwayDetailed() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.vy.no/globalassets/vy.no/filer-no/linjekart/linjekart-vy-norge-detaljert.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f0283cd4427e7214b37255334f909884", checksum);
    }

    @Test
    public void trainRoutesInSoutheasternNorway() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.vy.no/globalassets/vy.no/filer-no/linjekart/linjekart-lokaltog-ostlandet.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("24b1a7383f3389fee90e62e94fc01d2d", checksum);
    }
}
