package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AddressTest {

    @Test
    void testToString() {
        Address address = getAddress();
        assertEquals("Address{city='city', zipcode='zipcode', street='street'}", address.toString());
    }

    @Test
    void getCity() {
        Address address = getAddress();
        assertEquals("city", address.getCity());
    }

    @Test
    void getZipcode() {
        Address address = getAddress();
        assertEquals("zipcode", address.getZipcode());
    }

    @Test
    void getStreet() {
        Address address = getAddress();
        assertEquals("street", address.getStreet());
    }

    @Test
    void setCity() {
        Address address = getAddress();
        assertEquals("city", address.getCity());
        address.setCity("city2");
        assertEquals("city2", address.getCity());
    }

    @Test
    void setZipcode() {
        Address address = getAddress();
        assertEquals("zipcode", address.getZipcode());
        address.setZipcode("zipcode2");
        assertEquals("zipcode2", address.getZipcode());
    }

    @Test
    void setStreet() {
        Address address = getAddress();
        assertEquals("street", address.getStreet());
        address.setStreet("street2");
        assertEquals("street2", address.getStreet());
    }

    @Test
    void testEquals() {
        Address address = getAddress();
        assertEquals(address, address);

        Address address2 = getAddress();
        address2.setCity("city2");
        assertNotEquals(address, address2);
    }

    @Test
    void testHashCode() {
        Address address = getAddress();
        assertEquals(address.hashCode(), address.hashCode());

        Address address2 = getAddress();
        address2.setCity("city2");
        assertNotEquals(address.hashCode(), address2.hashCode());
    }

    Address getAddress() {
        Address address = new Address();
        address.setCity("city");
        address.setZipcode("zipcode");
        address.setStreet("street");
        return address;
    }
}