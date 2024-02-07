package de.olech2412.adapter.dbadapter.model.station;

import de.olech2412.adapter.dbadapter.model.station.sub.Address;
import de.olech2412.adapter.dbadapter.model.station.sub.Operator;
import de.olech2412.adapter.dbadapter.model.station.sub.StationLocation;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    @Test
    void creatingStationShouldSetAllFieldsCorrectly() {
        Station station = new Station();
        station.setId(1L);
        station.setStationId(2L);
        station.setRelevance(0.8f);
        station.setScore(0.9f);
        station.setWeight(1.0f);
        station.setType("Type");
        station.setRil100("Ril100");
        station.setNr(3.0f);
        station.setName("Name");
        station.setCategory(4.0f);
        station.setPriceCategory(5.0f);
        station.setHasParking(true);
        station.setHasBicycleParking(true);
        station.setHasLocalPublicTransport(true);
        station.setHasPublicFacilities(true);
        station.setHasLockerSystem(true);
        station.setHasTaxiRank(true);
        station.setHasTravelNecessities(true);
        station.setHasSteplessAccess("Yes");
        station.setHasMobilityService("Yes");
        station.setHasWiFi(true);
        station.setHasTravelCenter(true);
        station.setHasRailwayMission(true);
        station.setHasDBLounge(true);
        station.setHasLostAndFound(true);
        station.setHasCarRental(true);
        station.setFederalState("FederalState");
        station.setCreatedAt(LocalDateTime.now());
        station.setAddress(new Address());
        station.setLocation(new StationLocation());
        station.setOperator(new Operator());

        assertEquals(1L, station.getId());
        assertEquals(2L, station.getStationId());
        assertEquals(0.8f, station.getRelevance());
        assertEquals(0.9f, station.getScore());
        assertEquals(1.0f, station.getWeight());
        assertEquals("Type", station.getType());
        assertEquals("Ril100", station.getRil100());
        assertEquals(3.0f, station.getNr());
        assertEquals("Name", station.getName());
        assertEquals(4.0f, station.getCategory());
        assertEquals(5.0f, station.getPriceCategory());
        assertTrue(station.isHasParking());
        assertTrue(station.isHasBicycleParking());
        assertTrue(station.isHasLocalPublicTransport());
        assertTrue(station.isHasPublicFacilities());
        assertTrue(station.isHasLockerSystem());
        assertTrue(station.isHasTaxiRank());
        assertTrue(station.isHasTravelNecessities());
        assertEquals("Yes", station.getHasSteplessAccess());
        assertEquals("Yes", station.getHasMobilityService());
        assertTrue(station.isHasWiFi());
        assertTrue(station.isHasTravelCenter());
        assertTrue(station.isHasRailwayMission());
        assertTrue(station.isHasDBLounge());
        assertTrue(station.isHasLostAndFound());
        assertTrue(station.isHasCarRental());
        assertEquals("FederalState", station.getFederalState());
        assertNotNull(station.getCreatedAt());
        assertNotNull(station.getAddress());
        assertNotNull(station.getLocation());
        assertNotNull(station.getOperator());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Station station1 = new Station();
        station1.setId(1L);

        Station station2 = new Station();
        station2.setId(1L);

        assertFalse(station1.equals(station2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Station station1 = new Station();
        station1.setId(1L);

        Station station2 = new Station();
        station2.setId(2L);

        assertFalse(station1.equals(station2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Station station1 = new Station();
        Station station2 = new Station();

        assertEquals(station1.hashCode(), station2.hashCode());
    }
}