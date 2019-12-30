package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class DelhiMetroTest {

    @Test
    public void metroMap() throws Exception {
        String checksum = Checksum.calculate(new URI("http://www.delhimetrorail.com/images/Map-Bilingual-04102019.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("df8c25d8cc176881c849f751bfceb8d6", checksum);
    }
}
