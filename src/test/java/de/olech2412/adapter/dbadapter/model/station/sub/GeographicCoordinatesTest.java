package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeographicCoordinatesTest {

    @Test
    void creatingGeographicCoordinatesShouldSetAllFieldsCorrectly() {
        GeographicCoordinates geographicCoordinates = new GeographicCoordinates();
        geographicCoordinates.setId(1L);
        geographicCoordinates.setType("Type");
        geographicCoordinates.setLatitude(52.5200f);
        geographicCoordinates.setLongitude(13.4050f);

        assertEquals(1L, geographicCoordinates.getId());
        assertEquals("Type", geographicCoordinates.getType());
        assertEquals(52.5200f, geographicCoordinates.getLatitude());
        assertEquals(13.4050f, geographicCoordinates.getLongitude());
    }

    @Test
    void equalsShouldReturnFalseForSameId() {
        GeographicCoordinates geographicCoordinates1 = new GeographicCoordinates();
        geographicCoordinates1.setId(1L);

        GeographicCoordinates geographicCoordinates2 = new GeographicCoordinates();
        geographicCoordinates2.setId(1L);

        assertFalse(geographicCoordinates1.equals(geographicCoordinates2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        GeographicCoordinates geographicCoordinates1 = new GeographicCoordinates();
        geographicCoordinates1.setId(1L);

        GeographicCoordinates geographicCoordinates2 = new GeographicCoordinates();
        geographicCoordinates2.setId(2L);

        assertFalse(geographicCoordinates1.equals(geographicCoordinates2));
    }

    @Test
    void hashCodeShouldBeDiffForSameClass() {
        GeographicCoordinates geographicCoordinates1 = new GeographicCoordinates();
        GeographicCoordinates geographicCoordinates2 = new GeographicCoordinates();

        assertNotEquals(geographicCoordinates1.hashCode(), geographicCoordinates2.hashCode());
    }
}