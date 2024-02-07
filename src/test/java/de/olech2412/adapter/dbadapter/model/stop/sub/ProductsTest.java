package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void creatingProductsShouldSetAllFieldsCorrectly() {
        Products products = new Products();
        products.setNationalExpress(true);
        products.setNational(true);
        products.setRegionalExp(true);
        products.setRegional(true);
        products.setSuburban(true);
        products.setBus(true);
        products.setFerry(true);
        products.setSubway(true);
        products.setTram(true);
        products.setTaxi(true);

        assertTrue(products.isNationalExpress());
        assertTrue(products.isNational());
        assertTrue(products.isRegionalExp());
        assertTrue(products.isRegional());
        assertTrue(products.isSuburban());
        assertTrue(products.isBus());
        assertTrue(products.isFerry());
        assertTrue(products.isSubway());
        assertTrue(products.isTram());
        assertTrue(products.isTaxi());
    }

    @Test
    void equalsShouldReturnTrueForSameObject() {
        Products products1 = new Products();
        Products products2 = products1;

        assertTrue(products1.equals(products2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentClass() {
        Products products = new Products();
        String notProducts = "Not Products";

        assertFalse(products.equals(notProducts));
    }

    @Test
    void hashCodeShouldBeSameForSameObject() {
        Products products1 = new Products();
        Products products2 = products1;

        assertEquals(products1.hashCode(), products2.hashCode());
    }
}