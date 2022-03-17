package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DelhiMetroTest {

    @Disabled("Investigating")
    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/Map-Bilingual-04102019.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("1e71d0816cdfd688c8693b3b0ba074dd", checksum);
    }

    @Disabled("Investigating")
    @Test
    void rapidMetroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/RapidMetroRouteMap.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("1e71d0816cdfd688c8693b3b0ba074dd", checksum);
    }

    @Disabled("Investigating")
    @Test
    void airportExpressLine() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/airportlineimg.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("1e71d0816cdfd688c8693b3b0ba074dd", checksum);
    }

    @Disabled("Slow")
    @Test
    void airportExpressLinePdf() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/abc.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a8fbfd2ffab9052290273a3aac021aad", checksum);
    }


}
