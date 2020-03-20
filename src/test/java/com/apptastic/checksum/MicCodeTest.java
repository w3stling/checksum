package com.apptastic.checksum;

import org.junit.Test;

import java.net.URI;
import java.security.MessageDigest;
import java.time.YearMonth;

import static org.junit.Assert.assertEquals;

public class MicCodeTest {
    private static final String URL_FORMAT = "https://www.iso20022.org/sites/default/files/%s/ISO10383_MIC.csv";

    @Test
    public void MicCodeTest() throws Exception {
        YearMonth yearMonth = YearMonth.now();

        try {
            String checksum = Checksum.calculate(new URI(String.format(URL_FORMAT, yearMonth)), MessageDigest.getInstance("MD5"));
            assertEquals("098007c20a1abd8104f435597fdc190e", checksum);
        } catch (Exception e) {
            String checksum = Checksum.calculate(new URI(String.format(URL_FORMAT, yearMonth.minusMonths(1))), MessageDigest.getInstance("MD5"));
            assertEquals("098007c20a1abd8104f435597fdc190e", checksum);
        }
    }
}
