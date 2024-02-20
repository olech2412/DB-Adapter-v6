package de.olech2412.adapter.dbadapter;

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
@Getter
public class APIConfiguration {

    @Setter
    private String baseUrl = "https://v6.db.transport.rest";

    private List<Request> requests;

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
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STOPS_BY_ID_DEPARTURES)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STOPS_BY_ID_ARRIVALS)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STATIONS_BY_ID)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.STATIONS)
                        .build(),
                new Request.RequestBuilder()
                        .setApiEndpoint(RequestPath.JOURNEYS)
                        .build()
        );
    }

}