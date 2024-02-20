package de.olech2412.adapter.dbadapter.model.journey.sub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PropertiesTest {
    private Properties properties;

    @BeforeEach
    void setUp() {
        properties = new Properties();
    }

    @Test
    void shouldSetAndGetName() {
        String expectedName = "TestName";
        properties.setName(expectedName);
        assertEquals(expectedName, properties.getName());
    }

    @Test
    void shouldSetAndGetNameWhenNameIsNull() {
        properties.setName(null);
        assertNull(properties.getName());
    }
}