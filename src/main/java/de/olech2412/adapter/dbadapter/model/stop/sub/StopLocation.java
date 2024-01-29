package de.olech2412.adapter.dbadapter.model.stop.sub;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * Location of the stop.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class StopLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SerializedName("stop_location_id")
    private Long id;

    @Column(name = "stop_location_latitude")
    private double latitude;

    @Column(name = "stop_location_longitude")
    private double longitude;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StopLocation that = (StopLocation) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}