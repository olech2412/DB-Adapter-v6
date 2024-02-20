package de.olech2412.adapter.dbadapter.model.journey.sub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Feature class represents a feature in a journey.
 * It contains a type, properties and geometry of the feature.
 */
@Getter
@Setter
@ToString
public class Feature {
    // The type of the feature
    private String type;

    // The properties of the feature
    private Properties properties;

    // The geometry of the feature
    private Geometry geometry;
}