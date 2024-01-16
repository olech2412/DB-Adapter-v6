package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RegionalbereichTest {

    @Test
    void testToString() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals("Regionalbereich{number=123, name='name', shortName='shortName'}", regionalbereich.toString());
    }

    @Test
    void getNumber() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals(123, regionalbereich.getNumber());
    }

    @Test
    void getName() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals("name", regionalbereich.getName());
    }

    @Test
    void getShortName() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals("shortName", regionalbereich.getShortName());
    }

    @Test
    void setNumber() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals(123, regionalbereich.getNumber());
        regionalbereich.setNumber(456);
        assertEquals(456, regionalbereich.getNumber());
    }

    @Test
    void setName() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals("name", regionalbereich.getName());
        regionalbereich.setName("name2");
        assertEquals("name2", regionalbereich.getName());
    }

    @Test
    void setShortName() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals("shortName", regionalbereich.getShortName());
        regionalbereich.setShortName("shortName2");
        assertEquals("shortName2", regionalbereich.getShortName());
    }

    @Test
    void testEquals() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals(regionalbereich, regionalbereich);
        assertNotEquals(regionalbereich, null);
        assertNotEquals(regionalbereich, new Object());
        Regionalbereich regionalbereich2 = getRegionalbereich();
        assertEquals(regionalbereich, regionalbereich2);
        regionalbereich2.setNumber(456);
        assertNotEquals(regionalbereich, regionalbereich2);
        regionalbereich2.setNumber(123);
        assertEquals(regionalbereich, regionalbereich2);
        regionalbereich2.setName("name2");
        assertNotEquals(regionalbereich, regionalbereich2);
        regionalbereich2.setName("name");
        assertEquals(regionalbereich, regionalbereich2);
        regionalbereich2.setShortName("shortName2");
        assertNotEquals(regionalbereich, regionalbereich2);
        regionalbereich2.setShortName("shortName");
        assertEquals(regionalbereich, regionalbereich2);
    }

    @Test
    void testHashCode() {
        Regionalbereich regionalbereich = getRegionalbereich();
        assertEquals(regionalbereich.hashCode(), regionalbereich.hashCode());
        Regionalbereich regionalbereich2 = getRegionalbereich();
        assertEquals(regionalbereich.hashCode(), regionalbereich2.hashCode());
        regionalbereich2.setNumber(456);
        assertNotEquals(regionalbereich.hashCode(), regionalbereich2.hashCode());
        regionalbereich2.setNumber(123);
        assertEquals(regionalbereich.hashCode(), regionalbereich2.hashCode());
        regionalbereich2.setName("name2");
        assertNotEquals(regionalbereich.hashCode(), regionalbereich2.hashCode());
        regionalbereich2.setName("name");
        assertEquals(regionalbereich.hashCode(), regionalbereich2.hashCode());
        regionalbereich2.setShortName("shortName2");
        assertNotEquals(regionalbereich.hashCode(), regionalbereich2.hashCode());
        regionalbereich2.setShortName("shortName");
        assertEquals(regionalbereich.hashCode(), regionalbereich2.hashCode());
    }

    Regionalbereich getRegionalbereich() {
        Regionalbereich regionalbereich = new Regionalbereich();
        regionalbereich.setNumber(123);
        regionalbereich.setName("name");
        regionalbereich.setShortName("shortName");
        return regionalbereich;
    }
}