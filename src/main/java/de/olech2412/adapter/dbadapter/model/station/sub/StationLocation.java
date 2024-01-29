package de.olech2412.adapter.dbadapter.model.station.sub;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * The location is the geographical location of the station.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class StationLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "location_id")
    @SerializedName("station_location_id")
    private Long id;

    @Column(name = "location_latitude")
    private float latitude;

    @Column(name = "location_longitude")
    private float longitude;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationLocation that = (StationLocation) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}