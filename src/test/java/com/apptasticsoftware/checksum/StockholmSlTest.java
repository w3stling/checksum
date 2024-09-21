package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockholmSlTest {

    @Test
    void allRailServicesMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/KPuTvfWiEovOdFcO8q2kQ/57986049e68b530d6f73773387a03822/sl-spartrafik.png"), MessageDigest.getInstance("MD5"));
        assertEquals("68c2737412a8c869d44ef9e6aa845448", checksum);
    }

    @Test
    void tramLidingoMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/1lAgW7m5oqdZmb5FTZW44T/7181838ea7d5e37ab2762bd49b75b176/lidingobanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("06ea3b214891568897ce5870c9663f46", checksum);
    }

    @Test
    void tramNockebybananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/HYpRswkYlVDpv5v1jDCsu/55909e4c28323e6b761571827f46b186/nockebybanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("16b6f0683661a376a3b85321019e9e11", checksum);
    }

    @Test
    void tramRoslagsbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/1oWyWmOTjGpuHH19F7MoBq/b3525fb77e0a608342fe1ea9664665f8/roslagsbanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("ebcff0d6c98d23d5d786b439d595a140", checksum);
    }

    @Test
    void tramSaltsjobananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/2NOZXv4IrQ1w8BsoDcQREa/a8a5571c7fd13c184ebe944776e23329/saltsjobanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("1475f82219758a57f690bdc8a88e09e1", checksum);
    }

    @Test
    void tramCityMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/3T3S9Qa4hGeDOtskA5C8ue/10599a56ad0c136d8d67ca1563e903d5/sparvag-city.png"), MessageDigest.getInstance("MD5"));
        assertEquals("4b086fcbf14903a515504019d72e62d1", checksum);
    }

    @Test
    void tramTvarbananMap() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/4ogiys1vocmRbS4uxDAX5X/3369feb124c30d402269a595859e6b04/tvarbanan.png"), MessageDigest.getInstance("MD5"));
        assertEquals("6e1982e802c7909d90b1f2ba7cd5bb60", checksum);
    }

    @Test
    void commuterFerryLinesLine80Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/54nrO8TFgmn9YKRcT0cMLU/ea5c6e0c4ff8f4e87fa69daeb8d9b24e/pendelbatslinje80-april2024.png"), MessageDigest.getInstance("MD5"));
        assertEquals("c91c8eca9327751bc7c7d0df4d797634", checksum);
    }

    @Test
    void commuterFerryLinesLine82Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/6kK6KMmgMfHHopSNlKEuuo/4c587023ffdeb3a0a66c3f75ca979462/pendelbatslinje82-april2024.png"), MessageDigest.getInstance("MD5"));
        assertEquals("56a9b7aaa58355903c42763e03ae6f8e", checksum);
    }

    @Test
    void commuterFerryLinesLine83Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/5Y6CMB80mI56nSk0p4JWs1/2d4f9b8d3fc0fdeb53999e551c58e256/pendelbatslinje83-april2024.png"), MessageDigest.getInstance("MD5"));
        assertEquals("f105d5e8145d23c218ce9d43037ddf3d", checksum);
    }

    @Test
    void commuterFerryLinesLine84Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/5GgFxui8HyGwXN0QTksv9w/4014a71085db1928f660ccf65f980064/pendelbatslinje84-maj-2024.png"), MessageDigest.getInstance("MD5"));
        assertEquals("776a81f4e07633697805d310442b30bb", checksum);
    }

    @Test
    void commuterFerryLinesLine89Map() throws Exception {
        String checksum = Checksum.calculate(new URI("https://images.ctfassets.net/9t2ujbulz1j7/4IChmOstrm7jqWXqpJ3pSn/dd760c192bb850deba42936308114f63/linje89.png"), MessageDigest.getInstance("MD5"));
        assertEquals("115f12afd64e7330336730ddae58d673", checksum);
    }

}
