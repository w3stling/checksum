package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Investigating")
class ParisRatpTest {

    @Test
    void metroMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-Metro.1669996027.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("8110fa46095ebbb50c5cff58ac650a8e", checksum);
    }

    @Test
    void rerAndTransiliensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-RER-et-transiliens.1673014648.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f52c507e6538c4f55c4952b5b600d730", checksum);
    }

    @Test
    void busMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Bus.1674568790.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d4b6b575b9032a7cae50d036883ea164", checksum);
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
