package de.olech2412.adapter.dbadapter.model.station;

import de.olech2412.adapter.dbadapter.model.station.sub.*;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A station represents a public transport station.
 */
@Data
@Entity
@Table(name = "stations")
public class Station {

    @Embedded
    @Column(nullable = true)
    Location location; // Location of the station
    @Embedded
    Operator operator; // Operator of the station
    @Embedded
    Address address; // Address of the station
    @Embedded
    Regionalbereich regionalbereich; // Regional area of the station
    @Embedded
    TimeTableOffice timeTableOffice; // Timetable office of the station
    @Embedded
    Szentrale szentrale; // Central office of the station
    @Embedded
    StationManagement stationManagement; // Station management of the station
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid; // Unique identifier for the station
    @Column(name = "station_id")
    private String id; // Station ID
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
    @ElementCollection
    private List<Ril100Identifier> ril100Identifiers = new ArrayList<>(); // List of Ril100 identifiers of the station

    /**
     * Returns a string representation of the Station object.
     *
     * @return a string representation of the Station object.
     */
    @Override
    public String toString() {
        return "Station{" +
                "uuid=" + uuid +
                ", id='" + id + '\'' +
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