package de.olech2412.adapter.dbadapter.model.journey.sub;

import de.olech2412.adapter.dbadapter.model.stop.Stop;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Stopover class represents a stopover in a journey.
 * It contains details about the stop, arrival and departure information.
 */
@Getter
@Setter
@ToString
public class Stopover {
    // The stop details
    private Stop stop;

    // The arrival time
    private String arrival;

    // The planned arrival time
    private String plannedArrival;

    // The delay in arrival
    private Integer arrivalDelay;

    // The arrival platform
    private String arrivalPlatform;

    // The type of arrival prognosis
    private String arrivalPrognosisType;

    // The planned arrival platform
    private String plannedArrivalPlatform;

    // The departure time
    private String departure;

    // The planned departure time
    private String plannedDeparture;

    // The delay in departure
    private Integer departureDelay;

    // The departure platform
    private String departurePlatform;

    // The type of departure prognosis
    private String departurePrognosisType;

    // The planned departure platform
    private String plannedDeparturePlatform;
}