package com.apptasticsoftware.checksum;

import org.junit.Ignore;
import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

// https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network.html
public class SingaporeLtaTest {

    @Test
    public void trainSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network/_jcr_content/par/textimage_967171583/image.img.png/1585728760528.png"), MessageDigest.getInstance("MD5"));
        assertEquals("0539f3107b33450c1f396359394ad88d", checksum);
    }

    @Test
    public void trainSystemMapPdf() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/pdf/sm-20-03-en-exp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ca64b0a5dcc6e14c0e02a2ac303b623b", checksum);
    }

    @Ignore("Investigating")
    @Test
    public void trainFutureSystemMapPdf() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/pdf/sm31-20-05-exp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a6886134ff30db2c3dc56242a58a6e89", checksum);
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

        String checksum2 = Checksum.calculate(new URI("https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network/thomson_east_coast_line/_jcr_content/par/image.img.png/1580366965678.png"), MessageDigest.getInstance("MD5"));
        assertEquals("abd033160c53d982c787abaa3aa5baa1", checksum2);
    }

    ///

    @Test
    public void fullMapColors() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/Full%20map-color.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("b05ec97b7a962019267e0d9de03639e7", checksum);
    }

    @Test
    public void fullMapGreyScale() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/Full%20map-grey%20scale.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("2a4ff30c9241d6d1b605bbf8cd379044", checksum);
    }

    @Test
    public void eastWestLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/EWL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("f376de220f9a14de1f8d13329552e752", checksum);
    }

    @Test
    public void northSouthLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/NSL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("30e70a90dbaeec3db1b2d9d191f96b8a", checksum);
    }


    @Test
    public void circleLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/CCL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("9d15791471bc29a9a9bf847a871b6580", checksum);
    }

    @Test
    public void downtownLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/DTL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("3fa894d5746d2707a9a7c19512b325c7", checksum);
    }

    @Test
    public void thomsonEastCost() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/TEL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("56d4c123b4c1388de3c5c9a316b02428", checksum);
    }

    @Test
    public void bukitPanjangLRTLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/BPL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("bbf38cdc362ad9d7bb82ed0417af8389", checksum);
    }

    @Test
    public void SengkangLRTline() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/STL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("206e8a0bed7acea91d0115a7376cdd61", checksum);
    }


    @Test
    public void PunggolLRTline() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/PTL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("60e43a6b87e05aa8b1e4cd5476f5a91c", checksum);
    }
}
