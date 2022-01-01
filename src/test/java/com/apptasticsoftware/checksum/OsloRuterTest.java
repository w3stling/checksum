package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OsloRuterTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/t-bane/t-banen-linjekart-03042016.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4de147650b6e26481816a9fc17f03d28", checksum);
    }

    @Test
    void tramMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/trikk/trikk-linjekart-09082021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4f7f29bc39e5b316498ed3523c17fa2d", checksum);
    }

    @Test
    void busMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/buss-oslo-linjekart-09082021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("70c2c7386e6ae4c4cee2c86846410487", checksum);
    }

    @Test
    void nightBusMapInOslo() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-oslo/linjekart/nattbuss-oslo-linjekart-02012021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f222381b5cda6366882601201885ac5d", checksum);
    }

    @Test
    void nightBusAndFerryMapInAkershus() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/buss-akershus/linjekart/nattbuss-akershus-linjekart-28062020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("34cf6e8d0e491d2990efd1d345b6fefd", checksum);
    }

    @Test
    void ferryMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://ruter.no/globalassets/rutetabeller/bat/baat-linjekart-01112021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dce9fb49c6a1113bc015ffe451234618", checksum);
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
