package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void creatingAddressShouldSetAllFieldsCorrectly() {
        Address address = new Address();
        address.setId(1L);
        address.setCity("City");
        address.setZipcode("Zipcode");
        address.setStreet("Street");

        assertEquals(1L, address.getId());
        assertEquals("City", address.getCity());
        assertEquals("Zipcode", address.getZipcode());
        assertEquals("Street", address.getStreet());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Address address1 = new Address();
        address1.setId(1L);

        Address address2 = new Address();
        address2.setId(1L);

        assertTrue(address1.equals(address2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Address address1 = new Address();
        address1.setId(1L);

        Address address2 = new Address();
        address2.setId(2L);

        assertFalse(address1.equals(address2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Address address1 = new Address();
        Address address2 = new Address();

        assertEquals(address1.hashCode(), address2.hashCode());
    }
}