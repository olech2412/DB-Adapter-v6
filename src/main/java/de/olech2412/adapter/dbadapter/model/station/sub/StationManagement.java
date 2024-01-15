package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * StationManagement is an organisational unit of DB Station&Service AG that is responsible for the planning, management and monitoring of operational and commercial processes at the stations.
 * Station Management is divided into 21 regions, each of which includes several federal states or parts thereof.
 * Each region has a manager who is responsible for the quality, safety, cleanliness and customer orientation at the stations.
 */
@Data
@Embeddable
public class StationManagement {
    @Column(name = "station_management_number", nullable = true)
    private int number; // the region number
    @Column(name = "station_management_name", nullable = true)
    private String name;

    @Override
    public String toString() {
        return "StationManagement{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}