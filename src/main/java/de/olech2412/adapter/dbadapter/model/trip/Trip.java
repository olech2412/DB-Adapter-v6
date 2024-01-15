package de.olech2412.adapter.dbadapter.model.trip;

import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import de.olech2412.adapter.dbadapter.model.trip.sub.Remark;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "trips", indexes = {@Index(name = "created_at_index", columnList = "createdAt")})
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "trip_id",nullable = true)
    private String tripId;

    @ManyToOne
    @JoinColumn(name = "stop_uuid")
    private Stop stop;
    @Column(name = "trip_when", nullable = true)
    private String when;
    @Column(name = "trip_planned_when", nullable = true)
    private String plannedWhen;
    @Column(name = "trip_prognosed_when", nullable = true)
    private String prognosedWhen;
    @Column(name = "trip_delay", nullable = true)
    private Integer delay;
    @Column(name = "trip_platform", nullable = true)
    private String platform;
    @Column(name = "trip_planned_platform", nullable = true)
    private String plannedPlatform;
    @Column(name = "trip_prognosed_platform", nullable = true)
    private String prognosedPlatform;
    @Column(name = "trip_prognosis_type", nullable = true)
    private String prognosisType;
    @Column(name = "trip_direction", nullable = true)
    private String direction;
    @Column(name = "trip_provenance", nullable = true)
    private String provenance;
    @Column(name = "trip_line", nullable = true)
    private Line line;
    @ManyToOne
    @JoinColumn(name = "origin_uuid", nullable = true)
    private Stop origin;
    @ManyToOne
    @JoinColumn(name = "destination_uuid", nullable = true)
    private Stop destination;
    @Column(name = "trip_cancelled", nullable = true)
    private Boolean cancelled;
    @Column(name = "trip_load_factor", nullable = true)
    private String loadFactor;
    @ElementCollection
    private List<Remark> remarks = new ArrayList<>();
    private LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public String toString() {
        return "Trip{" +
                "tripId='" + tripId + '\'' +
                ", stop=" + stop +
                ", when='" + when + '\'' +
                ", plannedWhen='" + plannedWhen + '\'' +
                ", prognosedWhen='" + prognosedWhen + '\'' +
                ", delay=" + delay +
                ", platform='" + platform + '\'' +
                ", plannedPlatform='" + plannedPlatform + '\'' +
                ", prognosedPlatform='" + prognosedPlatform + '\'' +
                ", prognosisType='" + prognosisType + '\'' +
                ", direction='" + direction + '\'' +
                ", provenance='" + provenance + '\'' +
                ", line=" + line +
                ", origin=" + origin +
                ", destination=" + destination +
                ", cancelled=" + cancelled +
                ", loadFactor='" + loadFactor + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;

        Trip trip = (Trip) o;

        if (getTripId() != null ? !getTripId().equals(trip.getTripId()) : trip.getTripId() != null) return false;
        if (getStop() != null ? !getStop().equals(trip.getStop()) : trip.getStop() != null) return false;
        if (getWhen() != null ? !getWhen().equals(trip.getWhen()) : trip.getWhen() != null) return false;
        if (getPlannedWhen() != null ? !getPlannedWhen().equals(trip.getPlannedWhen()) : trip.getPlannedWhen() != null)
            return false;

        return true;
    }
}