package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StationLocationTest {

    @Test
    void creatingStationLocationShouldSetAllFieldsCorrectly() {
        StationLocation stationLocation = new StationLocation();
        stationLocation.setId(1L);
        stationLocation.setLatitude(52.5200f);
        stationLocation.setLongitude(13.4050f);

        assertEquals(1L, stationLocation.getId());
        assertEquals(52.5200f, stationLocation.getLatitude());
        assertEquals(13.4050f, stationLocation.getLongitude());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        StationLocation stationLocation1 = new StationLocation();
        stationLocation1.setId(1L);

        StationLocation stationLocation2 = new StationLocation();
        stationLocation2.setId(1L);

        assertTrue(stationLocation1.equals(stationLocation2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        StationLocation stationLocation1 = new StationLocation();
        stationLocation1.setId(1L);

        StationLocation stationLocation2 = new StationLocation();
        stationLocation2.setId(2L);

        assertFalse(stationLocation1.equals(stationLocation2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        StationLocation stationLocation1 = new StationLocation();
        StationLocation stationLocation2 = new StationLocation();

        assertEquals(stationLocation1.hashCode(), stationLocation2.hashCode());
    }
}