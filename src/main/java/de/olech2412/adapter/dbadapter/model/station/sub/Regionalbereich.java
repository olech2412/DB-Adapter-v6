package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The regional area is an organisational unit of Deutsche Bahn that is responsible for the coordination and control of railway operations.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Regionalbereich {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "regionalbereich_number")
    private int number;

    @Column(name = "regionalbereich_name")
    private String name;

    @Column(name = "regionalbereich_shortname")
    private String shortName;

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}