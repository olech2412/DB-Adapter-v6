package de.olech2412.adapter.dbadapter.model.journey.sub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a location in the system.
 */
@Getter
@Setter
@ToString
public class Location {
    /**
     * The type of the location.
     */
    private String type;

    /**
     * The ID of the location.
     */
    private String id;

    /**
     * The latitude of the location.
     */
    private double latitude;

    /**
     * The longitude of the location.
     */
    private double longitude;
}