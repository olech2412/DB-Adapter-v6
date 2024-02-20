package de.olech2412.adapter.dbadapter.model.journey.sub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The Geometry class represents the geometric coordinates of a location.
 * It contains a type and a list of coordinates.
 */
@Getter
@Setter
@ToString
public class Geometry {
    // The type of the geometry
    private String type;

    // The coordinates of the geometry
    private List<Double> coordinates;
}