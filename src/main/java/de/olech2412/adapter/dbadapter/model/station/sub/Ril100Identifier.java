package de.olech2412.adapter.dbadapter.model.station.sub;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.olech2412.adapter.dbadapter.model.station.Station;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * The ril100Identifiers are the abbreviations for the operating stations of Deutsche Bahn, which are defined in Directive 100 (Ril100).
 * The operating points are the railway facilities and locations with timetables that are required for mapping in IT systems.
 * The abbreviations consist of 2 to a maximum of 5 characters and usually allow conclusions to be drawn about the name of the operating station.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Ril100Identifier {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    private Long id;

    private String rilIdentifier;

    @Column(name = "ril100identifier_isMain")
    private boolean isMain;

    @Column(name = "ril100identifier_hasSteamPermission")
    private boolean hasSteamPermission;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "geographiccoordinates_id")
    @ToString.Exclude
    private GeographicCoordinates geographicCoordinates;

    @ManyToOne
    @JoinColumn(name = "station_id")
    @JsonIgnore
    private Station station;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ril100Identifier that = (Ril100Identifier) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}