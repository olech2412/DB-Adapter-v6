package de.olech2412.adapter.dbadapter.model.trip.sub;

import de.olech2412.adapter.dbadapter.model.trip.Trip;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class RemarkTest {

    @Test
    void creatingRemarkShouldSetAllFieldsCorrectly() {
        Remark remark = new Remark();
        remark.setId(1L);
        remark.setType("Type");
        remark.setCode("Code");
        remark.setText("Text");
        remark.setCreatedAt(LocalDateTime.now());

        Trip trip = new Trip();
        remark.setTrips(Collections.singletonList(trip));

        assertEquals(1L, remark.getId());
        assertEquals("Type", remark.getType());
        assertEquals("Code", remark.getCode());
        assertEquals("Text", remark.getText());
        assertNotNull(remark.getCreatedAt());
        assertEquals(trip, remark.getTrips().get(0));
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Remark remark1 = new Remark();
        remark1.setId(1L);

        Remark remark2 = new Remark();
        remark2.setId(1L);

        assertTrue(remark1.equals(remark2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Remark remark1 = new Remark();
        remark1.setId(1L);

        Remark remark2 = new Remark();
        remark2.setId(2L);

        assertFalse(remark1.equals(remark2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Remark remark1 = new Remark();
        Remark remark2 = new Remark();

        assertEquals(remark1.hashCode(), remark2.hashCode());
    }
}