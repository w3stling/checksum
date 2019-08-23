package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class ParisRatpTest {

    @Test
    public void metroMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-Metro.1555581459.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("d2725d02131362461c32c68d336b1407", checksum);
    }

    @Test
    public void rerAndTransiliensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-RER-et-transiliens.1564142742.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b6703d181190a3f2cee94eb2d8824fe6", checksum);
    }

    @Test
    public void busMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Bus.1555581448.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dac2e410865e9a6a0317b67f22aaae27", checksum);
    }

    @Test
    public void nightBusMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Plan-des-Noctilien.1527497902.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("5589a4c0e1555dac90483d397590cb75", checksum);
    }

    @Test
    public void airportAccessMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.ratp.fr/sites/default/files/plans-lignes/Plans-essentiels/Acces-Aeroports.1553266180.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("60a19382c36dc020f95e2797943119cd", checksum);
    }
}
