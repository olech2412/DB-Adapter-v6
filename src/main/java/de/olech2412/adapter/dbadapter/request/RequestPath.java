package de.olech2412.adapter.dbadapter.request;

import lombok.Getter;

/**
 * This enum stores all possible request paths
 */
public enum RequestPath {

    STOPS_BY_ID("/stops/%s"),
    STOPS_BY_ID_DEPARTURES("/stops/%s/departures"),
    STOPS_BY_ID_ARRIVALS("/stops/%s/arrivals"),
    JOURNEYS("/journeys"),
    TRIPS_BY_ID("/trips/%s"),
    TRIPS("/trips"),
    LOCATIONS_NEARBY("/locations/nearby"),
    LOCATIONS("/locations"),
    RADAR("/radar"),
    STATIONS_BY_ID("/stations/%s"),
    STATIONS("/stations");

    @Getter
    private final String path;

    RequestPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }

}
