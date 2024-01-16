package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LocationTest {

    @Test
    void testToString() {
        Location location = getLocation();
        assertEquals("Location{type='type', latitude=123.0, longitude=123.0}", location.toString());
    }

    @Test
    void getType() {
        Location location = getLocation();
        assertEquals("type", location.getType());
    }

    @Test
    void getLatitude() {
        Location location = getLocation();
        assertEquals(123.0f, location.getLatitude());
    }

    @Test
    void getLongitude() {
        Location location = getLocation();
        assertEquals(123.0f, location.getLongitude());
    }

    @Test
    void setType() {
        Location location = getLocation();
        assertEquals("type", location.getType());
        location.setType("type2");
        assertEquals("type2", location.getType());
    }

    @Test
    void setLatitude() {
        Location location = getLocation();
        assertEquals(123.0f, location.getLatitude());
        location.setLatitude(456.0f);
        assertEquals(456.0f, location.getLatitude());
    }

    @Test
    void setLongitude() {
        Location location = getLocation();
        assertEquals(123.0f, location.getLongitude());
        location.setLongitude(456.0f);
        assertEquals(456.0f, location.getLongitude());
    }

    @Test
    void testEquals() {
        Location location = getLocation();
        assertEquals(location, location);
        assertNotEquals(location, null);
        assertNotEquals(location, new Object());
        Location location2 = getLocation();
        assertEquals(location, location2);
        location2.setType("type2");
        assertNotEquals(location, location2);
        location2.setType("type");
        assertEquals(location, location2);
        location2.setLatitude(456.0f);
        assertNotEquals(location, location2);
        location2.setLatitude(123.0f);
        assertEquals(location, location2);
        location2.setLongitude(456.0f);
        assertNotEquals(location, location2);
        location2.setLongitude(123.0f);
        assertEquals(location, location2);
    }

    @Test
    void testHashCode() {
        Location location = getLocation();
        assertEquals(location.hashCode(), location.hashCode());
        Location location2 = getLocation();
        assertEquals(location.hashCode(), location2.hashCode());
        location2.setType("type2");
        assertNotEquals(location.hashCode(), location2.hashCode());
        location2.setType("type");
        assertEquals(location.hashCode(), location2.hashCode());
        location2.setLatitude(456.0f);
        assertNotEquals(location.hashCode(), location2.hashCode());
        location2.setLatitude(123.0f);
        assertEquals(location.hashCode(), location2.hashCode());
        location2.setLongitude(456.0f);
        assertNotEquals(location.hashCode(), location2.hashCode());
        location2.setLongitude(123.0f);
        assertEquals(location.hashCode(), location2.hashCode());
    }

    Location getLocation() {
        Location location = new Location();
        location.setType("type");
        location.setLatitude(123.0f);
        location.setLongitude(123.0f);
        return location;
    }
}