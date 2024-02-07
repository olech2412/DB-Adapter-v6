package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ModeTest {

    @Test
    void toValueShouldReturnCorrectString() {
        assertEquals("bus", Mode.BUS.toValue());
        assertEquals("taxi", Mode.TAXI.toValue());
        assertEquals("watercraft", Mode.WATERCRAFT.toValue());
        assertEquals("train", Mode.TRAIN.toValue());
    }

    @Test
    void forValueShouldReturnCorrectMode() throws IOException {
        assertEquals(Mode.BUS, Mode.forValue("bus"));
        assertEquals(Mode.TAXI, Mode.forValue("taxi"));
        assertEquals(Mode.WATERCRAFT, Mode.forValue("watercraft"));
        assertEquals(Mode.TRAIN, Mode.forValue("train"));
    }

    @Test
    void forValueShouldThrowExceptionForInvalidValue() {
        assertThrows(IOException.class, () -> Mode.forValue("invalid"));
    }
}