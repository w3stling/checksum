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
        assertEquals("474eb246a24fd5c5ec0a89f22a0f7d2c", checksum);
    }

    @Test
    void subwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5336"), MessageDigest.getInstance("MD5"));
        assertEquals("32742f02b24ece2576574fd0b4c567cf", checksum);
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
        assertEquals("17e7c2023d80260b9589642bccd2b4c2", checksum);
    }

    @Test
    void busManhattanMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5391"), MessageDigest.getInstance("MD5"));
        assertEquals("3f8deead0580b233297e8d6c803656b3", checksum);
    }

    @Test
    void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5371"), MessageDigest.getInstance("MD5"));
        assertEquals("55459386929948f2defc8cf126a44f6f", checksum);
    }

    @Test
    void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5376"), MessageDigest.getInstance("MD5"));
        assertEquals("968ba073b87b2c14fd245bec73e27f4d", checksum);
    }

    @Test
    void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/5381"), MessageDigest.getInstance("MD5"));
        assertEquals("be1dd8c00895f53f7f69229d1dc294a7", checksum);
    }

    @Test
    void mtaRailroadsMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new.mta.info/map/22461"), MessageDigest.getInstance("MD5"));
        assertEquals("8be267bfb16b90cc755382fadb28bcca", checksum);
    }

    @Disabled("Investigate")
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

    @Disabled("Investigate")
    @Test
    void railMetroNorthMapOld() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/mnr/gifs/mnrmap.png"), MessageDigest.getInstance("MD5"));
        assertEquals("76a74c95e7e88e24fd1dc1b5ad4664cc", checksum);
    }

    @Disabled("Investigate")
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
        // https://www.hartfordline.com/pdf/hartford_line_statewide_map.pdf
        String checksum = Checksum.calculate(new URI("https://hartfordline.com/wp-content/uploads/2023/12/new_service_map.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("dddc76b053192cadec71358fa6a316cb", checksum);
    }

    @Test
    void nycFerryMap() throws Exception {
        // https://www.ferry.nyc/routes-and-schedules/
        String checksum = Checksum.calculate(new URI("https://www.ferry.nyc/wp-content/uploads/2024/05/System-Map_5-20-2024.png"), MessageDigest.getInstance("MD5"));
        assertEquals("fa1b38709f370048098c853efe3fe3b8", checksum);
    }

    @Test
    void jfkAirportMap() throws Exception {
        // https://www.jfkairport.com/at-airport/airport-maps
        String checksum = Checksum.calculate(new URI("https://www.jfkairport.com/static/JFK/image/JFK-airport-map.png"), MessageDigest.getInstance("MD5"));
        assertEquals("3b35afd74ee5ad14660d147118d6bd96", checksum);
    }

    @Test
    void airTrainServiceMap() throws Exception {
        // https://www.jfkairport.com/at-airport/connecting-flights
        String checksum = Checksum.calculate(new URI("https://www.jfkairport.com/static/JFK/image/jfk-airTrain-graphic.png"), MessageDigest.getInstance("MD5"));
        assertEquals("7e04f632645cf6e3fed94f5af0f0975a", checksum);
    }
}
