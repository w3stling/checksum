package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network.html
public class SingaporeLtaTest {

    @Test
    public void trainSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/image/SystemMap-Nov19.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("dd58d65209e65d4b279cd72b91f1a24c", checksum);
    }

    @Test
    public void trainSystemMapPdf() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/pdf/SystemMap%20for%20download-Nov19.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f1753d8e585bc8c2a72b540d89285875", checksum);
    }

    @Test
    public void walkingTrainMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltaweb/corp/PublicTransport/img/20190114_SM_%20walking%20time-removal%20BP14%20-%20Walking%20Train%20Map.jpg"), MessageDigest.getInstance("MD5"));
        assertTrue("d41d8cd98f00b204e9800998ecf8427e".equals(checksum) || "015db661c97589330053bb9a7ec7bc51".equals(checksum));
    }

    @Test
    public void bukitPanjangLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/bukit_panjang_lrt/image/bp_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("760133d282c825dc8d376946f9317ade", checksum);
    }

    @Test
    public void circleLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/circle_line/image/CCL.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("b37f8ab5f5cbacd4e9b1c14815f57dd6", checksum);
    }

    @Test
    public void downtownLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/downtown_line/image/DTL.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("b7cc93f782ef2147ab61fb1100f4cb61", checksum);
    }

    @Test
    public void eastWestLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/east_west_line/image/EWL.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("317084a9090ada3b9b87c9802890c4b0", checksum);
    }

    @Test
    public void northEastLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/north_east_line/image/NEL.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("7a13ea7c7581af66a732858a51babce9", checksum);
    }

    @Test
    public void northSouthLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/north_south_line/image/NSL.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("3b5ec2eed2e74408c9b7e34e26844702", checksum);
    }

    @Test
    public void sengkangPunggolLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/sengkang_punggol_lrt/image/SPLRT.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("89447c52f9e691d5b66543a5538bd6c3", checksum);
    }

}
