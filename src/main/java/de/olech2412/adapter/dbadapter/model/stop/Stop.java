package de.olech2412.adapter.dbadapter.model.stop;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;
import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.sub.Products;
import de.olech2412.adapter.dbadapter.model.stop.sub.StopLocation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A stop represents a public transport station.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "stops", indexes = {
        @Index(name = "idx_stop_stop_id", columnList = "stop_id"),
        @Index(name = "idx_stop_stop_name", columnList = "stop_name")
})
public class Stop {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SerializedName("stop_id") // for gson because clash with stopId (see below)
    @JsonIgnore
    private Long id;

    @Column(name = "stop_type")
    private String type;

    @Column(name = "stop_id", unique = true, nullable = false)
    @SerializedName("id") // for gson because clash with id (see above)
    private Long stopId;

    @Column(name = "stop_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "stop_location_id")
    private StopLocation location;

    @Embedded
    private Products products;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stop stop = (Stop) o;
        return getId() != null && Objects.equals(getId(), stop.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}