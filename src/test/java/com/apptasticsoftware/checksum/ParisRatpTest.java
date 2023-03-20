package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParisRatpTest {

    @Test
    void metroMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-Metro.1669996027.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9d0a9c518d47520ef4d42e553ab2a9e0", checksum);
    }

    @Test
    void rerAndTransiliensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-RER-et-transiliens.1673014648.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f52c507e6538c4f55c4952b5b600d730", checksum);
    }

    @Test
    void busMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Bus.1674568790.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5f9861535cae93fe66b16a2b75c9147e", checksum);
    }

    @Test
    void nightBusMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Noctilien.1674752166.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("41006d96f895396ee22700508be55fbb", checksum);
    }

    @Test
    void airportAccessMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Acces-Aeroports.1553266180.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("60a19382c36dc020f95e2797943119cd", checksum);
    }
}
