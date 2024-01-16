package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void testToString() {
        Products products = getProducts();
        assertEquals("Products{" +
                "nationalExpress=" + products.isNationalExpress() +
                ", national=" + products.isNational() +
                ", regionalExp=" + products.isRegionalExp() +
                ", regional=" + products.isRegional() +
                ", suburban=" + products.isSuburban() +
                ", bus=" + products.isBus() +
                ", ferry=" + products.isFerry() +
                ", subway=" + products.isSubway() +
                ", tram=" + products.isTram() +
                ", taxi=" + products.isTaxi() +
                '}', products.toString());
    }

    @Test
    void isNationalExpress() {
        Products products = getProducts();
        assertTrue(products.isNationalExpress());
    }

    @Test
    void isNational() {
        Products products = getProducts();
        assertTrue(products.isNational());
    }

    @Test
    void isRegionalExp() {
        Products products = getProducts();
        assertTrue(products.isRegionalExp());
    }

    @Test
    void isRegional() {
        Products products = getProducts();
        assertTrue(products.isRegional());
    }

    @Test
    void isSuburban() {
        Products products = getProducts();
        assertTrue(products.isSuburban());
    }

    @Test
    void isBus() {
        Products products = getProducts();
        assertTrue(products.isBus());
    }

    @Test
    void isFerry() {
        Products products = getProducts();
        assertTrue(products.isFerry());
    }

    @Test
    void isSubway() {
        Products products = getProducts();
        assertTrue(products.isSubway());
    }

    @Test
    void isTram() {
        Products products = getProducts();
        assertTrue(products.isTram());
    }

    @Test
    void isTaxi() {
        Products products = getProducts();
        assertTrue(products.isTaxi());
    }

    @Test
    void setNationalExpress() {
        Products products = getProducts();
        assertTrue(products.isNationalExpress());
        products.setNationalExpress(false);
        assertFalse(products.isNationalExpress());
    }

    @Test
    void setNational() {
        Products products = getProducts();
        assertTrue(products.isNational());
        products.setNational(false);
        assertFalse(products.isNational());
    }

    @Test
    void setRegionalExp() {
        Products products = getProducts();
        assertTrue(products.isRegionalExp());
        products.setRegionalExp(false);
        assertFalse(products.isRegionalExp());
    }

    @Test
    void setRegional() {
        Products products = getProducts();
        assertTrue(products.isRegional());
        products.setRegional(false);
        assertFalse(products.isRegional());
    }

    @Test
    void setSuburban() {
        Products products = getProducts();
        assertTrue(products.isSuburban());
        products.setSuburban(false);
        assertFalse(products.isSuburban());
    }

    @Test
    void setBus() {
        Products products = getProducts();
        assertTrue(products.isBus());
        products.setBus(false);
        assertFalse(products.isBus());
    }

    @Test
    void setFerry() {
        Products products = getProducts();
        assertTrue(products.isFerry());
        products.setFerry(false);
        assertFalse(products.isFerry());
    }

    @Test
    void setSubway() {
        Products products = getProducts();
        assertTrue(products.isSubway());
        products.setSubway(false);
        assertFalse(products.isSubway());
    }

    @Test
    void setTram() {
        Products products = getProducts();
        assertTrue(products.isTram());
        products.setTram(false);
        assertFalse(products.isTram());
    }

    @Test
    void setTaxi() {
        Products products = getProducts();
        assertTrue(products.isTaxi());
        products.setTaxi(false);
        assertFalse(products.isTaxi());
    }

    @Test
    void testEquals() {
        Products products = getProducts();
        Products products1 = getProducts();

        assertEquals(products, products1);

        products1.setNationalExpress(false);
        assertNotEquals(products, products1);

        products1.setNationalExpress(true);
        products1.setNational(false);
        assertNotEquals(products, products1);

        products1.setNational(true);
        products1.setRegionalExp(false);
        assertNotEquals(products, products1);
    }

    @Test
    void testHashCode() {
        Products products = getProducts();
        Products products1 = getProducts();

        assertEquals(products.hashCode(), products1.hashCode());

        products1.setNationalExpress(false);
        assertNotEquals(products.hashCode(), products1.hashCode());

        products1.setNationalExpress(true);
        products1.setNational(false);
        assertNotEquals(products.hashCode(), products1.hashCode());

        products1.setNational(true);
        products1.setRegionalExp(false);
        assertNotEquals(products.hashCode(), products1.hashCode());
    }

    Products getProducts() {
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
        return products;
    }
}