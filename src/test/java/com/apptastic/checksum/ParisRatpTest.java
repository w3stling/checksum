package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class ParisRatpTest {

    @Test
    public void metroMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-Metro.1542892915.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("05d2738314cbb400933606e4d781127e", checksum);
    }

    @Test
    public void rerAndTransiliensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-RER-et-transiliens.1539943267.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("7c4c45bcb0cf1a72a9399aa14c7aa9a6", checksum);
    }

    @Test
    public void busMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Bus.1542892928.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f054466e5e7e69b1d4801be64ed3e861", checksum);
    }

    @Test
    public void nightBusMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Noctilien.1527497902.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5589a4c0e1555dac90483d397590cb75", checksum);
    }

    @Test
    public void airportAccessMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Acces-Aeroports.1496264586.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5f063db923716b529e51f8efd3d58a15", checksum);
    }
}
