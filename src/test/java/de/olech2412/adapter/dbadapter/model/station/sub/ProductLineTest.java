package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ProductLineTest {

    @Test
    void creatingProductLineShouldSetAllFieldsCorrectly() {
        ProductLine productLine = new ProductLine();
        productLine.setId(1L);
        productLine.setProductLine("Product Line");
        productLine.setSegment("Segment");

        assertEquals(1L, productLine.getId());
        assertEquals("Product Line", productLine.getProductLine());
        assertEquals("Segment", productLine.getSegment());
    }

    @Test
    void equalsShouldReturnFalseForSameId() {
        ProductLine productLine1 = new ProductLine();
        productLine1.setId(1L);

        ProductLine productLine2 = new ProductLine();
        productLine2.setId(1L);

        assertFalse(productLine1.equals(productLine2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        ProductLine productLine1 = new ProductLine();
        productLine1.setId(1L);

        ProductLine productLine2 = new ProductLine();
        productLine2.setId(2L);

        assertFalse(productLine1.equals(productLine2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        ProductLine productLine1 = new ProductLine();
        ProductLine productLine2 = new ProductLine();

        assertEquals(productLine1.hashCode(), productLine2.hashCode());
    }
}