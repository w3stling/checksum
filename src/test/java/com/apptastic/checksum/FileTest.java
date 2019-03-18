package com.apptastic.checksum;

import org.junit.Test;

import java.io.File;
import java.security.MessageDigest;

import static org.junit.Assert.assertEquals;

public class FileTest {

    @Test
    public void calcFileChecksumMD5() throws Exception {
        String filename = getClass().getClassLoader().getResource("test_file.txt").getFile();
        String checksum = Checksum.calculate(new File(filename),  MessageDigest.getInstance("MD5"));
        assertEquals("8ddd8be4b179a529afa5f2ffae4b9858", checksum);
    }

    @Test
    public void calcFileChecksumSHA1() throws Exception {
        String filename = getClass().getClassLoader().getResource("test_file.txt").getFile();
        String checksum = Checksum.calculate(new File(filename),  MessageDigest.getInstance("SHA1"));
        assertEquals("a0b65939670bc2c010f4d5d6a0b3e4e4590fb92b", checksum);
    }

    @Test
    public void calcFileChecksumSHA256() throws Exception {
        String filename = getClass().getClassLoader().getResource("test_file.txt").getFile();
        String checksum = Checksum.calculate(new File(filename),  MessageDigest.getInstance("SHA-256"));
        assertEquals("03ba204e50d126e4674c005e04d82e84c21366780af1f43bd54a37816b6ab340", checksum);
    }
}
