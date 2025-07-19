package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewYorkMtaTest {

    @Test
    void diagramSubwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5256"), MessageDigest.getInstance("MD5"));
        assertEquals("9f0ca50d316885b3b18528fab7d587f9", checksum);
    }

    @Test
    void diagramSubwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5336"), MessageDigest.getInstance("MD5"));
        assertEquals("a59dadc7251d0af44937584a71b1ad36", checksum);
    }

    @Test
    void geographicSubwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/36946"), MessageDigest.getInstance("MD5"));
        assertEquals("2c56441c0dfe0e42f306a9afa9117355", checksum);
    }

    @Test
    void geographicSubwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/36951"), MessageDigest.getInstance("MD5"));
        assertEquals("63e484968bd4c451bcb97c3bd813516a", checksum);
    }

    @Disabled("Investigating")
    @Test
    void regionalDiagramMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://new2.mta.info/sites/default/files/2018-09/180907-MTA-RTD_unlock.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("0397e70d3706a637ede9fe797108ef04", checksum);
    }

    @Test
    void busBrooklynMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5261"), MessageDigest.getInstance("MD5"));
        assertEquals("34f804dd3264111ff38c7fb61ba30c1c", checksum);
    }

    @Test
    void busBronxMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5366"), MessageDigest.getInstance("MD5"));
        assertEquals("17e7c2023d80260b9589642bccd2b4c2", checksum);
    }

    @Test
    void busManhattanMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5391"), MessageDigest.getInstance("MD5"));
        assertEquals("3f8deead0580b233297e8d6c803656b3", checksum);
    }

    @Test
    void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5371"), MessageDigest.getInstance("MD5"));
        assertEquals("96df974d92c361928ead641699eea127", checksum);
    }

    @Test
    void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5376"), MessageDigest.getInstance("MD5"));
        assertEquals("968ba073b87b2c14fd245bec73e27f4d", checksum);
    }

    @Test
    void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5381"), MessageDigest.getInstance("MD5"));
        assertEquals("be1dd8c00895f53f7f69229d1dc294a7", checksum);
    }

    @Test
    void mtaRailroadsMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/22461"), MessageDigest.getInstance("MD5"));
        assertEquals("e0987aeb4c6c536c7e22953741e86ada", checksum);
    }

    @Disabled("Investigate")
    @Test
    void railLongIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("http://web.mta.info/lirr/Timetable/SystemMap.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("fadf0f65757e0e69393b6afeb3b4291d", checksum);
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
        // https://www.panynj.gov/path/en/schedules-maps.html
        String checksum = Checksum.calculate(new URI("https://www.panynj.gov/content/dam/path/schedules/master-maps/PATH%20Service%20Map%20_01.jpg.transform/transform-1920/image.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("c37b0aab359d661b76895c4ca453fcf4", checksum);
    }

    @Test
    void railNyPathMapWeekends() throws Exception{
        // https://www.panynj.gov/path/en/schedules-maps.html
        String checksum = Checksum.calculate(new URI("https://www.panynj.gov/content/dam/path/schedules/master-maps/PATH%20Service%20Map%20_02.jpg.transform/transform-1920/image.jpg"), MessageDigest.getInstance("MD5"));
        assertEquals("a3928acbcdf526c553a93e675fb866c6", checksum);
    }

    @Test
    void railCtRail() throws Exception {
        // https://hartfordline.com/route_stations/
        String checksum = Checksum.calculate(new URI("https://hartfordline.com/wp-content/uploads/2025/05/CTrail_LineMap_8-5x11_051425.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("f6ef14f455f486a599cce3afaff75c80", checksum);
    }

    @Test
    void njTransitSystemMap() throws Exception {
        // https://www.njtransit.com/
        String checksum = Checksum.calculate(new URI("https://content.njtransit.com/sites/default/files/pdfs/maps/RSM_Geographic_040425_web.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("a5c60fd10dde531055b5ff0fca6dea33", checksum);
    }

    @Test
    void njTransitHudsonBergenLightRail() throws Exception {
        // https://www.njtransit.com/
        String checksum = Checksum.calculate(new URI("https://content.njtransit.com/sites/default/files/pdfs/light-rail/HBLR_RSM_021925.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("e676cc5b70bd6cfbbb3c4413c233ef77", checksum);
    }

    @Test
    void njTransitNewarkLightRail() throws Exception {
        // https://www.njtransit.com/
        String checksum = Checksum.calculate(new URI("https://content.njtransit.com/sites/default/files/pdfs/light-rail/NLR_052825.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("246417dfd60dd1b7390b33d75a1e2958", checksum);
    }

    @Test
    void njTransitRiverLine() throws Exception {
        // https://www.njtransit.com/
        String checksum = Checksum.calculate(new URI("https://content.njtransit.com/sites/default/files/pdfs/light-rail/Riverline_021925_web.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("4b01e28cff516247a060a64aca50ad96", checksum);
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
