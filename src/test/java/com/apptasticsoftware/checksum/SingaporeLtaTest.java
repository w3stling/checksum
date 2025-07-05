package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network.html
class SingaporeLtaTest {

    @Test
    void trainSystemMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network/_jcr_content/par/textimage_967171583/image.img.png/1585728760528.png"), MessageDigest.getInstance("MD5"));
        assertEquals("04d420032d6cea98f43107de443595de", checksum);
    }

    @Test
    void trainSystemMapPdf() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/pdf/sm-20-03-en-exp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("ca64b0a5dcc6e14c0e02a2ac303b623b", checksum);
    }

    @Disabled("Investigating")
    @Test
    void trainFutureSystemMapPdf() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/pdf/sm31-20-05-exp.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a6886134ff30db2c3dc56242a58a6e89", checksum);
    }


    @Disabled("Investigate")
    @Test
    void bukitPanjangLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/bukit_panjang_lrt/image/bp_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("760133d282c825dc8d376946f9317ade", checksum);
    }

    @Disabled("Investigate")
    @Test
    void circleLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/circle_line/image/ccl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("0cfd06719c7e4816f20f76f13b0eff8c", checksum);
    }

    @Disabled("Investigate")
    @Test
    void downtownLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/downtown_line/image/dtl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("9685308104fc3ea576a293f7e1f9d7bc", checksum);
    }

    @Disabled("Investigate")
    @Test
    void eastWestLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/east_west_line/image/ewl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("9b957c2638690702d5f8121bf9b64d2d", checksum);
    }

    @Disabled("Investigate")
    @Test
    void northEastLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/north_east_line/image/nel_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("70e548507664722cd7dbb43c636f79d8", checksum);
    }

    @Disabled("Investigate")
    @Test
    void northSouthLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/north_south_line/image/nsl_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("8652ae8033a24f69e6eca3ae16f7f83f", checksum);
    }

    @Disabled("Investigate")
    @Test
    void sengkangPunggolLrtMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/getting_around/public_transport/rail_network/sengkang_punggol_lrt/image/skpg_sm_tel1.png"), MessageDigest.getInstance("MD5"));
        assertEquals("05b082bbe5be373aa4243a3609ccd428", checksum);
    }

    @Test
    void thomsonEastCostLineMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/content/dam/ltagov/upcoming_projects/thomson_east_coast_line/image/tel1_tel5_route-20_01-08.png"), MessageDigest.getInstance("MD5"));
        assertEquals("6eea129bc3cb27d36e51718da92afe7f", checksum);

        String checksum2 = Checksum.calculate(new URI("https://www.lta.gov.sg/content/ltagov/en/getting_around/public_transport/rail_network/thomson_east_coast_line/_jcr_content/par/image.img.png/1580366965678.png"), MessageDigest.getInstance("MD5"));
        assertEquals("9b47c9697145fcf8ad1b9c798b7cd538", checksum2);
    }

    ///

    @Test
    void fullMapColors() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/Full%20map-color.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("b6d15a44403f6e01c5c6a05fff451b13", checksum);
    }

    @Test
    void fullMapGreyScale() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/Full%20map-grey%20scale.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("813d3a879d6bfbc792bb95813e04b62f", checksum);
    }

    @Test
    void eastWestLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/EWL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("68ea6f4234922b9cf108187aff9d5924", checksum);
    }

    @Test
    void northSouthLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/NSL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("838cc4d4730aa69589b8b5d9161f75dd", checksum);
    }


    @Test
    void circleLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/CCL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("6db5ffeb89bd946f00e4f829bb5ec580", checksum);
    }

    @Test
    void downtownLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/DTL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("5f6ab1723b2afd9a5e9a330973b7b12f", checksum);
    }

    @Test
    void thomsonEastCost() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/TEL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("538453d6ebeeb189ac2fd81a881f2f22", checksum);
    }

    @Test
    void bukitPanjangLRTLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/BPL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("bbf38cdc362ad9d7bb82ed0417af8389", checksum);
    }

    @Test
    void SengkangLRTline() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/STL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("206e8a0bed7acea91d0115a7376cdd61", checksum);
    }


    @Test
    void PunggolLRTline() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/PTL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("a6298b7c9ec9fc5be6b4fc1607dcf5c8", checksum);
    }
}
