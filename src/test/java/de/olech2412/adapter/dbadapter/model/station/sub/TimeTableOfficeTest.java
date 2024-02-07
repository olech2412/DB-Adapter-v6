package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTableOfficeTest {

    @Test
    void creatingTimeTableOfficeShouldSetAllFieldsCorrectly() {
        TimeTableOffice timeTableOffice = new TimeTableOffice();
        timeTableOffice.setId(1L);
        timeTableOffice.setEmail("email@example.com");
        timeTableOffice.setName("Office Name");

        assertEquals(1L, timeTableOffice.getId());
        assertEquals("email@example.com", timeTableOffice.getEmail());
        assertEquals("Office Name", timeTableOffice.getName());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        TimeTableOffice timeTableOffice1 = new TimeTableOffice();
        timeTableOffice1.setId(1L);

        TimeTableOffice timeTableOffice2 = new TimeTableOffice();
        timeTableOffice2.setId(1L);

        assertTrue(timeTableOffice1.equals(timeTableOffice2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        TimeTableOffice timeTableOffice1 = new TimeTableOffice();
        timeTableOffice1.setId(1L);

        TimeTableOffice timeTableOffice2 = new TimeTableOffice();
        timeTableOffice2.setId(2L);

        assertFalse(timeTableOffice1.equals(timeTableOffice2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        TimeTableOffice timeTableOffice1 = new TimeTableOffice();
        TimeTableOffice timeTableOffice2 = new TimeTableOffice();

        assertEquals(timeTableOffice1.hashCode(), timeTableOffice2.hashCode());
    }
}