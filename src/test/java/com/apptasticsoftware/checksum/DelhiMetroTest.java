package com.apptasticsoftware.checksum;

import org.junit.Ignore;
import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class DelhiMetroTest {

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/Map-Bilingual-04102019.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("df8c25d8cc176881c849f751bfceb8d6", checksum);
    }

    @Test
    public void rapidMetroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/RapidMetroRouteMap.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("4e84ea188d3857f592544beeeae1eba6", checksum);
    }

    @Test
    public void airportExpressLine() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/airportlineimg.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("527d9ea1037cd6b964cb8e09c87e7d2c", checksum);
    }

    @Ignore("Slow")
    @Test
    public void airportExpressLinePdf() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/abc.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4020a512dd0878d9ebc0f478d4fc4573", checksum);
    }


}
