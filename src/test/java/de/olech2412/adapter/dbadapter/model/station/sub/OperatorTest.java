package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void creatingOperatorShouldSetAllFieldsCorrectly() {
        Operator operator = new Operator();
        operator.setId(1L);
        operator.setType("Type");
        operator.setOperatorId("Operator ID");
        operator.setName("Operator Name");

        assertEquals(1L, operator.getId());
        assertEquals("Type", operator.getType());
        assertEquals("Operator ID", operator.getOperatorId());
        assertEquals("Operator Name", operator.getName());
    }

    @Test
    void equalsShouldReturnTrueForSameId() {
        Operator operator1 = new Operator();
        operator1.setId(1L);

        Operator operator2 = new Operator();
        operator2.setId(1L);

        assertTrue(operator1.equals(operator2));
    }

    @Test
    void equalsShouldReturnFalseForDifferentId() {
        Operator operator1 = new Operator();
        operator1.setId(1L);

        Operator operator2 = new Operator();
        operator2.setId(2L);

        assertFalse(operator1.equals(operator2));
    }

    @Test
    void hashCodeShouldBeSameForSameClass() {
        Operator operator1 = new Operator();
        Operator operator2 = new Operator();

        assertEquals(operator1.hashCode(), operator2.hashCode());
    }
}