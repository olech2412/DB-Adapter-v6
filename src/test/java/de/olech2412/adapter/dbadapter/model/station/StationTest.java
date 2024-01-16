package de.olech2412.adapter.dbadapter.model.station;

import de.olech2412.adapter.dbadapter.model.station.sub.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    @Test
    void testToString() {
        Station station = getStation();
        assertEquals("Station{uuid=" + station.getUuid() + ", id='id', relevance=1.0, score=2.0, weight=3.0, type='type', ril100='ril100', nr=4.0, name='name', location=null, operator=null, address=null, category=1.0, priceCategory=1.0, hasParking=true, hasBicycleParking=true, hasLocalPublicTransport=true, hasPublicFacilities=true, hasLockerSystem=true, hasTaxiRank=true, hasTravelNecessities=true, hasSteplessAccess='hasSteplessAccess', hasMobilityService='hasMobilityService', hasWiFi=true, hasTravelCenter=true, hasRailwayMission=true, hasDBLounge=true, hasLostAndFound=true, hasCarRental=true, federalState='federalState', createdAt=null, regionalbereich=null, timeTableOffice=null, szentrale=null, stationManagement=null, ril100Identifiers=null}", station.toString());
    }

    @Test
    void getUuid() {
        Station station = getStation();
        assertTrue(station.getUuid() instanceof UUID);
    }

    @Test
    void getId() {
        Station station = getStation();
        assertEquals("id", station.getId());
    }

    @Test
    void getRelevance() {
        Station station = getStation();
        assertEquals(1.0, station.getRelevance());
    }

    @Test
    void getScore() {
        Station station = getStation();
        assertEquals(2.0, station.getScore());
    }

    @Test
    void getWeight() {
        Station station = getStation();
        assertEquals(3.0, station.getWeight());
    }

    @Test
    void getType() {
        Station station = getStation();
        assertEquals("type", station.getType());
    }

    @Test
    void getRil100() {
        Station station = getStation();
        assertEquals("ril100", station.getRil100());
    }

    @Test
    void getNr() {
        Station station = getStation();
        assertEquals(4.0, station.getNr());
    }

    @Test
    void getName() {
        Station station = getStation();
        assertEquals("name", station.getName());
    }

    @Test
    void getLocation() {
        Station station = getStation();
        assertNull(station.getLocation());
    }

    @Test
    void getOperator() {
        Station station = getStation();
        assertNull(station.getOperator());
    }

    @Test
    void getAddress() {
        Station station = getStation();
        assertNull(station.getAddress());
    }

    @Test
    void getCategory() {
        Station station = getStation();
        assertEquals(1.0, station.getCategory());
    }

    @Test
    void getPriceCategory() {
        Station station = getStation();
        assertEquals(1.0, station.getPriceCategory());
    }

    @Test
    void isHasParking() {
        Station station = getStation();
        assertTrue(station.isHasParking());
    }

    @Test
    void isHasBicycleParking() {
        Station station = getStation();
        assertTrue(station.isHasBicycleParking());
    }

    @Test
    void isHasLocalPublicTransport() {
        Station station = getStation();
        assertTrue(station.isHasLocalPublicTransport());
    }

    @Test
    void isHasPublicFacilities() {
        Station station = getStation();
        assertTrue(station.isHasPublicFacilities());
    }

    @Test
    void isHasLockerSystem() {
        Station station = getStation();
        assertTrue(station.isHasLockerSystem());
    }

    @Test
    void isHasTaxiRank() {
        Station station = getStation();
        assertTrue(station.isHasTaxiRank());
    }

    @Test
    void isHasTravelNecessities() {
        Station station = getStation();
        assertTrue(station.isHasTravelNecessities());
    }

    @Test
    void getHasSteplessAccess() {
        Station station = getStation();
        assertEquals("hasSteplessAccess", station.getHasSteplessAccess());
    }

    @Test
    void getHasMobilityService() {
        Station station = getStation();
        assertEquals("hasMobilityService", station.getHasMobilityService());
    }

    @Test
    void isHasWiFi() {
        Station station = getStation();
        assertTrue(station.isHasWiFi());
    }

    @Test
    void isHasTravelCenter() {
        Station station = getStation();
        assertTrue(station.isHasTravelCenter());
    }

    @Test
    void isHasRailwayMission() {
        Station station = getStation();
        assertTrue(station.isHasRailwayMission());
    }

    @Test
    void isHasDBLounge() {
        Station station = getStation();
        assertTrue(station.isHasDBLounge());
    }

    @Test
    void isHasLostAndFound() {
        Station station = getStation();
        assertTrue(station.isHasLostAndFound());
    }

    @Test
    void isHasCarRental() {
        Station station = getStation();
        assertTrue(station.isHasCarRental());
    }

    @Test
    void getFederalState() {
        Station station = getStation();
        assertEquals("federalState", station.getFederalState());
    }

    @Test
    void getCreatedAt() {
        Station station = getStation();
        assertNull(station.getCreatedAt());
    }

    @Test
    void getRegionalbereich() {
        Station station = getStation();
        assertNull(station.getRegionalbereich());
    }

    @Test
    void getTimeTableOffice() {
        Station station = getStation();
        assertNull(station.getTimeTableOffice());
    }

    @Test
    void getSzentrale() {
        Station station = getStation();
        assertNull(station.getSzentrale());
    }

    @Test
    void getStationManagement() {
        Station station = getStation();
        assertNull(station.getStationManagement());
    }

    @Test
    void getRil100Identifiers() {
        Station station = getStation();
        assertNull(station.getRil100Identifiers());
    }

    @Test
    void setUuid() {
        Station station = getStation();
        assertTrue(station.getUuid() instanceof UUID);
        UUID uuid = UUID.randomUUID();
        station.setUuid(uuid);
        assertEquals(uuid, station.getUuid());
    }

    @Test
    void setId() {
        Station station = getStation();
        assertEquals("id", station.getId());
        station.setId("id2");
        assertEquals("id2", station.getId());
    }

    @Test
    void setRelevance() {
        Station station = getStation();
        assertEquals(1.0, station.getRelevance());
        station.setRelevance(2.0f);
        assertEquals(2.0, station.getRelevance());
    }

    @Test
    void setScore() {
        Station station = getStation();
        assertEquals(2.0, station.getScore());
        station.setScore(3.0f);
        assertEquals(3.0, station.getScore());
    }

    @Test
    void setWeight() {
        Station station = getStation();
        assertEquals(3.0, station.getWeight());
        station.setWeight(4.0f);
        assertEquals(4.0, station.getWeight());
    }

    @Test
    void setType() {
        Station station = getStation();
        assertEquals("type", station.getType());
        station.setType("type2");
        assertEquals("type2", station.getType());
    }

    @Test
    void setRil100() {
        Station station = getStation();
        assertEquals("ril100", station.getRil100());
        station.setRil100("ril1002");
        assertEquals("ril1002", station.getRil100());
    }

    @Test
    void setNr() {
        Station station = getStation();
        assertEquals(4.0, station.getNr());
        station.setNr(5.0f);
        assertEquals(5.0, station.getNr());
    }

    @Test
    void setName() {
        Station station = getStation();
        assertEquals("name", station.getName());
        station.setName("name2");
        assertEquals("name2", station.getName());
    }

    @Test
    void setLocation() {
        Station station = getStation();
        assertNull(station.getLocation());
        Location location = new Location();
        station.setLocation(location);
        assertEquals(location, station.getLocation());
    }

    @Test
    void setOperator() {
        Station station = getStation();
        assertNull(station.getOperator());
        Operator operator = new Operator();
        station.setOperator(operator);
        assertEquals(operator, station.getOperator());
    }

    @Test
    void setAddress() {
        Station station = getStation();
        assertNull(station.getAddress());
        Address address = new Address();
        station.setAddress(address);
        assertEquals(address, station.getAddress());
    }

    @Test
    void setCategory() {
        Station station = getStation();
        assertEquals(1.0, station.getCategory());
        station.setCategory(2.0f);
        assertEquals(2.0, station.getCategory());
    }

    @Test
    void setPriceCategory() {
        Station station = getStation();
        assertEquals(1.0, station.getPriceCategory());
        station.setPriceCategory(2.0f);
        assertEquals(2.0, station.getPriceCategory());
    }

    @Test
    void setHasParking() {
        Station station = getStation();
        assertTrue(station.isHasParking());
        station.setHasParking(false);
        assertFalse(station.isHasParking());
    }

    @Test
    void setHasBicycleParking() {
        Station station = getStation();
        assertTrue(station.isHasBicycleParking());
        station.setHasBicycleParking(false);
        assertFalse(station.isHasBicycleParking());
    }

    @Test
    void setHasLocalPublicTransport() {
        Station station = getStation();
        assertTrue(station.isHasLocalPublicTransport());
        station.setHasLocalPublicTransport(false);
        assertFalse(station.isHasLocalPublicTransport());
    }

    @Test
    void setHasPublicFacilities() {
        Station station = getStation();
        assertTrue(station.isHasPublicFacilities());
        station.setHasPublicFacilities(false);
        assertFalse(station.isHasPublicFacilities());
    }

    @Test
    void setHasLockerSystem() {
        Station station = getStation();
        assertTrue(station.isHasLockerSystem());
        station.setHasLockerSystem(false);
        assertFalse(station.isHasLockerSystem());
    }

    @Test
    void setHasTaxiRank() {
        Station station = getStation();
        assertTrue(station.isHasTaxiRank());
        station.setHasTaxiRank(false);
        assertFalse(station.isHasTaxiRank());
    }

    @Test
    void setHasTravelNecessities() {
        Station station = getStation();
        assertTrue(station.isHasTravelNecessities());
        station.setHasTravelNecessities(false);
        assertFalse(station.isHasTravelNecessities());
    }

    @Test
    void setHasSteplessAccess() {
        Station station = getStation();
        assertEquals("hasSteplessAccess", station.getHasSteplessAccess());
        station.setHasSteplessAccess("hasSteplessAccess2");
        assertEquals("hasSteplessAccess2", station.getHasSteplessAccess());
    }

    @Test
    void setHasMobilityService() {
        Station station = getStation();
        assertEquals("hasMobilityService", station.getHasMobilityService());
        station.setHasMobilityService("hasMobilityService2");
        assertEquals("hasMobilityService2", station.getHasMobilityService());
    }

    @Test
    void setHasWiFi() {
        Station station = getStation();
        assertTrue(station.isHasWiFi());
        station.setHasWiFi(false);
        assertFalse(station.isHasWiFi());
    }

    @Test
    void setHasTravelCenter() {
        Station station = getStation();
        assertTrue(station.isHasTravelCenter());
        station.setHasTravelCenter(false);
        assertFalse(station.isHasTravelCenter());
    }

    @Test
    void setHasRailwayMission() {
        Station station = getStation();
        assertTrue(station.isHasRailwayMission());
        station.setHasRailwayMission(false);
        assertFalse(station.isHasRailwayMission());
    }

    @Test
    void setHasDBLounge() {
        Station station = getStation();
        assertTrue(station.isHasDBLounge());
        station.setHasDBLounge(false);
        assertFalse(station.isHasDBLounge());
    }

    @Test
    void setHasLostAndFound() {
        Station station = getStation();
        assertTrue(station.isHasLostAndFound());
        station.setHasLostAndFound(false);
        assertFalse(station.isHasLostAndFound());
    }

    @Test
    void setHasCarRental() {
        Station station = getStation();
        assertTrue(station.isHasCarRental());
        station.setHasCarRental(false);
        assertFalse(station.isHasCarRental());
    }

    @Test
    void setFederalState() {
        Station station = getStation();
        assertEquals("federalState", station.getFederalState());
        station.setFederalState("federalState2");
        assertEquals("federalState2", station.getFederalState());
    }

    @Test
    void setCreatedAt() {
        Station station = getStation();
        assertNull(station.getCreatedAt());
        station.setCreatedAt(LocalDateTime.now());
        assertNotNull(station.getCreatedAt());
        assertTrue(station.getCreatedAt() instanceof LocalDateTime);
    }

    @Test
    void setRegionalbereich() {
        Station station = getStation();
        assertNull(station.getRegionalbereich());
        station.setRegionalbereich(new Regionalbereich());
        assertNotNull(station.getRegionalbereich());
        assertTrue(station.getRegionalbereich() instanceof Regionalbereich);
    }

    @Test
    void setTimeTableOffice() {
        Station station = getStation();
        assertNull(station.getTimeTableOffice());
        station.setTimeTableOffice(new TimeTableOffice());
        assertTrue(station.getTimeTableOffice() instanceof TimeTableOffice);
    }

    @Test
    void setSzentrale() {
        Station station = getStation();
        assertNull(station.getSzentrale());
        station.setSzentrale(new Szentrale());
        assertTrue(station.getSzentrale() instanceof Szentrale);
    }

    @Test
    void setStationManagement() {
        Station station = getStation();
        assertNull(station.getStationManagement());
        station.setStationManagement(new StationManagement());
        assertTrue(station.getStationManagement() instanceof StationManagement);
    }

    @Test
    void setRil100Identifiers() {
        Station station = getStation();
        assertNull(station.getRil100Identifiers());
        station.setRil100Identifiers(new ArrayList<>());
        assertTrue(station.getRil100Identifiers() instanceof ArrayList);
    }

    @Test
    void testEquals() {
        Station station = getStation();
        assertEquals(station, station);
        assertNotEquals(station, null);
        assertNotEquals(station, new Object());
        Station station2 = getStation();
        assertNotEquals(station, station2);
        station2.setRelevance(2.0f);
        assertNotEquals(station, station2);
    }

    @Test
    void testHashCode() {
        Station station = getStation();
        assertNotEquals(station.hashCode(), new Object().hashCode());
        Station station2 = getStation();
        assertNotEquals(station.hashCode(), station2.hashCode());
        station2.setRelevance(2.0f);
        assertNotEquals(station.hashCode(), station2.hashCode());
    }

    Station getStation() {
        Station station = new Station();
        station.setUuid(UUID.randomUUID());
        station.setId("id");
        station.setRelevance(1.0f);
        station.setScore(2.0f);
        station.setWeight(3.0f);
        station.setType("type");
        station.setRil100("ril100");
        station.setNr(4);
        station.setName("name");
        station.setLocation(null);
        station.setOperator(null);
        station.setAddress(null);
        station.setCategory(1.0f);
        station.setPriceCategory(1f);
        station.setHasParking(true);
        station.setHasBicycleParking(true);
        station.setHasLocalPublicTransport(true);
        station.setHasPublicFacilities(true);
        station.setHasLockerSystem(true);
        station.setHasTaxiRank(true);
        station.setHasTravelNecessities(true);
        station.setHasSteplessAccess("hasSteplessAccess");
        station.setHasMobilityService("hasMobilityService");
        station.setHasWiFi(true);
        station.setHasTravelCenter(true);
        station.setHasRailwayMission(true);
        station.setHasDBLounge(true);
        station.setHasLostAndFound(true);
        station.setHasCarRental(true);
        station.setFederalState("federalState");
        station.setCreatedAt(null);
        station.setRegionalbereich(null);
        station.setTimeTableOffice(null);
        station.setSzentrale(null);
        station.setStationManagement(null);
        station.setRil100Identifiers(null);
        return station;
    }
}