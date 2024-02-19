package de.olech2412.adapter.dbadapter.model.journey;

import de.olech2412.adapter.dbadapter.model.journey.sub.Leg;
import de.olech2412.adapter.dbadapter.model.journey.sub.Price;

import java.util.List;

/**
 * Represents a journey from one location to another.
 */
public class Journey {
    /**
     * The type of the journey.
     */
    private String type;

    /**
     * The legs of the journey. Each leg represents a part of the journey.
     */
    private List<Leg> legs;

    /**
     * The refresh token for the journey. This can be used to update the journey information.
     */
    private String refreshToken;

    /**
     * The price of the journey.
     */
    private Price price;
}
