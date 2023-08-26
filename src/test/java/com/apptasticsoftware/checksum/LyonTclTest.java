package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Investigate")
class LyonTclTest {

    @Test
    void reinforcedLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2022-08/Plan_LIGNES-FORTES_ao%C3%BBt22.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4cb07e7467161bb193a1c0ac54ed7023", checksum);
    }

    @Test
    void lyonVillebanne() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2022-09/Plan_Lyon-Villeurbanne_ao%C3%BBt22_0.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("683b60f1a41c1d7ea21e5978e4957f8e", checksum);
    }

    @Test
    void agglomeration() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2022-09/Plan_Agglo-lyon_ao%C3%BBt22_0.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("344191e322e8ac8763b8b6f31ca2c2a7", checksum);
    }

    @Test
    void agglomerationAreaEast() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2022-08/Plan_AGGLO-EST_ao%C3%BBt22.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a5fddfc3f7a7874e1c9b6cd3ec559f37", checksum);
    }

    @Test
    void southWestAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2022-08/Plan_AGGLO-OUEST_ao%C3%BBt22.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6b274b13b603cc7c096bd1e11adb7dc9", checksum);
    }

    @Test
    void northAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2022-08/Plan_AGGLO-NORD_ao%C3%BBt22.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("eda3549b89f9253e0adfc352ced856e8", checksum);
    }

    @Test
    void nightLines() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-09/DepliantPleineLune2019-ok.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2327a02b3d62b6e3e80c69f0a43f2d6c", checksum);
    }
}
