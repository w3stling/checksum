package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Investigating")
class DelhiMetroTest {

    @Test
    void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.delhimetrorail.com/static/media/Network-Map-24-May-2024-Bilingual.679eea07.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b4a5eccadb5d67e94d353148f18a288d", checksum);
    }

    @Test
    void rapidMetroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.delhimetrorail.com/media/images/RapidMetroRouteMap.original.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("507edaa4d35fb26a11feb7349f440066", checksum);
    }

    @Test
    void airportExpressLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.delhimetrorail.com/media/images/airportlineimg.original.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("8bcd3c071a247cd6dd0c906874e0bd45", checksum);
    }

    @Disabled("Slow")
    @Test
    void airportExpressLinePdf() throws Exception {
        String checksum = Checksum.calculate(new URI("https://backend.delhimetrorail.com/documents/1062/abc.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4020a512dd0878d9ebc0f478d4fc4573", checksum);
    }

}
