package de.olech2412.adapter.dbadapter.model.stop;

import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.sub.Products;
import de.olech2412.adapter.dbadapter.model.stop.sub.StopLocation;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StopTest {

    @Test
    void creatingStopShouldSetAllFieldsCorrectly() {
        Stop stop = new Stop();
        stop.setId(1L);
        stop.setType("Type");
        stop.setStopId(2L);
        stop.setName("Name");
        stop.setLocation(new StopLocation());
        stop.setProducts(new Products());
        stop.setCreatedAt(LocalDateTime.now());
        stop.setStation(new Station());

        assertEquals(1L, stop.getId());
        assertEquals("Type", stop.getType());
        assertEquals(2L, stop.getStopId());
        assertEquals("Name", stop.getName());
        assertNotNull(stop.getLocation());
        assertNotNull(stop.getProducts());
        assertNotNull(stop.getCreatedAt());
        assertNotNull(stop.getStation());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Stop stop1 = new Stop();
        stop1.setId(1L);

        Stop stop2 = new Stop();
        stop2.setId(1L);

        assertTrue(stop1.equals(stop2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Stop stop1 = new Stop();
        stop1.setId(1L);

        Stop stop2 = new Stop();
        stop2.setId(2L);

        assertFalse(stop1.equals(stop2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Stop stop1 = new Stop();
        Stop stop2 = new Stop();

        assertEquals(stop1.hashCode(), stop2.hashCode());
    }
}