package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SingaporeTrainMap {

    @Test
    public void trainSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/20190422%20SM%20-%20Up%20to%20CRL%20w%20DT4.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("091a940a449c87e7d8d3bc18860f93e2", checksum);
    }

    @Test
    public void walkingTrainMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/20190114_SM_%20walking%20time-removal%20BP14%20-%20Walking%20Train%20Map.jpg"), MessageDigest.getInstance("MD5"));
        assertTrue("d41d8cd98f00b204e9800998ecf8427e".equals(checksum) || "015db661c97589330053bb9a7ec7bc51".equals(checksum));
    }

    @Test
    public void bukitPanjangLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/LBPLRT.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void circleLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/20180723_CCL%20line%20only.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void downtownLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/DTL%20lines%20only.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void eastWestLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/System%20map%20with%20EWL%20only%20-%20resize.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void northEastLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/NEL-.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void northSouthLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/NSLE%20line.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void punggolLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/SPLRT%20loop-Mar17.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

    @Test
    public void sengkangLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/SPLRT%20loop-Mar17.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", checksum);
    }

}
