package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTypeTest {

    @Test
    void toValue() {
        LineType lineType = LineType.LINE;
        assertEquals("line", lineType.toValue());
    }

    @Test
    void forValue() throws IOException {
        LineType lineType = LineType.LINE;
        assertEquals(lineType, LineType.forValue("line"));
    }

    @Test
    void values() {
        LineType lineType = LineType.LINE;
        assertEquals(lineType, LineType.values()[0]);
    }

    @Test
    void valueOf() {
        LineType lineType = LineType.LINE;
        assertEquals(lineType, LineType.valueOf("LINE"));
    }
}