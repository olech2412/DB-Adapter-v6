package de.olech2412.adapter.dbadapter.model.station.sub;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.olech2412.adapter.dbadapter.model.station.Station;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * StationManagement is an organisational unit of DB Station&Service AG that is responsible for the planning, management and monitoring of operational and commercial processes at the stations.
 * Station Management is divided into 21 regions, each of which includes several federal states or parts thereof.
 * Each region has a manager who is responsible for the quality, safety, cleanliness and customer orientation at the stations.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class StationManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    private Long id;

    @Column(name = "station_management_number")
    private int number; // the region number

    @Column(name = "station_management_name")
    private String name;

    @OneToMany(mappedBy = "stationManagement", fetch = FetchType.LAZY)
    @ToString.Exclude
    @JsonIgnore
    private java.util.List<Station> stations;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationManagement that = (StationManagement) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}