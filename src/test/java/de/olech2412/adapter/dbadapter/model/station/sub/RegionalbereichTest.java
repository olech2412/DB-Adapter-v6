package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RegionalbereichTest {

    @Test
    void creatingRegionalbereichShouldSetAllFieldsCorrectly() {
        Regionalbereich regionalbereich = new Regionalbereich();
        regionalbereich.setId(1L);
        regionalbereich.setNumber(123);
        regionalbereich.setName("Regionalbereich Name");
        regionalbereich.setShortName("RN");

        assertEquals(1L, regionalbereich.getId());
        assertEquals(123, regionalbereich.getNumber());
        assertEquals("Regionalbereich Name", regionalbereich.getName());
        assertEquals("RN", regionalbereich.getShortName());
    }

    @Test
    void equalsShouldReturnFalseForSameId() {
        Regionalbereich regionalbereich1 = new Regionalbereich();
        regionalbereich1.setId(1L);

        Regionalbereich regionalbereich2 = new Regionalbereich();
        regionalbereich2.setId(1L);

        assertFalse(regionalbereich1.equals(regionalbereich2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Regionalbereich regionalbereich1 = new Regionalbereich();
        regionalbereich1.setId(1L);

        Regionalbereich regionalbereich2 = new Regionalbereich();
        regionalbereich2.setId(2L);

        assertFalse(regionalbereich1.equals(regionalbereich2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Regionalbereich regionalbereich1 = new Regionalbereich();
        Regionalbereich regionalbereich2 = new Regionalbereich();

        assertEquals(regionalbereich1.hashCode(), regionalbereich2.hashCode());
    }
}