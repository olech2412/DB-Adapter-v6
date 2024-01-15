package de.olech2412.adapter.dbadapter;

import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import de.olech2412.adapter.dbadapter.request.Request;
import de.olech2412.adapter.dbadapter.request.RequestPath;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class APIConfigurationTest {

    @Test
    public void test_getBaseUrl() {
        String expectedBaseUrl = "https://v6.db.transport.rest";
        APIConfiguration apiConfiguration = new APIConfiguration();
        Assert.assertSame(apiConfiguration.getBaseUrl(), expectedBaseUrl);
    }

    @Test
    public void test_getRequests() {
        List<Request> expectedRequests = List.of(
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STOPS_BY_ID).setResponseClass(Stop.class).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STOPS_BY_ID_DEPARTURES).setResponseClass(Trip.class).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STOPS_BY_ID_ARRIVALS).setResponseClass(Trip.class).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STATIONS_BY_ID).setResponseClass(Station.class).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STATIONS).setResponseClass(Station.class).build()
        );
        APIConfiguration apiConfiguration = new APIConfiguration();
        Assert.assertNotNull(apiConfiguration.getRequests());
    }

    @Test
    public void test_setBaseUrl() {
        String newBaseUrl = "https://new.db.transport.rest";
        APIConfiguration apiConfiguration = new APIConfiguration();
        apiConfiguration.setBaseUrl(newBaseUrl);
        Assert.assertSame(apiConfiguration.getBaseUrl(), newBaseUrl);
    }
}