package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.tcl.fr/en/pdf-plans
class LyonTclTest {

    @Test
    void reinforcedLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2025-08/LIGNES_FORTES.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9a316c83b86129ef3a4e78a5e6b7dffc", checksum);
    }

    @Test
    void lyonVillebanne() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2025-08/StationMetro-LV_%202025.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("16807b839d6b942b0c7e8db940962056", checksum);
    }

    @Test
    void agglomeration() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2025-08/StationMetro_AGGLO_%202025.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b2b876929c6847ac4801907ea1bccd26", checksum);
    }

    @Test
    void agglomerationAreaEast() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2025-08/Plan%20AGGLO_EST_2025.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2965bfa67d9eac060e534e4c5c00e7f7", checksum);
    }

    @Test
    void southWestAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2023-10/330A0_AGGLO_OUEST_Octobre2023.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("225e0ab09b0fe069c790b53d102b9366", checksum);
    }

    @Test
    void northAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2025-08/310AN_AGGLO_NORD_2025_WEB.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("70c3af6eea609618fad50656b1395729", checksum);
    }

    @Test
    void nightLines() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2025-08/TCL_PleineLune_2025.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5855cedbba89d8e1feeda949839f9550", checksum);
    }
}
