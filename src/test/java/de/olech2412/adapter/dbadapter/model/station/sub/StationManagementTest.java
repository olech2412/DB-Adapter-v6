package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StationManagementTest {

    @Test
    void creatingStationManagementShouldSetAllFieldsCorrectly() {
        StationManagement stationManagement = new StationManagement();
        stationManagement.setId(1L);
        stationManagement.setNumber(123);
        stationManagement.setName("Station Management Name");

        assertEquals(1L, stationManagement.getId());
        assertEquals(123, stationManagement.getNumber());
        assertEquals("Station Management Name", stationManagement.getName());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        StationManagement stationManagement1 = new StationManagement();
        stationManagement1.setId(1L);

        StationManagement stationManagement2 = new StationManagement();
        stationManagement2.setId(1L);

        assertTrue(stationManagement1.equals(stationManagement2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        StationManagement stationManagement1 = new StationManagement();
        stationManagement1.setId(1L);

        StationManagement stationManagement2 = new StationManagement();
        stationManagement2.setId(2L);

        assertFalse(stationManagement1.equals(stationManagement2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        StationManagement stationManagement1 = new StationManagement();
        StationManagement stationManagement2 = new StationManagement();

        assertEquals(stationManagement1.hashCode(), stationManagement2.hashCode());
    }
}