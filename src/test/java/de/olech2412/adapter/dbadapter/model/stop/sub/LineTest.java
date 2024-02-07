package de.olech2412.adapter.dbadapter.model.stop.sub;

import de.olech2412.adapter.dbadapter.model.station.sub.Operator;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void creatingLineShouldSetAllFieldsCorrectly() {
        Line line = new Line();
        line.setId(1L);
        line.setType("Type");
        line.setFahrtNr("FahrtNr");
        line.setName("Name");
        line.setLinePublic(true);
        line.setProductName("ProductName");
        line.setLineId("LineId");
        line.setProduct("Product");
        line.setMode(Mode.BUS);
        line.setCreatedAt(LocalDateTime.now());
        line.setOperator(new Operator());

        assertEquals(1L, line.getId());
        assertEquals("Type", line.getType());
        assertEquals("FahrtNr", line.getFahrtNr());
        assertEquals("Name", line.getName());
        assertTrue(line.isLinePublic());
        assertEquals("ProductName", line.getProductName());
        assertEquals("LineId", line.getLineId());
        assertEquals("Product", line.getProduct());
        assertEquals(Mode.BUS, line.getMode());
        assertNotNull(line.getCreatedAt());
        assertNotNull(line.getOperator());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Line line1 = new Line();
        line1.setId(1L);

        Line line2 = new Line();
        line2.setId(1L);

        assertTrue(line1.equals(line2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Line line1 = new Line();
        line1.setId(1L);

        Line line2 = new Line();
        line2.setId(2L);

        assertFalse(line1.equals(line2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Line line1 = new Line();
        Line line2 = new Line();

        assertEquals(line1.hashCode(), line2.hashCode());
    }
}