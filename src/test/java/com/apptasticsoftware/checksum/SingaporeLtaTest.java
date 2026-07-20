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
        assertEquals("30f3e63f67aa76a4e44a828c8ff5695c", checksum);
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
        assertEquals("9cd9577c6d541b5207698999cb4e05e9", checksum2);
    }

    ///

    @Test
    void fullMapColors() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/Full%20map-color.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("9d2dbee651ae1c7f16155263483ffcfd", checksum);
    }

    @Test
    void fullMapGreyScale() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/Full%20map-grey%20scale.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("70cc9f8e71a4b5d5f60907025ce59fa1", checksum);
    }

    @Test
    void eastWestLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/EWL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("58286e365f3f6b661d03d0f795da873f", checksum);
    }

    @Test
    void northSouthLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/NSL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("afaf3506c810f31a5e23f4d7bb6fe7fa", checksum);
    }


    @Test
    void circleLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/CCL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("e8caccf7f7c709d85e1fe0ceebf4a2b5", checksum);
    }

    @Test
    void downtownLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/DTL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("00b34dd281f3635f08067e1e4175ba90", checksum);
    }

    @Test
    void thomsonEastCost() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/TEL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("fce9a2f0226d0716b0ae1799711f28b6", checksum);
    }

    @Test
    void bukitPanjangLRTLine() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/BPL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("2f48e63b8f316464f0cb9a675e7fe615", checksum);
    }

    @Test
    void SengkangLRTline() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/STL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("b6c475cf052b68d803ddeab3d7510add", checksum);
    }


    @Test
    void PunggolLRTline() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.lta.gov.sg/map/mrt/PTL.svg"), MessageDigest.getInstance("MD5"));
        assertEquals("22c8f31d02e751eed4723d20bc1cf3be", checksum);
    }
}
