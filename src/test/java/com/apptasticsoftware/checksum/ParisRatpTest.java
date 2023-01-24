package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParisRatpTest {

    @Test
    void metroMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-Metro.1618238799.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9d0a9c518d47520ef4d42e553ab2a9e0", checksum);
    }

    @Test
    void rerAndTransiliensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-RER-et-transiliens.1609949703.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f52c507e6538c4f55c4952b5b600d730", checksum);
    }

    @Test
    void busMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Bus.1609949974.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5f9861535cae93fe66b16a2b75c9147e", checksum);
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
