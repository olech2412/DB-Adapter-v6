package de.olech2412.adapter.dbadapter;

import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import de.olech2412.adapter.dbadapter.request.parameters.Parameter;
import de.olech2412.adapter.dbadapter.request.parameters.RequestParametersNames;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.Collections;
import java.util.Random;

public class DB_Adapter_v6Test {

    APIConfiguration apiConfiguration = new APIConfiguration();
    DB_Adapter_v6 db_adapter_v6 = new DB_Adapter_v6(apiConfiguration);

    int stopId = 8503000;

    @Test
    public void testGetArrivalsByStopId() throws IOException {

        Trip[] arrivals = db_adapter_v6.getArrivalsByStopId(stopId, Collections.EMPTY_LIST);

        Assertions.assertNotNull(arrivals);
        Assertions.assertNotEquals(0, arrivals.length);

        Trip arrival = arrivals[0];
        Assertions.assertNotNull(arrival);
        Assertions.assertNotNull(arrival.getStop());
        Assertions.assertNotNull(arrival.getCreatedAt());
        Assertions.assertNotNull(arrival.getLine());
        Assertions.assertNotNull(arrival.getTripId());
    }

    @Test
    public void testGetDeparturesByStopId() throws IOException {

        Trip[] departures = db_adapter_v6.getDeparturesByStopId(stopId, Collections.EMPTY_LIST);

        Assertions.assertNotNull(departures);
        Assertions.assertNotEquals(0, departures.length);

        Trip departure = departures[0];
        Assertions.assertNotNull(departure);
        Assertions.assertNotNull(departure.getStop());
        Assertions.assertNotNull(departure.getCreatedAt());
        Assertions.assertNotNull(departure.getLine());
        Assertions.assertNotNull(departure.getTripId());
    }

    @Test
    public void testGetStopById() throws IOException {

        Stop stop = db_adapter_v6.getStopById(stopId, Collections.EMPTY_LIST);

        Assertions.assertNotNull(stop);
        Assertions.assertNotNull(stop.getCreatedAt());
        Assertions.assertNotNull(stop.getName());
        Assertions.assertNotNull(stop.getLines());
        Assertions.assertNotNull(stop.getProducts());
    }

    @Test
    public void testGetStationById() throws IOException {

        Station station = db_adapter_v6.getStationById(8010159, Collections.EMPTY_LIST);

        Assertions.assertNotNull(station);
        Assertions.assertNotNull(station.getCreatedAt());
        Assertions.assertNotNull(station.getName());
        Assertions.assertNotNull(station.getFederalState());
        Assertions.assertNotNull(station.getHasMobilityService());
    }

    @Test
    public void testWrongInput() throws IOException {
        Assertions.assertThrows(IOException.class, () -> {
            db_adapter_v6.getStationById(-1, Collections.EMPTY_LIST);
        });

        Assertions.assertThrows(IOException.class, () -> {
            db_adapter_v6.getArrivalsByStopId(new Random().nextInt(), Collections.EMPTY_LIST);
        });
    }

    @Test
    public void testParameter() throws IOException {
        Trip[] arrivals = db_adapter_v6.getArrivalsByStopId(stopId, Collections.EMPTY_LIST);
        Trip[] arrivalsWithParameter = db_adapter_v6.getArrivalsByStopId(stopId, new Parameter.ParameterBuilder().add(RequestParametersNames.RESULTS, 1).build());

        Assertions.assertNotNull(arrivals);
        Assertions.assertNotNull(arrivalsWithParameter);
        Assertions.assertNotEquals(0, arrivals.length);
        Assertions.assertNotEquals(0, arrivalsWithParameter.length);
        Assertions.assertNotEquals(arrivals.length, arrivalsWithParameter.length);
        Assertions.assertEquals(1, arrivalsWithParameter.length);
    }

}
