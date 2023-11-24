package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewYorkMtaTest {

    @Test
    void subwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5256"), MessageDigest.getInstance("MD5"));
        assertEquals("7c3e07d3e722aed6c4b37f82c6c482c1", checksum);
    }

    @Test
    void subwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5336"), MessageDigest.getInstance("MD5"));
        assertEquals("fc4a76da009fc73f2b006884af916830", checksum);
    }

    @Disabled("Investigating")
    @Test
    void regionalDiagramMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new2.mta.info/sites/default/files/2018-09/180907-MTA-RTD_unlock.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0397e70d3706a637ede9fe797108ef04", checksum);
    }

    @Test
    void busBrooklynMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5261"), MessageDigest.getInstance("MD5"));
        assertEquals("34f804dd3264111ff38c7fb61ba30c1c", checksum);
    }

    @Test
    void busBronxMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5366"), MessageDigest.getInstance("MD5"));
        assertEquals("10a6c1d5d4f0e55e045dac7931fbb148", checksum);
    }

    @Test
    void busManhattanMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5391"), MessageDigest.getInstance("MD5"));
        assertEquals("8b8d217136cf99a1a0b78de6bfa6aa20", checksum);
    }

    @Test
    void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5371"), MessageDigest.getInstance("MD5"));
        assertEquals("54e9f1ed518093e2ffe162868f8b680c", checksum);
    }

    @Test
    void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5376"), MessageDigest.getInstance("MD5"));
        assertEquals("956cf436ed452c720af7ce3f0d4bb46b", checksum);
    }

    @Test
    void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5381"), MessageDigest.getInstance("MD5"));
        assertEquals("b1597efb46f971e72c8f2b5f1fc69b00", checksum);
    }

    @Test
    void mtaRailroadsMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/22461"), MessageDigest.getInstance("MD5"));
        assertEquals("642486e84797a7ff2543f69282728358", checksum);
    }

    @Test
    void railLongIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/lirr/Timetable/SystemMap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("fadf0f65757e0e69393b6afeb3b4291d", checksum);
    }

    @Test
    void railMetroNorthMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5351"), MessageDigest.getInstance("MD5"));
        assertEquals("aa7b62eb0b9b1bd8a1bce0e2878a106f", checksum);
    }

    @Test
    void railMetroNorthMapOld() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/mnr/gifs/mnrmap.png"), MessageDigest.getInstance("MD5"));
        assertEquals("76a74c95e7e88e24fd1dc1b5ad4664cc", checksum);
    }

    @Test
    void railStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/nyct/service/pdf/sircur.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("18f3cd80f60d48c44c0d2a4654083cbe", checksum);
    }


    @Test
    void railNyPathMapWeekdays() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.panynj.gov/content/dam/path/schedules/master-maps/PATH%20Service%20Map%20_01.jpg.transform/transform-1920/image.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("c37b0aab359d661b76895c4ca453fcf4", checksum);
    }

    @Test
    void railNyPathMapWeekends() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.panynj.gov/content/dam/path/schedules/master-maps/PATH%20Service%20Map%20_02.jpg.transform/transform-1920/image.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("a3928acbcdf526c553a93e675fb866c6", checksum);
    }

    @Test
    void railCtRail() throws Exception {
        String checksum = Checksum.calculate(new URI("https://www.hartfordline.com/pdf/hartford_line_statewide_map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("9b0440cf73d603858e80dfb7a37adb56", checksum);
    }

    @Test
    void nycFerryMap() throws Exception {
        // https://www.ferry.nyc/routes-and-schedules/
        String checksum = Checksum.calculate(new URI("https://images.ferry.nyc/wp-content/uploads/2023/11/08022445/System-Map_11-4-2023-1.jpg?_ga=2.81391703.1991557015.1700302188-855332713.1700302188"), MessageDigest.getInstance("MD5"));
        assertEquals("c1c349744336ee96b6a3aae74fbae595", checksum);
    }

    @Test
    void jfkAirportMap() throws Exception {
        // https://www.jfkairport.com/at-airport/airport-maps
        String checksum = Checksum.calculate(new URI("https://www.jfkairport.com/static/JFK/image/JFK-airport-map.png"), MessageDigest.getInstance("MD5"));
        assertEquals("f3ffea5319f450dbc0c961d602e1f4e9", checksum);
    }

    @Test
    void airTrainServiceMap() throws Exception {
        // https://www.jfkairport.com/at-airport/connecting-flights
        String checksum = Checksum.calculate(new URI("https://www.jfkairport.com/static/JFK/image/jfk-airTrain-graphic.png"), MessageDigest.getInstance("MD5"));
        assertEquals("7e04f632645cf6e3fed94f5af0f0975a", checksum);
    }
}
