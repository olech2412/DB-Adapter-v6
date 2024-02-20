package de.olech2412.adapter.dbadapter.model.journey.sub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PriceTest {
    private Price price;

    @BeforeEach
    void setUp() {
        price = new Price();
    }

    @Test
    void shouldSetAndGetAmount() {
        double expectedAmount = 10.0;
        price.setAmount(expectedAmount);
        assertEquals(expectedAmount, price.getAmount());
    }

    @Test
    void shouldSetAndGetAmountWhenAmountIsZero() {
        double expectedAmount = 0.0;
        price.setAmount(expectedAmount);
        assertEquals(expectedAmount, price.getAmount());
    }

    @Test
    void shouldSetAndGetCurrency() {
        String expectedCurrency = "USD";
        price.setCurrency(expectedCurrency);
        assertEquals(expectedCurrency, price.getCurrency());
    }

    @Test
    void shouldSetAndGetCurrencyWhenCurrencyIsNull() {
        price.setCurrency(null);
        assertNull(price.getCurrency());
    }

    @Test
    void shouldSetAndGetHint() {
        String expectedHint = "This is a hint.";
        price.setHint(expectedHint);
        assertEquals(expectedHint, price.getHint());
    }

    @Test
    void shouldSetAndGetHintWhenHintIsNull() {
        price.setHint(null);
        assertNull(price.getHint());
    }
}