package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * The location is the geographical location of the station.
 */
@Data
@Embeddable
public class Location {
    @Column(name = "location_type", nullable = true)
    private String type;
    @Column(nullable = true, name = "location_latitude")
    private float latitude;
    @Column(nullable = true, name = "location_longitude")
    private float longitude;

    @Override
    public String toString() {
        return "Location{" +
                "type='" + type + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}