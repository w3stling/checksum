package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class ParisRatpTest {

    @Test
    public void metroMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-Metro.1571994565.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0861e9c05cce69232f0652e95d4a813e", checksum);
    }

    @Test
    public void rerAndTransiliensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-RER-et-transiliens.1564142742.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b6703d181190a3f2cee94eb2d8824fe6", checksum);
    }

    @Test
    public void busMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Bus.1571994602.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("05538b8d39798cf69ab350af75cad1f7", checksum);
    }

    @Test
    public void nightBusMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Noctilien.1571230068.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a84c61a6b1cd3478eb534042e9a7abb4", checksum);
    }

    @Test
    public void airportAccessMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Acces-Aeroports.1553266180.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("60a19382c36dc020f95e2797943119cd", checksum);
    }
}
