package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParisRatpTest {

    @Test
    void metroMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-Metro.1618238799.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7ac5fa25c1a5cd2784afa4d69a3a44d3", checksum);
    }

    @Test
    void rerAndTransiliensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-RER-et-transiliens.1609949703.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dc8a5fc7ed531cdf45e9815ef707000b", checksum);
    }

    @Test
    void busMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Bus.1609949974.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9f2789b37446d31b79502b5fc7feff96", checksum);
    }

    @Test
    void nightBusMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Noctilien.1611217472.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7c7284b7ce957a3a22cae6726974c54b", checksum);
    }

    @Test
    void airportAccessMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Acces-Aeroports.1553266180.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("60a19382c36dc020f95e2797943119cd", checksum);
    }
}