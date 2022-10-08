package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MadridMetroTest {

    @Test
    void metroAndLightRailNetworkMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/documentos/Viaja%20en%20Metro/Planos/Planoesquematico.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("74408bcd2681d17e77f2d4870911c940", checksum);
    }

    @Test
    void metroAndLightRailMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/documentos/Viaja%20en%20Metro/Planos/Planobasecartograficamayo2019.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("aac1ac0634246905cc6e77ae3a7fbddb", checksum);
    }

    @Test
    void metroNetworkSouthArea() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/web/planos/MetroSuresp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a5e455865af38c84caea82b3f8a6e086", checksum);
    }

    @Test
    void lightRailNetwork() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/web/planos/MetroLigeroesp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("cc275348e9cb1702997d83edc7817a3f", checksum);
    }

    @Test
    void touristMap1() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.metromadrid.es/sites/default/files/web/planos/Planoturisticoenero22_0.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a1cdb9ae44741f2b835296f132763280", checksum);
    }

    @Test
    void touristBusMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.esmadrid.com/sites/default/files/documentos/planoturisticodelosautobusesdemadrid_0.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("2e5dfdbdb9405b3cf18b483bf5394cd2", checksum);
    }

}
