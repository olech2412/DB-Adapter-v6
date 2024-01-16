package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * The operator is the company that operates the station.
 */
@Data
@Embeddable
public class Operator {
    @Column(name = "operator_type", nullable = true)
    private String type;
    @Column(name = "operator_id", nullable = true)
    private String id;
    @Column(name = "operator_name", nullable = true)
    private String name;

    @Override
    public String toString() {
        return "Operator{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}