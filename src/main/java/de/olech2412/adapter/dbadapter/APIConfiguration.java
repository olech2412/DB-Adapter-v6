package de.olech2412.adapter.dbadapter;

import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import de.olech2412.adapter.dbadapter.request.Request;
import de.olech2412.adapter.dbadapter.request.RequestPath;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class APIConfiguration {

    @Getter
    @Setter
    private String baseUrl = "https://v6.db.transport.rest";

    @Getter
    private List<Request> requests;
    
    public APIConfiguration() {
        buildRequestList();
    }

    @Test
    public void getStations() throws IOException {
        DB_Adapter_v6 dbAdapterV6 = new DB_Adapter_v6(this);
        dbAdapterV6.getStationById(8011160);
    }

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
