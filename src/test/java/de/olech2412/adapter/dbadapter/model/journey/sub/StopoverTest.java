package de.olech2412.adapter.dbadapter.model.journey.sub;

import de.olech2412.adapter.dbadapter.model.stop.Stop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StopoverTest {
    private Stopover stopover;

    @BeforeEach
    void setUp() {
        stopover = new Stopover();
    }

    @Test
    void shouldSetAndGetStop() {
        Stop expectedStop = new Stop();
        stopover.setStop(expectedStop);
        assertEquals(expectedStop, stopover.getStop());
    }

    @Test
    void shouldSetAndGetStopWhenStopIsNull() {
        stopover.setStop(null);
        assertNull(stopover.getStop());
    }

    @Test
    void shouldSetAndGetArrival() {
        String expectedArrival = "10:00";
        stopover.setArrival(expectedArrival);
        assertEquals(expectedArrival, stopover.getArrival());
    }

    @Test
    void shouldSetAndGetArrivalWhenArrivalIsNull() {
        stopover.setArrival(null);
        assertNull(stopover.getArrival());
    }

    @Test
    void shouldSetAndGetPlannedArrival() {
        String expectedPlannedArrival = "10:00";
        stopover.setPlannedArrival(expectedPlannedArrival);
        assertEquals(expectedPlannedArrival, stopover.getPlannedArrival());
    }

    @Test
    void shouldSetAndGetPlannedArrivalWhenPlannedArrivalIsNull() {
        stopover.setPlannedArrival(null);
        assertNull(stopover.getPlannedArrival());
    }

    @Test
    void shouldSetAndGetArrivalDelay() {
        Integer expectedArrivalDelay = 5;
        stopover.setArrivalDelay(expectedArrivalDelay);
        assertEquals(expectedArrivalDelay, stopover.getArrivalDelay());
    }

    @Test
    void shouldSetAndGetArrivalDelayWhenArrivalDelayIsNull() {
        stopover.setArrivalDelay(null);
        assertNull(stopover.getArrivalDelay());
    }

    @Test
    void shouldSetAndGetArrivalPlatform() {
        String expectedArrivalPlatform = "Platform 1";
        stopover.setArrivalPlatform(expectedArrivalPlatform);
        assertEquals(expectedArrivalPlatform, stopover.getArrivalPlatform());
    }

    @Test
    void shouldSetAndGetArrivalPlatformWhenArrivalPlatformIsNull() {
        stopover.setArrivalPlatform(null);
        assertNull(stopover.getArrivalPlatform());
    }

    @Test
    void shouldSetAndGetArrivalPrognosisType() {
        String expectedArrivalPrognosisType = "On Time";
        stopover.setArrivalPrognosisType(expectedArrivalPrognosisType);
        assertEquals(expectedArrivalPrognosisType, stopover.getArrivalPrognosisType());
    }

    @Test
    void shouldSetAndGetArrivalPrognosisTypeWhenArrivalPrognosisTypeIsNull() {
        stopover.setArrivalPrognosisType(null);
        assertNull(stopover.getArrivalPrognosisType());
    }

    @Test
    void shouldSetAndGetPlannedArrivalPlatform() {
        String expectedPlannedArrivalPlatform = "Platform 1";
        stopover.setPlannedArrivalPlatform(expectedPlannedArrivalPlatform);
        assertEquals(expectedPlannedArrivalPlatform, stopover.getPlannedArrivalPlatform());
    }

    @Test
    void shouldSetAndGetPlannedArrivalPlatformWhenPlannedArrivalPlatformIsNull() {
        stopover.setPlannedArrivalPlatform(null);
        assertNull(stopover.getPlannedArrivalPlatform());
    }

    @Test
    void shouldSetAndGetDeparture() {
        String expectedDeparture = "11:00";
        stopover.setDeparture(expectedDeparture);
        assertEquals(expectedDeparture, stopover.getDeparture());
    }

    @Test
    void shouldSetAndGetDepartureWhenDepartureIsNull() {
        stopover.setDeparture(null);
        assertNull(stopover.getDeparture());
    }

    @Test
    void shouldSetAndGetPlannedDeparture() {
        String expectedPlannedDeparture = "11:00";
        stopover.setPlannedDeparture(expectedPlannedDeparture);
        assertEquals(expectedPlannedDeparture, stopover.getPlannedDeparture());
    }

    @Test
    void shouldSetAndGetPlannedDepartureWhenPlannedDepartureIsNull() {
        stopover.setPlannedDeparture(null);
        assertNull(stopover.getPlannedDeparture());
    }

    @Test
    void shouldSetAndGetDepartureDelay() {
        Integer expectedDepartureDelay = 5;
        stopover.setDepartureDelay(expectedDepartureDelay);
        assertEquals(expectedDepartureDelay, stopover.getDepartureDelay());
    }

    @Test
    void shouldSetAndGetDepartureDelayWhenDepartureDelayIsNull() {
        stopover.setDepartureDelay(null);
        assertNull(stopover.getDepartureDelay());
    }

    @Test
    void shouldSetAndGetDeparturePlatform() {
        String expectedDeparturePlatform = "Platform 2";
        stopover.setDeparturePlatform(expectedDeparturePlatform);
        assertEquals(expectedDeparturePlatform, stopover.getDeparturePlatform());
    }

    @Test
    void shouldSetAndGetDeparturePlatformWhenDeparturePlatformIsNull() {
        stopover.setDeparturePlatform(null);
        assertNull(stopover.getDeparturePlatform());
    }

    @Test
    void shouldSetAndGetDeparturePrognosisType() {
        String expectedDeparturePrognosisType = "Delayed";
        stopover.setDeparturePrognosisType(expectedDeparturePrognosisType);
        assertEquals(expectedDeparturePrognosisType, stopover.getDeparturePrognosisType());
    }

    @Test
    void shouldSetAndGetDeparturePrognosisTypeWhenDeparturePrognosisTypeIsNull() {
        stopover.setDeparturePrognosisType(null);
        assertNull(stopover.getDeparturePrognosisType());
    }

    @Test
    void shouldSetAndGetPlannedDeparturePlatform() {
        String expectedPlannedDeparturePlatform = "Platform 2";
        stopover.setPlannedDeparturePlatform(expectedPlannedDeparturePlatform);
        assertEquals(expectedPlannedDeparturePlatform, stopover.getPlannedDeparturePlatform());
    }

    @Test
    void shouldSetAndGetPlannedDeparturePlatformWhenPlannedDeparturePlatformIsNull() {
        stopover.setPlannedDeparturePlatform(null);
        assertNull(stopover.getPlannedDeparturePlatform());
    }
}