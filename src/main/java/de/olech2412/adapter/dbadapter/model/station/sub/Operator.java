package de.olech2412.adapter.dbadapter.model.station.sub;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @SerializedName("operator_id")
    private Long id;

    @Column(name = "operator_type")
    private String type;

    @Column(name = "operator_id", unique = true)
    @SerializedName("id")
    private String operatorId;

    @Column(name = "operator_name", unique = true)
    private String name;

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