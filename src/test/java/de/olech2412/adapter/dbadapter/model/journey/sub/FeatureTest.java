package de.olech2412.adapter.dbadapter.model.journey.sub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FeatureTest {
    private Feature feature;

    @BeforeEach
    void setUp() {
        feature = new Feature();
    }

    @Test
    void shouldSetAndGetType() {
        String expectedType = "TestType";
        feature.setType(expectedType);
        assertEquals(expectedType, feature.getType());
    }

    @Test
    void shouldSetAndGetTypeWhenTypeIsNull() {
        feature.setType(null);
        assertNull(feature.getType());
    }

    @Test
    void shouldSetAndGetProperties() {
        Properties expectedProperties = new Properties();
        feature.setProperties(expectedProperties);
        assertEquals(expectedProperties, feature.getProperties());
    }

    @Test
    void shouldSetAndGetPropertiesWhenPropertiesIsNull() {
        feature.setProperties(null);
        assertNull(feature.getProperties());
    }

    @Test
    void shouldSetAndGetGeometry() {
        Geometry expectedGeometry = new Geometry();
        feature.setGeometry(expectedGeometry);
        assertEquals(expectedGeometry, feature.getGeometry());
    }

    @Test
    void shouldSetAndGetGeometryWhenGeometryIsNull() {
        feature.setGeometry(null);
        assertNull(feature.getGeometry());
    }
}