package de.olech2412.adapter.dbadapter.model.station.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class OperatorTest {

    @Test
    void testToString() {
        Operator operator = getOperator();
        assertEquals("Operator{type='type', id='id', name='name'}", operator.toString());
    }

    @Test
    void getType() {
        Operator operator = getOperator();
        assertEquals("type", operator.getType());
    }

    @Test
    void getId() {
        Operator operator = getOperator();
        assertEquals("id", operator.getId());
    }

    @Test
    void getName() {
        Operator operator = getOperator();
        assertEquals("name", operator.getName());
    }

    @Test
    void setType() {
        Operator operator = getOperator();
        assertEquals("type", operator.getType());
        operator.setType("type2");
        assertEquals("type2", operator.getType());
    }

    @Test
    void setId() {
        Operator operator = getOperator();
        assertEquals("id", operator.getId());
        operator.setId("id2");
        assertEquals("id2", operator.getId());
    }

    @Test
    void setName() {
        Operator operator = getOperator();
        assertEquals("name", operator.getName());
        operator.setName("name2");
        assertEquals("name2", operator.getName());
    }

    @Test
    void testEquals() {
        Operator operator = getOperator();
        assertEquals(operator, operator);
        assertNotEquals(operator, null);
        assertNotEquals(operator, new Object());
        Operator operator2 = getOperator();
        assertEquals(operator, operator2);
        operator2.setType("type2");
        assertNotEquals(operator, operator2);
        operator2.setType("type");
        assertEquals(operator, operator2);
        operator2.setId("id2");
        assertNotEquals(operator, operator2);
        operator2.setId("id");
        assertEquals(operator, operator2);
        operator2.setName("name2");
        assertNotEquals(operator, operator2);
        operator2.setName("name");
        assertEquals(operator, operator2);
    }

    @Test
    void testHashCode() {
        Operator operator = getOperator();
        assertEquals(operator.hashCode(), operator.hashCode());
        Operator operator2 = getOperator();
        assertEquals(operator.hashCode(), operator2.hashCode());
        operator2.setType("type2");
        assertNotEquals(operator.hashCode(), operator2.hashCode());
        operator2.setType("type");
        assertEquals(operator.hashCode(), operator2.hashCode());
        operator2.setId("id2");
        assertNotEquals(operator.hashCode(), operator2.hashCode());
        operator2.setId("id");
        assertEquals(operator.hashCode(), operator2.hashCode());
        operator2.setName("name2");
        assertNotEquals(operator.hashCode(), operator2.hashCode());
        operator2.setName("name");
        assertEquals(operator.hashCode(), operator2.hashCode());
    }

    Operator getOperator() {
        Operator operator = new Operator();
        operator.setType("type");
        operator.setId("id");
        operator.setName("name");
        return operator;
    }
}