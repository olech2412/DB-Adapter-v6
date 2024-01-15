package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

/**
 * The ril100Identifiers are the abbreviations for the operating stations of Deutsche Bahn, which are defined in Directive 100 (Ril100).
 * The operating points are the railway facilities and locations with timetables that are required for mapping in IT systems.
 * The abbreviations consist of 2 to a maximum of 5 characters and usually allow conclusions to be drawn about the name of the operating station.
 */
@Data
@Embeddable
public class Ril100Identifier {
    private String rilIdentifier;
    @Column(name = "ril100identifier_isMain", nullable = true)
    private boolean isMain;
    @Column(name = "ril100identifier_hasSteamPermission", nullable = true)
    private boolean hasSteamPermission;
    @Embedded
    @Column(name = "ril100identifier_geographicCoordinates", nullable = true)
    private GeographicCoordinates geographicCoordinates;

    @Override
    public String toString() {
        return "Ril100Identifier{" +
                "rilIdentifier='" + rilIdentifier + '\'' +
                ", isMain=" + isMain +
                ", hasSteamPermission=" + hasSteamPermission +
                ", geographicCoordinates=" + geographicCoordinates +
                '}';
    }
}