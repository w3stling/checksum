package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Disabled("Investigate")
class LyonTclTest {

    @Test
    void reinforcedLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2023-10/600PLF_LIGNES_FORTES_GD_FORMAT_1155x980mm.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7b9e8bb73cf1f2812abc7a1210fc9efe", checksum);
    }

    @Test
    void lyonVillebanne() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2023-10/113KSM_StationMetro_1100x900mm_LV_IMP600ex.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("44f89d42566cbc6137a0006de61c89ca", checksum);
    }

    @Test
    void agglomeration() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2023-10/203KSM_StationMetro_1100x900mm_AGGLOSCHEM_IMP400ex.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("6ad11d8992131d1c281abcad2440fc58", checksum);
    }

    @Test
    void agglomerationAreaEast() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2023-10/330A0_AGGLO_EST_Octobre2023.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9f3dccec0eb179b493d90ab5349ea7ab", checksum);
    }

    @Test
    void southWestAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2023-10/330A0_AGGLO_OUEST_Octobre2023.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("225e0ab09b0fe069c790b53d102b9366", checksum);
    }

    @Test
    void northAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2023-10/330A0_AGGLO_NORD_Octobre2023.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5aa21ff8435fe632d65ccc086148feed", checksum);
    }

    @Test
    void nightLines() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-09/DepliantPleineLune2019-ok.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2327a02b3d62b6e3e80c69f0a43f2d6c", checksum);
    }
}
