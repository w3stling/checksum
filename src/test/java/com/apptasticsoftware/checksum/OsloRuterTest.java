package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class OsloRuterTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/t-bane/t-banen-linjekart-03042016.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4de147650b6e26481816a9fc17f03d28", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/trikk/trikk-linjekart-09082021-korr.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("fae7ba06743a7e0a53703f82c6a69225", checksum);
    }

    @Test
    void busMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/buss-oslo-linjekart-16042023.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5b7ead3e229ae3698cc36cad496ca399", checksum);
    }

    @Test
    void nightBusMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/nattbuss-oslo-linjekart-16042023.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("889095076b164c27170e3856e5e084b1", checksum);
    }

    @Test
    void nightBusAndFerryMapInAkershus() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-akershus/linjekart/nattbuss-region-linjekart-11122022.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6999f77b614f9fdfca39ada3de18674f", checksum);
    }

    @Test
    void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/bat/baat-linjekart-2023.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0f23d864e1937e172a206df7d5e6d2a0", checksum);
    }

    @Test
    void trainRoutesInNorwayDetailed() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.vy.no/globalassets/vy.no/filer-en/linjekart/nye-linjekart/linjekart-vy-norge2.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6a9e7d1fc5f42b6befb2fdb25a4a9619", checksum);
    }

    @Test
    void trainRoutesInSoutheasternNorway() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.vy.no/globalassets/vy.no/filer-en/linjekart/nye-linjekart/linjekart-lokaltog-ostlandet2.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("215379af763a148f181b9b5b430b61bf", checksum);
    }
}
