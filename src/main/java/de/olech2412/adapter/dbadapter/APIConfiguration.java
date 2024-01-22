package de.olech2412.adapter.dbadapter;

import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import de.olech2412.adapter.dbadapter.request.Request;
import de.olech2412.adapter.dbadapter.request.RequestPath;
import lombok.Getter;
import lombok.Setter;

import java.net.Proxy;
import java.util.List;

/**
 * This class stores information about all possible requests and provides configurations for {@link DB_Adapter_v6}
 *
 * @author olech2412
 * @see DB_Adapter_v6
 * @since 0.0.1
 */
public class APIConfiguration {

    @Getter
    @Setter
    private String baseUrl = "http://127.0.0.1:3000";

    @Getter
    private List<Request> requests;

    @Getter
    @Setter
    private Proxy proxy;
    
    public APIConfiguration() {
        buildRequestList();
    }

    /**
     * build the list of requests
     */
    private void buildRequestList() {
        requests = List.of(
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STOPS_BY_ID)
                        .setResponseClass(Stop.class)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STOPS_BY_ID_DEPARTURES)
                        .setResponseClass(Trip.class)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STOPS_BY_ID_ARRIVALS)
                        .setResponseClass(Trip.class)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STATIONS_BY_ID)
                        .setResponseClass(Station.class)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STATIONS)
                        .setResponseClass(Station.class)
                        .build()
        );
    }

}