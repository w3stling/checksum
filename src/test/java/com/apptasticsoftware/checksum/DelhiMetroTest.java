package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DelhiMetroTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/Map-Bilingual-04102019.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("4d31bb8b75c20e028b6c1cc6a9a40612", checksum);
    }

    @Test
    void rapidMetroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/RapidMetroRouteMap.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("4d31bb8b75c20e028b6c1cc6a9a40612", checksum);
    }

    @Test
    void airportExpressLine() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/airportlineimg.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("4d31bb8b75c20e028b6c1cc6a9a40612", checksum);
    }

    @Disabled("Slow")
    @Test
    void airportExpressLinePdf() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/abc.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4020a512dd0878d9ebc0f478d4fc4573", checksum);
    }


}
