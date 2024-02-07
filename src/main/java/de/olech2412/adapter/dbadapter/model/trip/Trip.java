package de.olech2412.adapter.dbadapter.model.trip;

import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import de.olech2412.adapter.dbadapter.model.trip.sub.Remark;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "trips", indexes = {
        @Index(name = "created_at_index", columnList = "createdAt"),
        @Index(name = "idx_trip_trip_when", columnList = "trip_when"),
        @Index(name = "idx_trip_trip_planned_when", columnList = "trip_planned_when"),
        @Index(name = "idx_trip_trip_prognosed_when", columnList = "trip_prognosed_when"),
        @Index(name = "idx_trip_stop_id", columnList = "stop_id"),
        @Index(name = "idx_trip_line_id", columnList = "line_id"),
        @Index(name = "idx_trip_trip_id", columnList = "trip_id")
})
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "trip_id")
    private String tripId;

    @ManyToOne
    @JoinColumn(name = "stop_id")
    private Stop stop;

    @Column(name = "trip_when")
    private LocalDateTime when;

    @Column(name = "trip_planned_when")
    private LocalDateTime plannedWhen;

    @Column(name = "trip_prognosed_when")
    private LocalDateTime prognosedWhen;

    @Column(name = "trip_delay")
    private Integer delay;

    @Column(name = "trip_platform")
    private String platform;

    @Column(name = "trip_planned_platform")
    private String plannedPlatform;

    @Column(name = "trip_prognosed_platform")
    private String prognosedPlatform;

    @Column(name = "trip_prognosis_type")
    private String prognosisType;

    @Column(name = "trip_direction")
    private String direction;

    @Column(name = "trip_provenance")
    private String provenance;

    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line line;

    @ManyToOne
    @JoinColumn(name = "origin_id")
    private Stop origin;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Stop destination;

    @Column(name = "trip_cancelled")
    private Boolean cancelled;

    @Column(name = "trip_load_factor")
    private String loadFactor;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "trip_remark",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = @JoinColumn(name = "remark_id"))
    @ToString.Exclude
    private List<Remark> remarks = new ArrayList<>();

    private LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return getId() != null && Objects.equals(getId(), trip.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}