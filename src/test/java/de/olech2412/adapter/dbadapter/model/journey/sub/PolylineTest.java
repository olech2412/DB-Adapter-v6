package de.olech2412.adapter.dbadapter.model.journey.sub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PolylineTest {
    private Polyline polyline;

    @BeforeEach
    void setUp() {
        polyline = new Polyline();
    }

    @Test
    void shouldSetAndGetType() {
        String expectedType = "TestType";
        polyline.setType(expectedType);
        assertEquals(expectedType, polyline.getType());
    }

    @Test
    void shouldSetAndGetTypeWhenTypeIsNull() {
        polyline.setType(null);
        assertNull(polyline.getType());
    }

    @Test
    void shouldSetAndGetFeatures() {
        Feature expectedFeature = new Feature();
        polyline.setFeatures(Collections.singletonList(expectedFeature));
        assertEquals(Collections.singletonList(expectedFeature), polyline.getFeatures());
    }

    @Test
    void shouldSetAndGetFeaturesWhenFeaturesIsNull() {
        polyline.setFeatures(null);
        assertNull(polyline.getFeatures());
    }
}