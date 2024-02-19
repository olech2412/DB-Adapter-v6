package de.olech2412.adapter.dbadapter.model.journey.sub;

import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import de.olech2412.adapter.dbadapter.model.trip.sub.Remark;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Represents a leg of a journey.
 */
@Getter
@Setter
public class Leg {
    /**
     * The origin stop of the leg.
     */
    private Stop origin;

    /**
     * The destination stop of the leg.
     */
    private Stop destination;

    /**
     * The departure time of the leg.
     */
    private String departure;

    /**
     * The planned departure time of the leg.
     */
    private String plannedDeparture;

    /**
     * The delay in departure of the leg in minutes.
     */
    private int departureDelay;

    /**
     * The arrival time of the leg.
     */
    private String arrival;

    /**
     * The planned arrival time of the leg.
     */
    private String plannedArrival;

    /**
     * The delay in arrival of the leg in minutes.
     */
    private int arrivalDelay;

    /**
     * Indicates if the leg is reachable.
     */
    private boolean reachable;

    /**
     * The trip ID of the leg.
     */
    private String tripId;

    /**
     * The line of the leg.
     */
    private Line line;

    /**
     * The direction of the leg.
     */
    private String direction;

    /**
     * The current location of the leg.
     */
    private Location currentLocation;

    /**
     * The arrival platform of the leg.
     */
    private String arrivalPlatform;

    /**
     * The planned arrival platform of the leg.
     */
    private String plannedArrivalPlatform;

    /**
     * The type of arrival prognosis of the leg.
     */
    private String arrivalPrognosisType;

    /**
     * The departure platform of the leg.
     */
    private String departurePlatform;

    /**
     * The planned departure platform of the leg.
     */
    private String plannedDeparturePlatform;

    /**
     * The type of departure prognosis of the leg.
     */
    private String departurePrognosisType;

    /**
     * The remarks for the leg.
     */
    private List<Remark> remarks;

    /**
     * The load factor of the leg.
     */
    private String loadFactor;
}