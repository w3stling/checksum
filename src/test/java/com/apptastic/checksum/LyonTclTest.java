package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class LyonTclTest {

    @Test
    public void reinforcedLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-11/PLF_Nov2019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7c6364945f3d52e9322f96e0a8e1e1f4", checksum);
    }

    @Test
    public void lyonVillebanne() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-11/LV_Nov2019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("1b8af246f0e943219533a9da75d90a68", checksum);
    }

    @Test
    public void agglomeration() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-11/AggloLyonnaise_Nov2019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("390b70d496db1c94b515b4a0219d9827", checksum);
    }

    @Test
    public void agglomerationAreaEast() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-11/plans_agglo_Est.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aae6c5fe30511740f4b54922ca91416d", checksum);
    }

    @Test
    public void southWestAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-11/plans_agglo_Ouest.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ab1a17fc96f4c4a9a5f0f9230844e040", checksum);
    }

    @Test
    public void northAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-11/plans_agglo_Nord.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("45bff75c199c1896825cf1e1c24fd153", checksum);
    }

    @Test
    public void nightLines() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-09/DepliantPleineLune2019-ok.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2327a02b3d62b6e3e80c69f0a43f2d6c", checksum);
    }
}
