package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class MadridMetroTest {

    @Test
    public void metroAndLightRailNetworkMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/documentos/Viaja%20en%20Metro/Planos/Planoesquematico.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7336ac4e80f8335f90f2fa4c9d2a2bad", checksum);
    }

    @Test
    public void metroAndLightRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/documentos/Viaja%20en%20Metro/Planos/Planobasecartograficamayo2019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aac1ac0634246905cc6e77ae3a7fbddb", checksum);
    }

    @Test
    public void metroNetworkSouthArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/web/planos/MetroSuresp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a5e455865af38c84caea82b3f8a6e086", checksum);
    }

    @Test
    public void lightRailNetwork() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/web/planos/MetroLigeroesp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("cc275348e9cb1702997d83edc7817a3f", checksum);
    }

    @Test
    public void touristMap1() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/documentos/Viaja%20en%20Metro/Planos/PlanoMetroTurInterior.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2c89b5482c6d662effd706055a43b510", checksum);
    }

    @Test
    public void touristMap2() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.esmadrid.com/sites/default/files/plano_turistico_metro_madrid_01122018_0.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b1ce2c76cce8188f61ad8209a02a7540", checksum);
    }

    @Test
    public void touristBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.esmadrid.com/sites/default/files/documentos/planoturisticodelosautobusesdemadrid_0.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2e5dfdbdb9405b3cf18b483bf5394cd2", checksum);
    }
}
