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

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "station_id")
    private String id;
    private float relevance;
    private float score;
    private float weight;
    private String type;

    private String ril100;
    private float nr;
    private String name;
    @Embedded
    @Column(nullable = true)
    Location location;
    @Embedded
    Operator operator;
    @Embedded
    Address address;
    private float category;
    private float priceCategory;
    private boolean hasParking;
    private boolean hasBicycleParking;
    private boolean hasLocalPublicTransport;
    private boolean hasPublicFacilities;
    private boolean hasLockerSystem;
    private boolean hasTaxiRank;
    private boolean hasTravelNecessities;
    private String hasSteplessAccess;
    private String hasMobilityService;
    private boolean hasWiFi;
    private boolean hasTravelCenter;
    private boolean hasRailwayMission;
    private boolean hasDBLounge;
    private boolean hasLostAndFound;
    private boolean hasCarRental;
    private String federalState;
    private LocalDateTime createdAt = LocalDateTime.now();
    @Embedded
    Regionalbereich regionalbereich;
    @Embedded
    TimeTableOffice timeTableOffice;
    @Embedded
    Szentrale szentrale;
    @Embedded
    StationManagement stationManagement;
    @ElementCollection
    private List<Ril100Identifier> ril100Identifiers = new ArrayList<>();

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