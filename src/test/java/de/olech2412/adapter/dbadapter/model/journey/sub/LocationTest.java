package de.olech2412.adapter.dbadapter.model.journey.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {

    @Test
    void shouldSetAndGetLatitude() {
        Location location = new Location();
        double expectedLatitude = 50.8503;
        location.setLatitude(expectedLatitude);
        assertEquals(expectedLatitude, location.getLatitude());
    }

    @Test
    void shouldSetAndGetLatitudeWhenLatitudeIsZero() {
        Location location = new Location();
        location.setLatitude(0);
        assertEquals(0, location.getLatitude());
    }

    @Test
    void shouldSetAndGetLongitude() {
        Location location = new Location();
        double expectedLongitude = 4.3517;
        location.setLongitude(expectedLongitude);
        assertEquals(expectedLongitude, location.getLongitude());
    }

    @Test
    void shouldSetAndGetLongitudeWhenLongitudeIsZero() {
        Location location = new Location();
        location.setLongitude(0);
        assertEquals(0, location.getLongitude());
    }
}