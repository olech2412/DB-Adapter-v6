package de.olech2412.adapter.dbadapter.model.journey.sub;

import de.olech2412.adapter.dbadapter.model.stop.sub.Products;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Properties of a property.
 */
@Getter
@Setter
@ToString
public class Properties {
    // The type of the property
    private String type;

    // The id of the property
    private String id;

    // The name of the property
    private String name;

    // The location of the property
    private Location location;

    // The products associated with the property
    private Products products;
}