package de.olech2412.adapter.dbadapter.model.stop;

import de.olech2412.adapter.dbadapter.model.stop.sub.Location;
import de.olech2412.adapter.dbadapter.model.stop.sub.Products;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StopTest {

    @Test
    void getUuid() {
        Stop stop = getStop();
        assertTrue(stop.getId() instanceof Long);
        assertTrue(!stop.getId().toString().isEmpty());
    }

    @Test
    void getType() {
        Stop stop = getStop();
        assertEquals("type", stop.getType());
    }

    @Test
    void getId() {
        Stop stop = getStop();
        assertEquals(1L, stop.getId());
    }

    @Test
    void getName() {
        Stop stop = getStop();
        assertEquals("name", stop.getName());
    }

    @Test
    void getLocation() {
        Stop stop = getStop();
        assertTrue(stop.getLocation() instanceof Location);
    }

    @Test
    void getProducts() {
        Stop stop = getStop();
        assertTrue(stop.getProducts() instanceof Products);
    }

    @Test
    void getCreatedAt() {
        Stop stop = getStop();
        assertTrue(stop.getCreatedAt() instanceof LocalDateTime);
    }

    @Test
    void setId() {
        Stop stop = getStop();
        stop.setId(1L);
        assertEquals(1L, stop.getId());
    }

    @Test
    void setType() {
        Stop stop = getStop();
        stop.setType("newType");
        assertEquals("newType", stop.getType());
    }

    @Test
    void setStopId() {
        Stop stop = getStop();
        stop.setStopId("newId");
        assertEquals("newId", stop.getStopId());
    }

    @Test
    void setName() {
        Stop stop = getStop();
        stop.setName("newName");
        assertEquals("newName", stop.getName());
    }

    @Test
    void setLocation() {
        Stop stop = getStop();
        Location location = new Location();
        stop.setLocation(location);
        assertEquals(location, stop.getLocation());
    }

    @Test
    void setProducts() {
        Stop stop = getStop();
        Products products = new Products();
        stop.setProducts(products);
        assertEquals(products, stop.getProducts());
    }

    @Test
    void setCreatedAt() {
        Stop stop = getStop();
        LocalDateTime createdAt = LocalDateTime.now();
        stop.setCreatedAt(createdAt);
        assertEquals(createdAt, stop.getCreatedAt());
    }

    @Test
    void testEquals() {
        Stop stop = getStop();
        Stop stop2 = getStop();
        assertNotEquals(stop, stop2);

        stop2.setId(1L);
        assertNotEquals(stop, stop2);

        stop2.setId(1L);
        stop2.setType("newType");
        assertNotEquals(stop, stop2);

        stop2.setType(stop.getType());
        stop2.setStopId("newId");
        assertNotEquals(stop, stop2);

        stop = stop2;
        assertEquals(stop, stop2);
    }

    @Test
    void testHashCode() {
        Stop stop = getStop();
        Stop stop2 = getStop();
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop2.setId(1L);
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop2.setId(1L);
        stop2.setType("newType");
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop2.setType(stop.getType());
        stop2.setId(1L);
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop = stop2;
        assertEquals(stop.hashCode(), stop2.hashCode());
    }

    Stop getStop() {
        Stop stop = new Stop();
        stop.setId(1L);
        stop.setType("type");
        stop.setStopId("id");
        stop.setName("name");
        stop.setLocation(new Location());
        stop.setProducts(new Products());
        stop.setCreatedAt(LocalDateTime.now());
        return stop;
    }
}