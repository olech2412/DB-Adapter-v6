package de.olech2412.adapter.dbadapter.model.station;

import com.google.gson.annotations.SerializedName;
import de.olech2412.adapter.dbadapter.model.station.sub.*;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * A station represents a public transport station.
 */
@Getter
@Setter
@Data
@Entity
@Table(name = "stations", indexes = {
        @Index(name = "idx_station_station_id", columnList = "station_id")
})
public class Station {

    @OneToOne(cascade = CascadeType.ALL)
    StationLocation location; // Location of the station
    @ManyToOne
    @JoinColumn(name = "operator_id")
    Operator operator; // Operator of the station
    @OneToOne(cascade = CascadeType.ALL)
    Address address; // Address of the station
    @ManyToOne
    @JoinColumn(name = "regionalbereich_id")
    Regionalbereich regionalbereich; // Regional area of the station
    @OneToOne(cascade = CascadeType.ALL)
    TimeTableOffice timeTableOffice; // Timetable office of the station
    @ManyToOne
    @JoinColumn(name = "szentrale_id")
    Szentrale szentrale; // Central office of the station
    @OneToOne(cascade = CascadeType.ALL)
    StationManagement stationManagement; // Station management of the station
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SerializedName("stationId")
    private long id; // Unique identifier for the station
    @Column(name = "station_id", unique = true, nullable = false)
    @SerializedName("id")
    private Long stationId; // Station ID

    private float relevance; // Relevance score of the station

    private float score; // Score of the station

    private float weight; // Weight of the station

    private String type; // Type of the station

    private String ril100; // Ril100 identifier of the station

    private float nr; // Number of the station

    private String name; // Name of the station

    private float category; // Category of the station

    private float priceCategory; // Price category of the station

    private boolean hasParking; // Flag indicating if the station has parking

    private boolean hasBicycleParking; // Flag indicating if the station has bicycle parking

    private boolean hasLocalPublicTransport; // Flag indicating if the station has local public transport

    private boolean hasPublicFacilities; // Flag indicating if the station has public facilities

    private boolean hasLockerSystem; // Flag indicating if the station has a locker system

    private boolean hasTaxiRank; // Flag indicating if the station has a taxi rank

    private boolean hasTravelNecessities; // Flag indicating if the station has travel necessities

    private String hasSteplessAccess; // Flag indicating if the station has stepless access

    private String hasMobilityService; // Flag indicating if the station has a mobility service

    private boolean hasWiFi; // Flag indicating if the station has WiFi

    private boolean hasTravelCenter; // Flag indicating if the station has a travel center

    private boolean hasRailwayMission; // Flag indicating if the station has a railway mission

    private boolean hasDBLounge; // Flag indicating if the station has a DB Lounge

    private boolean hasLostAndFound; // Flag indicating if the station has a lost and found

    private boolean hasCarRental; // Flag indicating if the station has a car rental

    private String federalState; // Federal state where the station is located

    private LocalDateTime createdAt = LocalDateTime.now(); // Creation date and time of the station

    @OneToMany(mappedBy = "id")
    private List<Ril100Identifier> ril100Identifiers; // List of Ril100 identifiers of the station

    @OneToMany(mappedBy = "id")
    private List<Stop> stop;

    @OneToOne
    private ProductLine productLine;

    /**
     * Returns a string representation of the Station object.
     *
     * @return a string representation of the Station object.
     */
    @Override
    public String toString() {
        return "Station{" +
                "id=" + stationId +
                ", id='" + stationId + '\'' +
                ", relevance=" + relevance +
                ", score=" + score +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", ril100='" + ril100 + '\'' +
                ", nr=" + nr +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", operator=" + operator +
                ", address=" + address +
                ", category=" + category +
                ", priceCategory=" + priceCategory +
                ", hasParking=" + hasParking +
                ", hasBicycleParking=" + hasBicycleParking +
                ", hasLocalPublicTransport=" + hasLocalPublicTransport +
                ", hasPublicFacilities=" + hasPublicFacilities +
                ", hasLockerSystem=" + hasLockerSystem +
                ", hasTaxiRank=" + hasTaxiRank +
                ", hasTravelNecessities=" + hasTravelNecessities +
                ", hasSteplessAccess='" + hasSteplessAccess + '\'' +
                ", hasMobilityService='" + hasMobilityService + '\'' +
                ", hasWiFi=" + hasWiFi +
                ", hasTravelCenter=" + hasTravelCenter +
                ", hasRailwayMission=" + hasRailwayMission +
                ", hasDBLounge=" + hasDBLounge +
                ", hasLostAndFound=" + hasLostAndFound +
                ", hasCarRental=" + hasCarRental +
                ", federalState='" + federalState + '\'' +
                ", createdAt=" + createdAt +
                ", regionalbereich=" + regionalbereich +
                ", timeTableOffice=" + timeTableOffice +
                ", szentrale=" + szentrale +
                ", stationManagement=" + stationManagement +
                ", ril100Identifiers=" + ril100Identifiers +
                '}';
    }
}