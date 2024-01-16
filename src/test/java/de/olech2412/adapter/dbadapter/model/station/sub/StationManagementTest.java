package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StationManagementTest {

    @Test
    void testToString() {
        StationManagement stationManagement = getStationManagement();
        assertEquals("StationManagement{number=123, name='name'}", stationManagement.toString());
    }

    @Test
    void getNumber() {
        StationManagement stationManagement = getStationManagement();
        assertEquals(123, stationManagement.getNumber());
    }

    @Test
    void getName() {
        StationManagement stationManagement = getStationManagement();
        assertEquals("name", stationManagement.getName());
    }

    @Test
    void setNumber() {
        StationManagement stationManagement = getStationManagement();
        assertEquals(123, stationManagement.getNumber());
        stationManagement.setNumber(456);
        assertEquals(456, stationManagement.getNumber());
    }

    @Test
    void setName() {
        StationManagement stationManagement = getStationManagement();
        assertEquals("name", stationManagement.getName());
        stationManagement.setName("name2");
        assertEquals("name2", stationManagement.getName());
    }

    @Test
    void testEquals() {
        StationManagement stationManagement = getStationManagement();
        assertEquals(stationManagement, stationManagement);
        assertNotEquals(stationManagement, null);
        assertNotEquals(stationManagement, new Object());
        StationManagement stationManagement2 = getStationManagement();
        assertEquals(stationManagement, stationManagement2);
        stationManagement2.setNumber(456);
        assertNotEquals(stationManagement, stationManagement2);
        stationManagement2.setNumber(123);
        assertEquals(stationManagement, stationManagement2);
        stationManagement2.setName("name2");
        assertNotEquals(stationManagement, stationManagement2);
        stationManagement2.setName("name");
        assertEquals(stationManagement, stationManagement2);
    }

    @Test
    void testHashCode() {
        StationManagement stationManagement = getStationManagement();
        assertEquals(stationManagement.hashCode(), stationManagement.hashCode());
        StationManagement stationManagement2 = getStationManagement();
        assertEquals(stationManagement.hashCode(), stationManagement2.hashCode());
        stationManagement2.setNumber(456);
        assertNotEquals(stationManagement.hashCode(), stationManagement2.hashCode());
        stationManagement2.setNumber(123);
        assertEquals(stationManagement.hashCode(), stationManagement2.hashCode());
        stationManagement2.setName("name2");
        assertNotEquals(stationManagement.hashCode(), stationManagement2.hashCode());
        stationManagement2.setName("name");
        assertEquals(stationManagement.hashCode(), stationManagement2.hashCode());
    }

    StationManagement getStationManagement() {
        StationManagement stationManagement = new StationManagement();
        stationManagement.setNumber(123);
        stationManagement.setName("name");
        return stationManagement;
    }
}