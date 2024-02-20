package de.olech2412.adapter.dbadapter.model.journey.sub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The Polyline class represents a polyline in a journey.
 * It contains a type and a list of features associated with the polyline.
 */
@Getter
@Setter
@ToString
public class Polyline {
    // The type of the polyline
    private String type;

    // A list of features associated with the polyline
    private List<Feature> features;
}