package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class LyonTclTest {

    @Test
    public void reinforcedLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-06/Lignes%20fortes.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("fddab5ae57e1e46fd5900ca33fa76012", checksum);
    }

    @Test
    public void lyonVillebanne() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-06/Lyon%20-%20Villeurbanne.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("69f70bc0ef10e995bd98d1318a1076c0", checksum);
    }

    @Test
    public void agglomeration() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-06/Agglom%C3%A9ration.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2347c57fb5adc3a3ef4ae52a5d45f713", checksum);
    }

    @Test
    public void agglomerationAreaEast() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-06/Secteur%20agglom%C3%A9ration%20est.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f6c9f47fe995d2d75d7fa8f083e789a6", checksum);
    }

    @Test
    public void southWestAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-06/Secteur%20agglom%C3%A9ration%20sud-ouest.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("75a94e5304341c9c602357fa9983ea62", checksum);
    }

    @Test
    public void northAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-06/Secteur%20agglom%C3%A9ration%20nord.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("038dd7e8b23c26e5ee40b40acb9b08f1", checksum);
    }

    @Test
    public void nightLines() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-09/DepliantPleineLune2019-ok.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2327a02b3d62b6e3e80c69f0a43f2d6c", checksum);
    }
}
