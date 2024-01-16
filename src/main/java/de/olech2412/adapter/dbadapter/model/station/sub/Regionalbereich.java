package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * The regional area is an organisational unit of Deutsche Bahn that is responsible for the coordination and control of railway operations.
 */
@Data
@Embeddable
public class Regionalbereich {
    @Column(name = "regionalbereich_number", nullable = true)
    private int number;
    @Column(name = "regionalbereich_name", nullable = true)
    private String name;
    @Column(name = "regionalbereich_shortname", nullable = true)
    private String shortName;

    @Override
    public String toString() {
        return "Regionalbereich{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}