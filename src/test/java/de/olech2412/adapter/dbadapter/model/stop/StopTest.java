package de.olech2412.adapter.dbadapter.model.stop;

import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import de.olech2412.adapter.dbadapter.model.stop.sub.Location;
import de.olech2412.adapter.dbadapter.model.stop.sub.Products;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StopTest {

    @Test
    void testToString() {
        Stop stop = getStop();
        assertEquals("Stop{" +
                "uuid=" + stop.getUuid() +
                ", type='" + stop.getType() + '\'' +
                ", id='" + stop.getId() + '\'' +
                ", name='" + stop.getName() + '\'' +
                ", location=" + stop.getLocation() +
                ", products=" + stop.getProducts() +
                ", entrances=" + stop.getEntrances() +
                ", lines=" + stop.getLines() +
                ", createdAt=" + stop.getCreatedAt() +
                '}', stop.toString());
    }

    @Test
    void getUuid() {
        Stop stop = getStop();
        assertTrue(stop.getUuid() instanceof UUID);
        assertTrue(!stop.getUuid().toString().isEmpty());
    }

    @Test
    void getType() {
        Stop stop = getStop();
        assertEquals("type", stop.getType());
    }

    @Test
    void getId() {
        Stop stop = getStop();
        assertEquals("id", stop.getId());
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
    void getEntrances() {
        Stop stop = getStop();
        assertTrue(stop.getEntrances() instanceof ArrayList);
    }

    @Test
    void getLines() {
        Stop stop = getStop();
        assertTrue(stop.getLines() instanceof ArrayList);
    }

    @Test
    void getCreatedAt() {
        Stop stop = getStop();
        assertTrue(stop.getCreatedAt() instanceof LocalDateTime);
    }

    @Test
    void setUuid() {
        Stop stop = getStop();
        UUID uuid = UUID.randomUUID();
        stop.setUuid(uuid);
        assertEquals(uuid, stop.getUuid());
    }

    @Test
    void setType() {
        Stop stop = getStop();
        stop.setType("newType");
        assertEquals("newType", stop.getType());
    }

    @Test
    void setId() {
        Stop stop = getStop();
        stop.setId("newId");
        assertEquals("newId", stop.getId());
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
    void setEntrances() {
        Stop stop = getStop();
        ArrayList<Location> entrances = new ArrayList<>();
        stop.setEntrances(entrances);
        assertEquals(entrances, stop.getEntrances());
    }

    @Test
    void setLines() {
        Stop stop = getStop();
        ArrayList<Line> lines = new ArrayList<>();
        stop.setLines(lines);
        assertEquals(lines, stop.getLines());
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

        stop2.setUuid(UUID.randomUUID());
        assertNotEquals(stop, stop2);

        stop2.setUuid(stop.getUuid());
        stop2.setType("newType");
        assertNotEquals(stop, stop2);

        stop2.setType(stop.getType());
        stop2.setId("newId");
        assertNotEquals(stop, stop2);

        stop = stop2;
        assertEquals(stop, stop2);
    }

    @Test
    void testHashCode() {
        Stop stop = getStop();
        Stop stop2 = getStop();
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop2.setUuid(UUID.randomUUID());
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop2.setUuid(stop.getUuid());
        stop2.setType("newType");
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop2.setType(stop.getType());
        stop2.setId("newId");
        assertNotEquals(stop.hashCode(), stop2.hashCode());

        stop = stop2;
        assertEquals(stop.hashCode(), stop2.hashCode());
    }

    Stop getStop() {
        Stop stop = new Stop();
        stop.setUuid(UUID.randomUUID());
        stop.setType("type");
        stop.setId("id");
        stop.setName("name");
        stop.setLocation(new Location());
        stop.setProducts(new Products());
        stop.setEntrances(new ArrayList<>());
        stop.setLines(new ArrayList<>());
        stop.setCreatedAt(LocalDateTime.now());
        return stop;
    }
}