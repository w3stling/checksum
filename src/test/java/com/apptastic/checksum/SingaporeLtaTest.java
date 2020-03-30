package com.apptastic.checksum;

import org.junit.Ignore;
import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network.html
public class SingaporeLtaTest {

    @Test
    public void trainSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/pdf/en-sm-20-01-web.png"), MessageDigest.getInstance("MD5"));
        assertEquals("4d9f5edf7fb5a4258328814d7cb78aa2", checksum);
    }

    @Test
    public void trainSystemMapPdf() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/pdf/sm-20-01-en.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("b04a903de2aa7a24fd9b464a3fe842ad", checksum);
    }

    @Test
    public void bukitPanjangLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/bukit_panjang_lrt/image/bp_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("760133d282c825dc8d376946f9317ade", checksum);
    }

    @Test
    public void circleLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/circle_line/image/ccl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("0cfd06719c7e4816f20f76f13b0eff8c", checksum);
    }

    @Test
    public void downtownLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/downtown_line/image/dtl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("9685308104fc3ea576a293f7e1f9d7bc", checksum);
    }

    @Test
    public void eastWestLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/east_west_line/image/ewl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("9b957c2638690702d5f8121bf9b64d2d", checksum);
    }

    @Test
    public void northEastLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/north_east_line/image/nel_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("70e548507664722cd7dbb43c636f79d8", checksum);
    }

    @Test
    public void northSouthLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/north_south_line/image/nsl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("8652ae8033a24f69e6eca3ae16f7f83f", checksum);
    }

    @Test
    public void sengkangPunggolLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/sengkang_punggol_lrt/image/skpg_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("05b082bbe5be373aa4243a3609ccd428", checksum);
    }

    @Test
    public void thomsonEastCostLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/upcoming_projects/thomson_east_coast_line/image/tel1_tel5_route-20_01-08.png"), MessageDigest.getInstance("MD5"));
        assertEquals("6eea129bc3cb27d36e51718da92afe7f", checksum);
        assertEquals("6eea129bc3cb27d36e51718da92afe7f", checksum);
    }

}
