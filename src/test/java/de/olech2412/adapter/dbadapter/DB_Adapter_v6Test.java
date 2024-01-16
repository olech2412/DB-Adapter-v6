package de.olech2412.adapter.dbadapter;

import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class DB_Adapter_v6Test {

    APIConfiguration apiConfiguration = new APIConfiguration();
    DB_Adapter_v6 db_adapter_v6 = new DB_Adapter_v6(apiConfiguration);

    int stopId = 8503000;

    @Test
    public void testGetArrivalsWithValidStopIdAndDurationAndResults() throws IOException {
        int duration = 30;
        int results = 10;

        Trip[] arrivals = db_adapter_v6.getArrivalsByStopIdWithDurationAndResults(stopId, duration, results);

        Assertions.assertNotNull(arrivals);
        Assertions.assertTrue(arrivals.length <= results);
        Assertions.assertNotEquals(0, arrivals.length);

        Trip arrival = arrivals[0];
        Assertions.assertNotNull(arrival);
        Assertions.assertNotNull(arrival.getStop());
        Assertions.assertNotNull(arrival.getCreatedAt());
        Assertions.assertNotNull(arrival.getLine());
        Assertions.assertNotNull(arrival.getTripId());
    }

    @Test
    public void testGetDeparturesByStopIdWithDurationAndResults() throws IOException {
        int duration = 30;
        int results = 10;

        Trip[] departures = db_adapter_v6.getDeparturesByStopIdWithDurationAndResults(stopId, duration, results);

        Assertions.assertNotNull(departures);
        Assertions.assertTrue(departures.length <= results);
        Assertions.assertNotEquals(0, departures.length);

        Trip departure = departures[0];
        Assertions.assertNotNull(departure);
        Assertions.assertNotNull(departure.getStop());
        Assertions.assertNotNull(departure.getCreatedAt());
        Assertions.assertNotNull(departure.getLine());
        Assertions.assertNotNull(departure.getTripId());
    }

    @Test
    public void testGetDeparturesByStopIdWithDuration() throws IOException {
        int duration = 30;

        Trip[] departures = db_adapter_v6.getDeparturesByStopIdWithDuration(stopId, duration);

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
    public void testGetArrivalsByStopIdWithDuration() throws IOException {
        int duration = 30;

        Trip[] arrivals = db_adapter_v6.getArrivalsByStopIdWithDuration(stopId, duration);

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
    public void testGetArrivalsByStopId() throws IOException {

        Trip[] arrivals = db_adapter_v6.getArrivalsByStopId(stopId);

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

        Trip[] departures = db_adapter_v6.getDeparturesByStopId(stopId);

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

        Stop stop = db_adapter_v6.getStopById(stopId);

        Assertions.assertNotNull(stop);
        Assertions.assertNotNull(stop.getCreatedAt());
        Assertions.assertNotNull(stop.getName());
        Assertions.assertNotNull(stop.getLines());
        Assertions.assertNotNull(stop.getProducts());
    }

    @Test
    public void testGetStationById() throws IOException {

        Station station = db_adapter_v6.getStationById(8010159);

        Assertions.assertNotNull(station);
        Assertions.assertNotNull(station.getCreatedAt());
        Assertions.assertNotNull(station.getName());
        Assertions.assertNotNull(station.getFederalState());
        Assertions.assertNotNull(station.getHasMobilityService());
    }

}
