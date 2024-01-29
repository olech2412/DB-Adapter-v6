package de.olech2412.adapter.dbadapter.model.stop.sub;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Location of the stop.
 */
@Data
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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