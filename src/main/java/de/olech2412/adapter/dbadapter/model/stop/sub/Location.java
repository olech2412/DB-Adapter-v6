package de.olech2412.adapter.dbadapter.model.stop.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Location {

    @Column(name = "stop_location_latitude", nullable = true)
    private double latitude;
    @Column(name = "stop_location_longitude", nullable = true)
    private double longitude;

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}