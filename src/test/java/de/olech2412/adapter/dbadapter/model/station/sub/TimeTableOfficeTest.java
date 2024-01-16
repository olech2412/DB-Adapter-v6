package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TimeTableOfficeTest {

    @Test
    void testToString() {
        TimeTableOffice timeTableOffice = getTimeTableOffice();
        assertEquals("TimeTableOffice{email='email', name='name'}", timeTableOffice.toString());
    }

    @Test
    void getEmail() {
        TimeTableOffice timeTableOffice = getTimeTableOffice();
        assertEquals("email", timeTableOffice.getEmail());
    }

    @Test
    void getName() {
        TimeTableOffice timeTableOffice = getTimeTableOffice();
        assertEquals("name", timeTableOffice.getName());
    }

    @Test
    void setEmail() {
        TimeTableOffice timeTableOffice = getTimeTableOffice();
        assertEquals("email", timeTableOffice.getEmail());
        timeTableOffice.setEmail("email2");
        assertEquals("email2", timeTableOffice.getEmail());
    }

    @Test
    void setName() {
        TimeTableOffice timeTableOffice = getTimeTableOffice();
        assertEquals("name", timeTableOffice.getName());
        timeTableOffice.setName("name2");
        assertEquals("name2", timeTableOffice.getName());
    }

    @Test
    void testEquals() {
        TimeTableOffice timeTableOffice = getTimeTableOffice();
        assertEquals(timeTableOffice, timeTableOffice);
        assertNotEquals(timeTableOffice, null);
        assertNotEquals(timeTableOffice, new Object());
        TimeTableOffice timeTableOffice2 = getTimeTableOffice();
        assertEquals(timeTableOffice, timeTableOffice2);
        timeTableOffice2.setEmail("email2");
        assertNotEquals(timeTableOffice, timeTableOffice2);
        timeTableOffice2.setEmail("email");
        assertEquals(timeTableOffice, timeTableOffice2);
        timeTableOffice2.setName("name2");
        assertNotEquals(timeTableOffice, timeTableOffice2);
        timeTableOffice2.setName("name");
        assertEquals(timeTableOffice, timeTableOffice2);
    }

    @Test
    void testHashCode() {
        TimeTableOffice timeTableOffice = getTimeTableOffice();
        assertEquals(timeTableOffice.hashCode(), timeTableOffice.hashCode());
        TimeTableOffice timeTableOffice2 = getTimeTableOffice();
        assertEquals(timeTableOffice.hashCode(), timeTableOffice2.hashCode());
        timeTableOffice2.setEmail("email2");
        assertNotEquals(timeTableOffice.hashCode(), timeTableOffice2.hashCode());
        timeTableOffice2.setEmail("email");
        assertEquals(timeTableOffice.hashCode(), timeTableOffice2.hashCode());
        timeTableOffice2.setName("name2");
        assertNotEquals(timeTableOffice.hashCode(), timeTableOffice2.hashCode());
        timeTableOffice2.setName("name");
        assertEquals(timeTableOffice.hashCode(), timeTableOffice2.hashCode());
    }

    TimeTableOffice getTimeTableOffice() {
        TimeTableOffice timeTableOffice = new TimeTableOffice();
        timeTableOffice.setEmail("email");
        timeTableOffice.setName("name");
        return timeTableOffice;
    }
}