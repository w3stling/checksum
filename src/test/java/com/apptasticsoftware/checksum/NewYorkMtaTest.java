package com.apptasticsoftware.checksum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.security.MessageDigest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled("Investigating")
class NewYorkMtaTest {

    @Test
    void diagramSubwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5256"), MessageDigest.getInstance("MD5"));
        assertEquals("6f356127aa85506766548ce01fc54c93", checksum);
    }

    @Test
    void diagramSubwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5336"), MessageDigest.getInstance("MD5"));
        assertEquals("42d22d38065adfab3d2961d0a7410ca0", checksum);
    }

    @Test
    void geographicSubwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/36946"), MessageDigest.getInstance("MD5"));
        assertEquals("c0e0f28577a8a7abeb0e2871a33b5cd6", checksum);
    }

    @Test
    void geographicSubwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/36951"), MessageDigest.getInstance("MD5"));
        assertEquals("3eca50be8f610a3625b923119ef76e46", checksum);
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
        assertEquals("604547f65511568a226604ebdf2e4bb8", checksum);
    }

    @Test
    void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5371"), MessageDigest.getInstance("MD5"));
        assertEquals("c8fd66cb486540e7d27d633bc5e04dd6", checksum);
    }

    @Test
    void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5376"), MessageDigest.getInstance("MD5"));
        assertEquals("3492f1c4986576c0fb08aa0a6b3fd5ac", checksum);
    }

    @Test
    void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5381"), MessageDigest.getInstance("MD5"));
        assertEquals("b169638a9ca9a926b79d70537019eb49", checksum);
    }

    @Test
    void mtaRailroadsMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/22461"), MessageDigest.getInstance("MD5"));
        assertEquals("01862a2662731b06b8805151f8a7a812", checksum);
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
        String checksum = Checksum.calculate(new URI("https://hartfordline.com/wp-content/uploads/2026/01/CTrail-CTtransit-Service-Map-011426.pdf"), MessageDigest.getInstance("MD5"));
        assertEquals("fa16568fc2ead00c6682482602e73cec", checksum);
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
        assertEquals("d4689be8938f94d02c50d0e6f579b35b", checksum);
    }

    @Test
    void airTrainServiceMap() throws Exception {
        // https://www.jfkairport.com/transportation/airtrain
        String checksum = Checksum.calculate(new URI("https://s7d9.scene7.com/is/image/panynjaviation/2-5_7%20AirTrain%20Service%20Map:square-1x1?wid=1200&hei=1200&fit=constrain&qlt=80"), MessageDigest.getInstance("MD5"));
        assertEquals("82c358f1466de406f5c20347fb18f110", checksum);
    }
}
