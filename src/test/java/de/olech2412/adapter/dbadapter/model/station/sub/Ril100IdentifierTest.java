package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ril100IdentifierTest {

    @Test
    void testToString() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertEquals("Ril100Identifier{rilIdentifier='rilIdentifier', isMain=true, hasSteamPermission=true, geographicCoordinates=GeographicCoordinates{type='null', coordinates=null}}", ril100Identifier.toString());
    }

    @Test
    void getRilIdentifier() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertEquals("rilIdentifier", ril100Identifier.getRilIdentifier());
    }

    @Test
    void isMain() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertTrue(ril100Identifier.isMain());
    }

    @Test
    void isHasSteamPermission() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertTrue(ril100Identifier.isHasSteamPermission());
    }

    @Test
    void getGeographicCoordinates() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertEquals(new GeographicCoordinates(), ril100Identifier.getGeographicCoordinates());
    }

    @Test
    void setRilIdentifier() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertEquals("rilIdentifier", ril100Identifier.getRilIdentifier());
        ril100Identifier.setRilIdentifier("rilIdentifier2");
        assertEquals("rilIdentifier2", ril100Identifier.getRilIdentifier());
    }

    @Test
    void setMain() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertTrue(ril100Identifier.isMain());
        ril100Identifier.setMain(false);
        assertFalse(ril100Identifier.isMain());
    }

    @Test
    void setHasSteamPermission() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertTrue(ril100Identifier.isHasSteamPermission());
        ril100Identifier.setHasSteamPermission(false);
        assertFalse(ril100Identifier.isHasSteamPermission());
    }

    @Test
    void setGeographicCoordinates() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertEquals(new GeographicCoordinates(), ril100Identifier.getGeographicCoordinates());
        GeographicCoordinates geographicCoordinates = new GeographicCoordinates();
        geographicCoordinates.setCoordinates(float[].class.cast(new float[]{1.0f, 2.0f}));
        ril100Identifier.setGeographicCoordinates(geographicCoordinates);
        assertEquals(geographicCoordinates, ril100Identifier.getGeographicCoordinates());
    }

    @Test
    void testEquals() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertEquals(ril100Identifier, ril100Identifier);
        assertNotEquals(ril100Identifier, null);
        assertNotEquals(ril100Identifier, new Object());
        Ril100Identifier ril100Identifier2 = getRil100Identifier();
        assertEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setRilIdentifier("rilIdentifier2");
        assertNotEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setRilIdentifier("rilIdentifier");
        assertEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setMain(false);
        assertNotEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setMain(true);
        assertEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setHasSteamPermission(false);
        assertNotEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setHasSteamPermission(true);
        assertEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setGeographicCoordinates(new GeographicCoordinates());
        assertEquals(ril100Identifier, ril100Identifier2);
        ril100Identifier2.setGeographicCoordinates(ril100Identifier.getGeographicCoordinates());
        assertEquals(ril100Identifier, ril100Identifier2);
    }

    @Test
    void testHashCode() {
        Ril100Identifier ril100Identifier = getRil100Identifier();
        assertEquals(ril100Identifier.hashCode(), ril100Identifier.hashCode());
        Ril100Identifier ril100Identifier2 = getRil100Identifier();
        assertEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setRilIdentifier("rilIdentifier2");
        assertNotEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setRilIdentifier("rilIdentifier");
        assertEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setMain(false);
        assertNotEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setMain(true);
        assertEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setHasSteamPermission(false);
        assertNotEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setHasSteamPermission(true);
        assertEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setGeographicCoordinates(new GeographicCoordinates());
        assertEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
        ril100Identifier2.setGeographicCoordinates(ril100Identifier.getGeographicCoordinates());
        assertEquals(ril100Identifier.hashCode(), ril100Identifier2.hashCode());
    }

    Ril100Identifier getRil100Identifier() {
        Ril100Identifier ril100Identifier = new Ril100Identifier();
        ril100Identifier.setRilIdentifier("rilIdentifier");
        ril100Identifier.setMain(true);
        ril100Identifier.setHasSteamPermission(true);
        ril100Identifier.setGeographicCoordinates(new GeographicCoordinates());
        return ril100Identifier;
    }
}