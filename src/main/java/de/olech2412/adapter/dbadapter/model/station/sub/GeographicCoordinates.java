package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The geographicCoordinates are the coordinates of the station
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class GeographicCoordinates {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;

    @Column(name = "geographiccoordinates_type")
    private String type;

    @Column(name = "geographiccoordinates_coordinates_latitude")
    private float latitude;

    @Column(name = "geographiccoordinates_coordinates_longitude")
    private float longitude;

}