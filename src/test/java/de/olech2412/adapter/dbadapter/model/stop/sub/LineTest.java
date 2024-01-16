package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Line line = getLine();
        assertEquals("Line{type=LINE, id='id', fahrtNr='fahrtNr', name='name', linePublic=true, productName='productName', mode=BUS, product='product'}", line.toString());
    }

    @Test
    void getType() {
        Line line = getLine();
        assertEquals(LineType.LINE, line.getType());
    }

    @Test
    void getId() {
        Line line = getLine();
        assertEquals("id", line.getId());
    }

    @Test
    void getFahrtNr() {
        Line line = getLine();
        assertEquals("fahrtNr", line.getFahrtNr());
    }

    @Test
    void getName() {
        Line line = getLine();
        assertEquals("name", line.getName());
    }

    @Test
    void isLinePublic() {
        Line line = getLine();
        assertTrue(line.isLinePublic());
    }

    @Test
    void getProductName() {
        Line line = getLine();
        assertEquals("productName", line.getProductName());
    }

    @Test
    void getMode() {
        Line line = getLine();
        assertEquals(Mode.BUS, line.getMode());
    }

    @Test
    void getProduct() {
        Line line = getLine();
        assertEquals("product", line.getProduct());
    }

    @Test
    void setType() {
        Line line = getLine();
        assertEquals(LineType.LINE, line.getType());

        line.setType(null);
        assertNull(line.getType());
    }

    @Test
    void setId() {
        Line line = getLine();
        assertEquals("id", line.getId());

        line.setId(null);
        assertNull(line.getId());
    }

    @Test
    void setFahrtNr() {
        Line line = getLine();
        assertEquals("fahrtNr", line.getFahrtNr());

        line.setFahrtNr(null);
        assertNull(line.getFahrtNr());
    }

    @Test
    void setName() {
        Line line = getLine();
        assertEquals("name", line.getName());

        line.setName(null);
        assertNull(line.getName());
    }

    @Test
    void setLinePublic() {
        Line line = getLine();
        assertTrue(line.isLinePublic());

        line.setLinePublic(false);
        assertFalse(line.isLinePublic());
    }

    @Test
    void setProductName() {
        Line line = getLine();
        assertEquals("productName", line.getProductName());

        line.setProductName(null);
        assertNull(line.getProductName());
    }

    @Test
    void setMode() {
        Line line = getLine();
        assertEquals(Mode.BUS, line.getMode());

        line.setMode(null);
        assertNull(line.getMode());
    }

    @Test
    void setProduct() {
        Line line = getLine();
        assertEquals("product", line.getProduct());

        line.setProduct(null);
        assertNull(line.getProduct());
    }

    @Test
    void testEquals() {
        Line line = getLine();
        assertEquals(line, line);
        assertNotEquals(line, null);
        assertNotEquals(line, new Object());
        Line line2 = getLine();
        assertEquals(line, line2);
        line2.setType(null);
        assertNotEquals(line, line2);
        line2.setType(LineType.LINE);
        assertEquals(line, line2);
        line2.setId(null);
        assertNotEquals(line, line2);
        line2.setId("id");
        assertEquals(line, line2);
    }

    @Test
    void testHashCode() {
        Line line = getLine();
        assertEquals(line.hashCode(), line.hashCode());
        assertNotEquals(line.hashCode(), new Object().hashCode());
        Line line2 = getLine();
        assertEquals(line.hashCode(), line2.hashCode());
        line2.setType(null);
        assertNotEquals(line.hashCode(), line2.hashCode());
        line2.setType(LineType.LINE);
        assertEquals(line.hashCode(), line2.hashCode());
        line2.setId(null);
        assertNotEquals(line.hashCode(), line2.hashCode());
        line2.setId("id");
        assertEquals(line.hashCode(), line2.hashCode());
    }

    Line getLine() {
        Line line = new Line();
        line.setType(LineType.LINE);
        line.setId("id");
        line.setFahrtNr("fahrtNr");
        line.setName("name");
        line.setLinePublic(true);
        line.setProductName("productName");
        line.setMode(Mode.BUS);
        line.setProduct("product");
        return line;
    }
}