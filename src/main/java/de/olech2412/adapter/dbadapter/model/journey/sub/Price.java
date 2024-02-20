package de.olech2412.adapter.dbadapter.model.journey.sub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents the price of a journey.
 */
@Getter
@Setter
@ToString
public class Price {
    /**
     * The amount of the price.
     */
    private double amount;

    /**
     * The currency of the price.
     */
    private String currency;

    /**
     * A hint related to the price.
     */
    private String hint;
}