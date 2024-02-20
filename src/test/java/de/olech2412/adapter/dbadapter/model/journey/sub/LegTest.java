package de.olech2412.adapter.dbadapter.model.journey.sub;

import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import de.olech2412.adapter.dbadapter.model.trip.sub.Remark;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LegTest {
    private Leg leg;

    @BeforeEach
    void setUp() {
        leg = new Leg();
    }

    @Test
    void shouldSetAndGetOrigin() {
        Stop expectedOrigin = new Stop();
        leg.setOrigin(expectedOrigin);
        assertEquals(expectedOrigin, leg.getOrigin());
    }

    @Test
    void shouldSetAndGetDestination() {
        Stop expectedDestination = new Stop();
        leg.setDestination(expectedDestination);
        assertEquals(expectedDestination, leg.getDestination());
    }

    @Test
    void shouldSetAndGetDeparture() {
        String expectedDeparture = "10:00";
        leg.setDeparture(expectedDeparture);
        assertEquals(expectedDeparture, leg.getDeparture());
    }

    @Test
    void shouldSetAndGetPlannedDeparture() {
        String expectedPlannedDeparture = "10:00";
        leg.setPlannedDeparture(expectedPlannedDeparture);
        assertEquals(expectedPlannedDeparture, leg.getPlannedDeparture());
    }

    @Test
    void shouldSetAndGetDepartureDelay() {
        int expectedDepartureDelay = 5;
        leg.setDepartureDelay(expectedDepartureDelay);
        assertEquals(expectedDepartureDelay, leg.getDepartureDelay());
    }

    @Test
    void shouldSetAndGetArrival() {
        String expectedArrival = "11:00";
        leg.setArrival(expectedArrival);
        assertEquals(expectedArrival, leg.getArrival());
    }

    @Test
    void shouldSetAndGetPlannedArrival() {
        String expectedPlannedArrival = "11:00";
        leg.setPlannedArrival(expectedPlannedArrival);
        assertEquals(expectedPlannedArrival, leg.getPlannedArrival());
    }

    @Test
    void shouldSetAndGetArrivalDelay() {
        int expectedArrivalDelay = 10;
        leg.setArrivalDelay(expectedArrivalDelay);
        assertEquals(expectedArrivalDelay, leg.getArrivalDelay());
    }

    @Test
    void shouldSetAndGetReachable() {
        leg.setReachable(true);
        assertTrue(leg.isReachable());
    }

    @Test
    void shouldSetAndGetTripId() {
        String expectedTripId = "12345";
        leg.setTripId(expectedTripId);
        assertEquals(expectedTripId, leg.getTripId());
    }

    @Test
    void shouldSetAndGetLine() {
        Line expectedLine = new Line();
        leg.setLine(expectedLine);
        assertEquals(expectedLine, leg.getLine());
    }

    @Test
    void shouldSetAndGetDirection() {
        String expectedDirection = "North";
        leg.setDirection(expectedDirection);
        assertEquals(expectedDirection, leg.getDirection());
    }

    @Test
    void shouldSetAndGetLocation() {
        Location expectedLocation = new Location();
        leg.setCurrentLocation(expectedLocation);
        assertEquals(expectedLocation, leg.getCurrentLocation());
    }

    @Test
    void shouldSetAndGetArrivalPlatform() {
        String expectedArrivalPlatform = "1";
        leg.setArrivalPlatform(expectedArrivalPlatform);
        assertEquals(expectedArrivalPlatform, leg.getArrivalPlatform());
    }

    @Test
    void shouldSetAndGetPlannedArrivalPlatform() {
        String expectedPlannedArrivalPlatform = "1";
        leg.setPlannedArrivalPlatform(expectedPlannedArrivalPlatform);
        assertEquals(expectedPlannedArrivalPlatform, leg.getPlannedArrivalPlatform());
    }

    @Test
    void shouldSetAndGetArrivalPrognosisType() {
        String expectedArrivalPrognosisType = "On Time";
        leg.setArrivalPrognosisType(expectedArrivalPrognosisType);
        assertEquals(expectedArrivalPrognosisType, leg.getArrivalPrognosisType());
    }

    @Test
    void shouldSetAndGetDeparturePlatform() {
        String expectedDeparturePlatform = "1";
        leg.setDeparturePlatform(expectedDeparturePlatform);
        assertEquals(expectedDeparturePlatform, leg.getDeparturePlatform());
    }

    @Test
    void shouldSetAndGetPlannedDeparturePlatform() {
        String expectedPlannedDeparturePlatform = "1";
        leg.setPlannedDeparturePlatform(expectedPlannedDeparturePlatform);
        assertEquals(expectedPlannedDeparturePlatform, leg.getPlannedDeparturePlatform());
    }

    @Test
    void shouldSetAndGetDeparturePrognosisType() {
        String expectedDeparturePrognosisType = "On Time";
        leg.setDeparturePrognosisType(expectedDeparturePrognosisType);
        assertEquals(expectedDeparturePrognosisType, leg.getDeparturePrognosisType());
    }

    @Test
    void shouldSetAndGetRemarks() {
        Remark expectedRemark = new Remark();
        leg.setRemarks(Collections.singletonList(expectedRemark));
        assertEquals(Collections.singletonList(expectedRemark), leg.getRemarks());
    }

    @Test
    void shouldSetAndGetLoadFactor() {
        String expectedLoadFactor = "High";
        leg.setLoadFactor(expectedLoadFactor);
        assertEquals(expectedLoadFactor, leg.getLoadFactor());
    }

    @Test
    void shouldSetAndGetStopovers() {
        Stopover expectedStopover = new Stopover();
        leg.setStopovers(Collections.singletonList(expectedStopover));
        assertEquals(Collections.singletonList(expectedStopover), leg.getStopovers());
    }

    @Test
    void shouldSetAndGetPolyline() {
        Polyline expectedPolyline = new Polyline();
        leg.setPolyline(expectedPolyline);
        assertEquals(expectedPolyline, leg.getPolyline());
    }
}