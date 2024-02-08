package de.olech2412.adapter.dbadapter.model.stop.sub;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;
import de.olech2412.adapter.dbadapter.model.station.sub.Operator;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Line of the stop.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "Line", indexes = {
        @Index(name = "idx_line_id", columnList = "id"),
        @Index(name = "idx_line_stop_line_name", columnList = "stop_line_name"),
        @Index(name = "idx_line_stop_line_id", columnList = "stop_line_id"),
        @Index(name = "idx_line_stop_line_fahrtnr", columnList = "stop_line_fahrtNr")
})
public class Line {

    @ManyToOne
    @JoinColumn(name = "operator_id")
    Operator operator;

    @Column(name = "stop_line_type")
    private String type;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SerializedName("line_id") // for gson because clash with lineId
    @JsonIgnore
    private Long id;

    @Column(name = "stop_line_fahrtNr")
    private String fahrtNr;

    @Column(name = "stop_line_name")
    private String name;

    @Column(name = "stop_line_public")
    private boolean linePublic;

    @Column(name = "stop_line_productName")
    private String productName;

    @Column(name = "stop_line_id")
    @SerializedName("id") // for gson because clash with id
    private String lineId;

    @Column(name = "stop_line_product")
    private String product;

    @Column(name = "stop_line_mode")
    @Enumerated(EnumType.STRING)
    private Mode mode;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "line", fetch = FetchType.LAZY)
    @ToString.Exclude
    @JsonIgnore
    private List<Trip> trips;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return getId() != null && Objects.equals(getId(), line.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}