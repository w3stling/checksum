package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LyonTclTest {

    @Test
    void reinforcedLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2020-08/Plan_Lignes_Fortes_grand_format_092020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("99ef6a9a3943cd4130a7dfcdc7172fd3", checksum);
    }

    @Test
    void lyonVillebanne() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2021-08/Plan_Lyon-Villeurbanne_092021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("487e10878dcf2e592e1f29ac85e9b7eb", checksum);
    }

    @Test
    void agglomeration() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2021-08/Plan_Agglomeration_Lyonnaise_092021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6f18b2931e69f6c33eac74b7689517c1", checksum);
    }

    @Test
    void agglomerationAreaEast() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2021-08/Plan_AGGLO_EST_26082021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e9652b92891b69f1855ff486e45880c0", checksum);
    }

    @Test
    void southWestAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2021-08/Plan_AGGLO_OUEST_26082021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("55c22a071a883154412913c39164936c", checksum);
    }

    @Test
    void northAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2021-08/Plan_AGGLO_NORD_26082021.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("77ea6493f48991d6349eb32429820c04", checksum);
    }

    @Test
    void nightLines() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-09/DepliantPleineLune2019-ok.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2327a02b3d62b6e3e80c69f0a43f2d6c", checksum);
    }
}
