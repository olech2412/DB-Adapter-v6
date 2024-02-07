package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzentraleTest {

    @Test
    void creatingSzentraleShouldSetAllFieldsCorrectly() {
        Szentrale szentrale = new Szentrale();
        szentrale.setId(1L);
        szentrale.setNumber(123);
        szentrale.setPublicPhoneNumber("1234567890");
        szentrale.setName("Szentrale Name");

        assertEquals(1L, szentrale.getId());
        assertEquals(123, szentrale.getNumber());
        assertEquals("1234567890", szentrale.getPublicPhoneNumber());
        assertEquals("Szentrale Name", szentrale.getName());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Szentrale szentrale1 = new Szentrale();
        szentrale1.setId(1L);

        Szentrale szentrale2 = new Szentrale();
        szentrale2.setId(1L);

        assertTrue(szentrale1.equals(szentrale2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Szentrale szentrale1 = new Szentrale();
        szentrale1.setId(1L);

        Szentrale szentrale2 = new Szentrale();
        szentrale2.setId(2L);

        assertFalse(szentrale1.equals(szentrale2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Szentrale szentrale1 = new Szentrale();
        Szentrale szentrale2 = new Szentrale();

        assertEquals(szentrale1.hashCode(), szentrale2.hashCode());
    }
}