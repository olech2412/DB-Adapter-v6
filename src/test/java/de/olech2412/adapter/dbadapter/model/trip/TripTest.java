package de.olech2412.adapter.dbadapter.model.trip;

import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import de.olech2412.adapter.dbadapter.model.trip.sub.Remark;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {

    @Test
    void creatingTripShouldSetAllFieldsCorrectly() {
        Stop stop = new Stop();
        Line line = new Line();
        Remark remark = new Remark();

        Trip trip = new Trip();
        trip.setTripId("123");
        trip.setStop(stop);
        trip.setWhen(LocalDateTime.now());
        trip.setPlannedWhen(LocalDateTime.now().plusHours(1));
        trip.setPrognosedWhen(LocalDateTime.now().plusHours(2));
        trip.setDelay(10);
        trip.setPlatform("Platform 1");
        trip.setPlannedPlatform("Platform 2");
        trip.setPrognosedPlatform("Platform 3");
        trip.setPrognosisType("On Time");
        trip.setDirection("North");
        trip.setProvenance("South");
        trip.setLine(line);
        trip.setOrigin(stop);
        trip.setDestination(stop);
        trip.setCancelled(false);
        trip.setLoadFactor("High");
        trip.setRemarks(Collections.singletonList(remark));

        assertEquals("123", trip.getTripId());
        assertEquals(stop, trip.getStop());
        assertNotNull(trip.getWhen());
        assertNotNull(trip.getPlannedWhen());
        assertNotNull(trip.getPrognosedWhen());
        assertEquals(10, trip.getDelay());
        assertEquals("Platform 1", trip.getPlatform());
        assertEquals("Platform 2", trip.getPlannedPlatform());
        assertEquals("Platform 3", trip.getPrognosedPlatform());
        assertEquals("On Time", trip.getPrognosisType());
        assertEquals("North", trip.getDirection());
        assertEquals("South", trip.getProvenance());
        assertEquals(line, trip.getLine());
        assertEquals(stop, trip.getOrigin());
        assertEquals(stop, trip.getDestination());
        assertFalse(trip.getCancelled());
        assertEquals("High", trip.getLoadFactor());
        assertEquals(remark, trip.getRemarks().get(0));
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Trip trip1 = new Trip();
        trip1.setId(1L);

        Trip trip2 = new Trip();
        trip2.setId(1L);

        assertTrue(trip1.equals(trip2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Trip trip1 = new Trip();
        trip1.setId(1L);

        Trip trip2 = new Trip();
        trip2.setId(2L);

        assertFalse(trip1.equals(trip2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Trip trip1 = new Trip();
        Trip trip2 = new Trip();

        assertEquals(trip1.hashCode(), trip2.hashCode());
    }
}