package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GeographicCoordinatesTest {

    @Test
    void getType() {
        GeographicCoordinates geographicCoordinates = getGeographicCoordinates();
        assertEquals("type", geographicCoordinates.getType());
    }

    @Test
    void setType() {
        GeographicCoordinates geographicCoordinates = getGeographicCoordinates();
        assertEquals("type", geographicCoordinates.getType());
        geographicCoordinates.setType("type2");
        assertEquals("type2", geographicCoordinates.getType());
    }

    @Test
    void testEquals() {
        GeographicCoordinates geographicCoordinates = getGeographicCoordinates();
        assertEquals(geographicCoordinates, geographicCoordinates);

        GeographicCoordinates geographicCoordinates2 = getGeographicCoordinates();
        geographicCoordinates2.setType("type2");
        assertNotEquals(geographicCoordinates, geographicCoordinates2);
    }

    @Test
    void testHashCode() {
        GeographicCoordinates geographicCoordinates = getGeographicCoordinates();
        assertEquals(geographicCoordinates.hashCode(), geographicCoordinates.hashCode());

        GeographicCoordinates geographicCoordinates2 = getGeographicCoordinates();
        geographicCoordinates2.setType("type2");
        assertNotEquals(geographicCoordinates.hashCode(), geographicCoordinates2.hashCode());
    }

    GeographicCoordinates getGeographicCoordinates() {
        GeographicCoordinates geographicCoordinates = new GeographicCoordinates();
        geographicCoordinates.setType("type");
        geographicCoordinates.setCoordinates(float[].class.cast(new float[]{Float.parseFloat("123.0"), Float.parseFloat("123.0")}));
        return geographicCoordinates;
    }
}