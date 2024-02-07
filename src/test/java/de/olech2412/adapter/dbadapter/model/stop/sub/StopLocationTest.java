package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StopLocationTest {

    @Test
    void creatingStopLocationShouldSetAllFieldsCorrectly() {
        StopLocation stopLocation = new StopLocation();
        stopLocation.setId(1L);
        stopLocation.setLatitude(50.1109);
        stopLocation.setLongitude(8.6821);

        assertEquals(1L, stopLocation.getId());
        assertEquals(50.1109, stopLocation.getLatitude());
        assertEquals(8.6821, stopLocation.getLongitude());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        StopLocation stopLocation1 = new StopLocation();
        stopLocation1.setId(1L);

        StopLocation stopLocation2 = new StopLocation();
        stopLocation2.setId(1L);

        assertTrue(stopLocation1.equals(stopLocation2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        StopLocation stopLocation1 = new StopLocation();
        stopLocation1.setId(1L);

        StopLocation stopLocation2 = new StopLocation();
        stopLocation2.setId(2L);

        assertFalse(stopLocation1.equals(stopLocation2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        StopLocation stopLocation1 = new StopLocation();
        StopLocation stopLocation2 = new StopLocation();

        assertEquals(stopLocation1.hashCode(), stopLocation2.hashCode());
    }
}