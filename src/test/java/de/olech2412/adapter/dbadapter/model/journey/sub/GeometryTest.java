package de.olech2412.adapter.dbadapter.model.journey.sub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeometryTest {
    private Geometry geometry;

    @BeforeEach
    void setUp() {
        geometry = new Geometry();
    }

    @Test
    void shouldSetAndGetType() {
        String expectedType = "Point";
        geometry.setType(expectedType);
        assertEquals(expectedType, geometry.getType());
    }

    @Test
    void shouldSetAndGetTypeWhenTypeIsNull() {
        geometry.setType(null);
        assertNull(geometry.getType());
    }

    @Test
    void shouldSetAndGetCoordinates() {
        List<Double> expectedCoordinates = Arrays.asList(1.0, 2.0);
        geometry.setCoordinates(expectedCoordinates);
        assertEquals(expectedCoordinates, geometry.getCoordinates());
    }

    @Test
    void shouldSetAndGetCoordinatesWhenCoordinatesIsNull() {
        geometry.setCoordinates(null);
        assertNull(geometry.getCoordinates());
    }

    @Test
    void shouldSetAndGetCoordinatesWhenCoordinatesIsEmpty() {
        geometry.setCoordinates(new ArrayList<>());
        assertTrue(geometry.getCoordinates().isEmpty());
    }
}