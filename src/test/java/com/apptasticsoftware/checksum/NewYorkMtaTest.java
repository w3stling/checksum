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
        assertEquals("1fb97258ab3454792eab237763383fa5", checksum);
    }

    @Test
    void diagramSubwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5336"), MessageDigest.getInstance("MD5"));
        assertEquals("a2f394a315349ac6a889d361742621b0", checksum);
    }

    @Test
    void geographicSubwayMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/36946"), MessageDigest.getInstance("MD5"));
        assertEquals("8d8e46b71405edf80c9387f3191df0ca", checksum);
    }

    @Test
    void geographicSubwayNightMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/36951"), MessageDigest.getInstance("MD5"));
        assertEquals("7f6123073aa9ef8231fa2b8ea4338490", checksum);
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
        assertEquals("10790b75a6b9bdd672154825cf630cdf", checksum);
    }

    @Test
    void busQueensMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5371"), MessageDigest.getInstance("MD5"));
        assertEquals("e887cf91a3c35e4d5dce0a2e3c8ce068", checksum);
    }

    @Test
    void busStatenIslandMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5376"), MessageDigest.getInstance("MD5"));
        assertEquals("a4717d3bf9cda29b17b7b88934d423ca", checksum);
    }

    @Test
    void busStatenIslandExpressMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/5381"), MessageDigest.getInstance("MD5"));
        assertEquals("b169638a9ca9a926b79d70537019eb49", checksum);
    }

    @Test
    void mtaRailroadsMap() throws Exception{
        String checksum = Checksum.calculate(new URI("https://www.mta.info/map/22461"), MessageDigest.getInstance("MD5"));
        assertEquals("3abdb906c0940fd31c467b6fc19a2e12", checksum);
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
