package de.olech2412.adapter.dbadapter;

import de.olech2412.adapter.dbadapter.exception.Error;
import de.olech2412.adapter.dbadapter.exception.Result;
import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import de.olech2412.adapter.dbadapter.request.parameters.Parameter;
import de.olech2412.adapter.dbadapter.request.parameters.RequestParametersNames;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.Collections;
import java.util.Random;

public class DB_Adapter_v6Test {

    APIConfiguration apiConfiguration = new APIConfiguration();
    DB_Adapter_v6 db_adapter_v6 = new DB_Adapter_v6(apiConfiguration);

    int stopId = 8010205; // Leipzig Hbf

    @Test
    public void testGetArrivalsByStopId() throws IOException {

        Result<Trip[], Error> arrivalsError = db_adapter_v6.getArrivalsByStopId(stopId, Collections.EMPTY_LIST);

        Assertions.assertNotNull(arrivalsError);
        Assert.assertTrue(arrivalsError.isSuccess());
        Assertions.assertNotEquals(0, arrivalsError.getData().length);

        Trip arrival = arrivalsError.getData()[0];
        Assertions.assertNotNull(arrival);
        Assertions.assertNotNull(arrival.getStop());
        Assertions.assertNotNull(arrival.getCreatedAt());
        Assertions.assertNotNull(arrival.getLine());
        Assertions.assertNotNull(arrival.getTripId());
    }

    @Test
    public void testGetDeparturesByStopId() throws IOException {

        Result<Trip[], Error> departuresResult = db_adapter_v6.getDeparturesByStopId(stopId, Collections.EMPTY_LIST);

        Assertions.assertNotNull(departuresResult);
        Assert.assertTrue(departuresResult.isSuccess());
        Assertions.assertNotEquals(0, departuresResult.getData().length);

        Trip departure = departuresResult.getData()[0];
        Assertions.assertNotNull(departure);
        Assertions.assertNotNull(departure.getStop());
        Assertions.assertNotNull(departure.getCreatedAt());
        Assertions.assertNotNull(departure.getLine());
        Assertions.assertNotNull(departure.getTripId());
    }

    @Test
    public void testGetStopById() throws IOException {

        Result<Stop, Error> stopResult = db_adapter_v6.getStopById(stopId, Collections.EMPTY_LIST);

        Assertions.assertNotNull(stopResult);
        Assert.assertTrue(stopResult.isSuccess());
        Assertions.assertNotNull(stopResult.getData().getCreatedAt());
        Assertions.assertNotNull(stopResult.getData().getName());
        Assertions.assertNotNull(stopResult.getData().getLines());
        Assertions.assertNotNull(stopResult.getData().getProducts());
    }

    @Test
    public void testGetStationById() throws IOException {

        Result<Station, Error> stationResult = db_adapter_v6.getStationById(8010159, Collections.EMPTY_LIST);

        Assertions.assertNotNull(stationResult);
        Assert.assertTrue(stationResult.isSuccess());
        Assertions.assertNotNull(stationResult.getData().getCreatedAt());
        Assertions.assertNotNull(stationResult.getData().getName());
        Assertions.assertNotNull(stationResult.getData().getFederalState());
        Assertions.assertNotNull(stationResult.getData().getHasMobilityService());
    }

    @Test
    public void testWrongInput() throws IOException {
        Result<Station, Error> stationErrorResult = db_adapter_v6.getStationById(new Random().nextInt(), Collections.EMPTY_LIST);
        Assertions.assertNotNull(stationErrorResult);
        Assertions.assertFalse(stationErrorResult.isSuccess());
        Assertions.assertNotNull(stationErrorResult.getError());
    }

    @Test
    public void testParameterResults() throws IOException {
        Result<Trip[], Error> arrivalsResult = db_adapter_v6.getArrivalsByStopId(stopId, Collections.EMPTY_LIST);
        Result<Trip[], Error> arrivalsWithParameterResult = db_adapter_v6.getArrivalsByStopId(stopId, new Parameter.ParameterBuilder().add(RequestParametersNames.RESULTS, 1).build());

        Assertions.assertNotNull(arrivalsResult);
        Assert.assertTrue(arrivalsResult.isSuccess());
        Assertions.assertNotNull(arrivalsWithParameterResult);
        Assert.assertTrue(arrivalsWithParameterResult.isSuccess());
        Assertions.assertNotEquals(0, arrivalsResult.getData().length);
        Assertions.assertNotEquals(0, arrivalsWithParameterResult.getData().length);
        Assertions.assertNotEquals(arrivalsResult.getData().length, arrivalsWithParameterResult.getData().length);
        Assertions.assertEquals(1, arrivalsWithParameterResult.getData().length);
    }

    @Test
    public void testParameterTrainType() throws IOException {
        Result<Trip[], Error> arrivalsResult = db_adapter_v6.getArrivalsByStopId(stopId, Collections.EMPTY_LIST);
        Result<Trip[], Error> arrivalsWithParameterResult = db_adapter_v6.getArrivalsByStopId(stopId, new Parameter.ParameterBuilder()
                .add(RequestParametersNames.NATIONAL_EXPRESS, true)
                .add(RequestParametersNames.NATIONAL, false)
                .add(RequestParametersNames.REGIONAL_EXPRESS, false)
                .add(RequestParametersNames.REGIONAL, false)
                .add(RequestParametersNames.SUBURBAN, false)
                .add(RequestParametersNames.BUS, false)
                .add(RequestParametersNames.FERRY, false)
                .add(RequestParametersNames.SUBWAY, false)
                .add(RequestParametersNames.TRAM, false)
                .add(RequestParametersNames.TAXI, false)
                .add(RequestParametersNames.DURATION, 180)
                .build());

        Assertions.assertNotNull(arrivalsResult);
        Assert.assertTrue(arrivalsResult.isSuccess());
        Assertions.assertNotNull(arrivalsWithParameterResult);
        Assert.assertTrue(arrivalsWithParameterResult.isSuccess());
        Assertions.assertNotEquals(0, arrivalsResult.getData().length);
        Assertions.assertNotEquals(0, arrivalsWithParameterResult.getData().length);

        for (Trip trip : arrivalsWithParameterResult.getData()) {
            Assertions.assertTrue(trip.getLine().getProduct().equals("nationalExpress"));
        }
    }
}
