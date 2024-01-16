package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LocationTest {

    @Test
    void testToString() {
        Location location = getLocation();
        assertEquals("Location{latitude=1.0, longitude=2.0}", location.toString());
    }

    @Test
    void getLatitude() {
        Location location = getLocation();
        assertEquals(1.0, location.getLatitude());
    }

    @Test
    void getLongitude() {
        Location location = getLocation();
        assertEquals(2.0, location.getLongitude());
    }

    @Test
    void setLatitude() {
        Location location = getLocation();
        assertEquals(1.0, location.getLatitude());
        location.setLatitude(3.0);
        assertEquals(3.0, location.getLatitude());
    }

    @Test
    void setLongitude() {
        Location location = getLocation();
        assertEquals(2.0, location.getLongitude());
        location.setLongitude(4.0);
        assertEquals(4.0, location.getLongitude());
    }

    @Test
    void testEquals() {
        Location location = getLocation();
        assertEquals(location, location);
        assertNotEquals(location, null);
        assertNotEquals(location, new Object());
        Location location2 = getLocation();
        assertEquals(location, location2);
        location2.setLatitude(3.0);
        assertNotEquals(location, location2);
        location2.setLatitude(1.0);
        assertEquals(location, location2);
        location2.setLongitude(4.0);
        assertNotEquals(location, location2);
        location2.setLongitude(2.0);
        assertEquals(location, location2);
    }

    @Test
    void testHashCode() {
        Location location = getLocation();
        assertEquals(location.hashCode(), location.hashCode());
        assertNotEquals(location.hashCode(), new Object().hashCode());
        Location location2 = getLocation();
        assertEquals(location.hashCode(), location2.hashCode());
        location2.setLatitude(3.0);
        assertNotEquals(location.hashCode(), location2.hashCode());
        location2.setLatitude(1.0);
        assertEquals(location.hashCode(), location2.hashCode());
        location2.setLongitude(4.0);
        assertNotEquals(location.hashCode(), location2.hashCode());
        location2.setLongitude(2.0);
        assertEquals(location.hashCode(), location2.hashCode());
    }

    Location getLocation() {
        Location location = new Location();
        location.setLatitude(1.0);
        location.setLongitude(2.0);
        return location;
    }
}