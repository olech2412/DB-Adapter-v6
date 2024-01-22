package de.olech2412.adapter.dbadapter;

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
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STOPS_BY_ID).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STOPS_BY_ID_DEPARTURES).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STOPS_BY_ID_ARRIVALS).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STATIONS_BY_ID).build(),
                new Request.RequestBuilder().setApiEndpoint(RequestPath.STATIONS).build()
        );
        APIConfiguration apiConfiguration = new APIConfiguration();
        Assert.assertEquals(apiConfiguration.getRequests().size(), expectedRequests.size());
        for (int i = 0; i < apiConfiguration.getRequests().size(); i++) {
            Assert.assertEquals(apiConfiguration.getRequests().get(i).getApiEndpoint(), expectedRequests.get(i).getApiEndpoint());
            Assert.assertEquals(apiConfiguration.getRequests().get(i), expectedRequests.get(i));
        }
    }

    @Test
    public void test_setBaseUrl() {
        String newBaseUrl = "https://new.db.transport.rest";
        APIConfiguration apiConfiguration = new APIConfiguration();
        apiConfiguration.setBaseUrl(newBaseUrl);
        Assert.assertSame(apiConfiguration.getBaseUrl(), newBaseUrl);
    }
}