package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class LyonTclTest {

    @Test
    public void reinforcedLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2020-08/Plan_Lignes_Fortes_grand_format_092020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("99ef6a9a3943cd4130a7dfcdc7172fd3", checksum);
    }

    @Test
    public void lyonVillebanne() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2020-08/Lyon-Villeurbanne_092020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9017d62b2810b07299e29b6fd79291c7", checksum);
    }

    @Test
    public void agglomeration() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2020-08/Agglomeration_lyonnaise_092020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ca7283951ddca6893d694cedcc96fe79", checksum);
    }

    @Test
    public void agglomerationAreaEast() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2020-08/Plan_Secteur_Est_092020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0d337acf0a0fc1c59af7938c9a46e39c", checksum);
    }

    @Test
    public void southWestAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2020-08/Plan_Secteur_Ouest_092020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("46c5c620beee8d16a027f7dc030e81ed", checksum);
    }

    @Test
    public void northAgglomerationArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2020-08/Plan_Secteur_Nord_092020.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("103abb0e4cdfcb391e57514d54fe23c0", checksum);
    }

    @Test
    public void nightLines() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.tcl.fr/sites/default/files/2019-09/DepliantPleineLune2019-ok.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2327a02b3d62b6e3e80c69f0a43f2d6c", checksum);
    }
}
