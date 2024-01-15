package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * The geographicCoordinates are the coordinates of the station
 */
@Data
@Embeddable
public class GeographicCoordinates {
    @Column(name = "geographiccoordinates_type", nullable = true)
    private String type;
    @Column(name = "geographiccoordinates_coordinates", nullable = true)
    private float[] coordinates;

    @Override
    public String toString() {
        return "GeographicCoordinates{" +
                "type='" + type + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}