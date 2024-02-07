package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ril100IdentifierTest {

    @Test
    void creatingRil100IdentifierShouldSetAllFieldsCorrectly() {
        Ril100Identifier ril100Identifier = new Ril100Identifier();
        ril100Identifier.setId(1L);
        ril100Identifier.setRilIdentifier("ABC");
        ril100Identifier.setMain(true);
        ril100Identifier.setHasSteamPermission(true);
        ril100Identifier.setGeographicCoordinates(new GeographicCoordinates());

        assertEquals(1L, ril100Identifier.getId());
        assertEquals("ABC", ril100Identifier.getRilIdentifier());
        assertTrue(ril100Identifier.isMain());
        assertTrue(ril100Identifier.isHasSteamPermission());
        assertNotNull(ril100Identifier.getGeographicCoordinates());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Ril100Identifier ril100Identifier1 = new Ril100Identifier();
        ril100Identifier1.setId(1L);

        Ril100Identifier ril100Identifier2 = new Ril100Identifier();
        ril100Identifier2.setId(1L);

        assertTrue(ril100Identifier1.equals(ril100Identifier2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Ril100Identifier ril100Identifier1 = new Ril100Identifier();
        ril100Identifier1.setId(1L);

        Ril100Identifier ril100Identifier2 = new Ril100Identifier();
        ril100Identifier2.setId(2L);

        assertFalse(ril100Identifier1.equals(ril100Identifier2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Ril100Identifier ril100Identifier1 = new Ril100Identifier();
        Ril100Identifier ril100Identifier2 = new Ril100Identifier();

        assertEquals(ril100Identifier1.hashCode(), ril100Identifier2.hashCode());
    }
}