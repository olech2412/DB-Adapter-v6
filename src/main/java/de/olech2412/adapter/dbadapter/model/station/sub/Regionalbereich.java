package de.olech2412.adapter.dbadapter.model.station.sub;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.olech2412.adapter.dbadapter.model.station.Station;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    private long id;

    @Column(name = "regionalbereich_number")
    private int number;

    @Column(name = "regionalbereich_name")
    private String name;

    @Column(name = "regionalbereich_shortname")
    private String shortName;

    @OneToMany(mappedBy = "regionalbereich", fetch = FetchType.LAZY)
    @ToString.Exclude
    @JsonIgnore
    private List<Station> stations;

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}