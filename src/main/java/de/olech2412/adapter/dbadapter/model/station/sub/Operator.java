package de.olech2412.adapter.dbadapter.model.station.sub;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;
import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;

/**
 * The operator is the company that operates the station.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Operator {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE)
    @SerializedName("operator_id")
    @JsonIgnore
    private Long id;

    @Column(name = "operator_type")
    private String type;

    @Column(name = "operator_id", unique = true)
    @SerializedName("id")
    private String operatorId;

    @Column(name = "operator_name", unique = true)
    private String name;

    @OneToMany(mappedBy = "operator", fetch = FetchType.LAZY)
    @ToString.Exclude
    @JsonIgnore
    private List<Station> stations;

    @OneToMany(mappedBy = "operator", fetch = FetchType.LAZY)
    @ToString.Exclude
    @JsonIgnore
    private List<Line> lines;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return getId() != null && Objects.equals(getId(), operator.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}