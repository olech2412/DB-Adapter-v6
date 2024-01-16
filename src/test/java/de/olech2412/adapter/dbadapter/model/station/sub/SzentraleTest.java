package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SzentraleTest {

    @Test
    void testToString() {
        Szentrale szentrale = getSzentrale();
        assertEquals("Szentrale{number=123, publicPhoneNumber='publicPhoneNumber', name='name'}", szentrale.toString());
    }

    @Test
    void getNumber() {
        Szentrale szentrale = getSzentrale();
        assertEquals(123, szentrale.getNumber());
    }

    @Test
    void getPublicPhoneNumber() {
        Szentrale szentrale = getSzentrale();
        assertEquals("publicPhoneNumber", szentrale.getPublicPhoneNumber());
    }

    @Test
    void getName() {
        Szentrale szentrale = getSzentrale();
        assertEquals("name", szentrale.getName());
    }

    @Test
    void setNumber() {
        Szentrale szentrale = getSzentrale();
        assertEquals(123, szentrale.getNumber());
        szentrale.setNumber(456);
        assertEquals(456, szentrale.getNumber());
    }

    @Test
    void setPublicPhoneNumber() {
        Szentrale szentrale = getSzentrale();
        assertEquals("publicPhoneNumber", szentrale.getPublicPhoneNumber());
        szentrale.setPublicPhoneNumber("publicPhoneNumber2");
        assertEquals("publicPhoneNumber2", szentrale.getPublicPhoneNumber());
    }

    @Test
    void setName() {
        Szentrale szentrale = getSzentrale();
        assertEquals("name", szentrale.getName());
        szentrale.setName("name2");
        assertEquals("name2", szentrale.getName());
    }

    @Test
    void testEquals() {
        Szentrale szentrale = getSzentrale();
        assertEquals(szentrale, szentrale);
        assertNotEquals(szentrale, null);
        assertNotEquals(szentrale, new Object());
        Szentrale szentrale2 = getSzentrale();
        assertEquals(szentrale, szentrale2);
        szentrale2.setNumber(456);
        assertNotEquals(szentrale, szentrale2);
        szentrale2.setNumber(123);
        assertEquals(szentrale, szentrale2);
        szentrale2.setPublicPhoneNumber("publicPhoneNumber2");
        assertNotEquals(szentrale, szentrale2);
        szentrale2.setPublicPhoneNumber("publicPhoneNumber");
        assertEquals(szentrale, szentrale2);
        szentrale2.setName("name2");
        assertNotEquals(szentrale, szentrale2);
        szentrale2.setName("name");
        assertEquals(szentrale, szentrale2);
    }

    @Test
    void testHashCode() {
        Szentrale szentrale = getSzentrale();
        assertEquals(szentrale.hashCode(), szentrale.hashCode());
        Szentrale szentrale2 = getSzentrale();
        assertEquals(szentrale.hashCode(), szentrale2.hashCode());
        szentrale2.setNumber(456);
        assertNotEquals(szentrale.hashCode(), szentrale2.hashCode());
        szentrale2.setNumber(123);
        assertEquals(szentrale.hashCode(), szentrale2.hashCode());
        szentrale2.setPublicPhoneNumber("publicPhoneNumber2");
        assertNotEquals(szentrale.hashCode(), szentrale2.hashCode());
        szentrale2.setPublicPhoneNumber("publicPhoneNumber");
        assertEquals(szentrale.hashCode(), szentrale2.hashCode());
        szentrale2.setName("name2");
        assertNotEquals(szentrale.hashCode(), szentrale2.hashCode());
        szentrale2.setName("name");
        assertEquals(szentrale.hashCode(), szentrale2.hashCode());
    }

    Szentrale getSzentrale() {
        Szentrale szentrale = new Szentrale();
        szentrale.setNumber(123);
        szentrale.setPublicPhoneNumber("publicPhoneNumber");
        szentrale.setName("name");
        return szentrale;
    }
}