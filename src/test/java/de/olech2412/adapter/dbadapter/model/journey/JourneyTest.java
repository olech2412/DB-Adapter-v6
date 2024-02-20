package de.olech2412.adapter.dbadapter.model.journey;

import de.olech2412.adapter.dbadapter.model.journey.sub.Leg;
import de.olech2412.adapter.dbadapter.model.journey.sub.Price;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JourneyTest {
    private Journey journey;

    @BeforeEach
    void setUp() {
        journey = new Journey();
    }

    @Test
    void shouldSetAndGetType() {
        String expectedType = "TestType";
        journey.setType(expectedType);
        assertEquals(expectedType, journey.getType());
    }

    @Test
    void shouldSetAndGetTypeWhenTypeIsNull() {
        journey.setType(null);
        assertNull(journey.getType());
    }

    @Test
    void shouldSetAndGetLegs() {
        Leg expectedLeg = new Leg();
        journey.setLegs(Collections.singletonList(expectedLeg));
        assertEquals(Collections.singletonList(expectedLeg), journey.getLegs());
    }

    @Test
    void shouldSetAndGetLegsWhenLegsIsNull() {
        journey.setLegs(null);
        assertNull(journey.getLegs());
    }

    @Test
    void shouldSetAndGetRefreshToken() {
        String expectedRefreshToken = "TestRefreshToken";
        journey.setRefreshToken(expectedRefreshToken);
        assertEquals(expectedRefreshToken, journey.getRefreshToken());
    }

    @Test
    void shouldSetAndGetRefreshTokenWhenRefreshTokenIsNull() {
        journey.setRefreshToken(null);
        assertNull(journey.getRefreshToken());
    }

    @Test
    void shouldSetAndGetPrice() {
        Price expectedPrice = new Price();
        journey.setPrice(expectedPrice);
        assertEquals(expectedPrice, journey.getPrice());
    }

    @Test
    void shouldSetAndGetPriceWhenPriceIsNull() {
        journey.setPrice(null);
        assertNull(journey.getPrice());
    }
}