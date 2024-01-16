package de.olech2412.adapter.dbadapter.model.stop.sub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModeTest {

    @Test
    void toValue() {
        Mode mode = Mode.BUS;
        assertEquals("bus", mode.toValue());

        mode = Mode.TAXI;
        assertEquals("taxi", mode.toValue());

        mode = Mode.WATERCRAFT;
        assertEquals("watercraft", mode.toValue());

        mode = Mode.TRAIN;
        assertEquals("train", mode.toValue());

        mode = null;
        assertNull(mode);
    }

    @Test
    void forValue() {
        Mode mode = Mode.BUS;
        try {
            assertEquals(Mode.BUS, Mode.forValue("bus"));
        } catch (Exception e) {
            fail();
        }

        try {
            assertEquals(Mode.TAXI, Mode.forValue("taxi"));
        } catch (Exception e) {
            fail();
        }

        try {
            assertEquals(Mode.WATERCRAFT, Mode.forValue("watercraft"));
        } catch (Exception e) {
            fail();
        }

        try {
            assertEquals(Mode.TRAIN, Mode.forValue("train"));
        } catch (Exception e) {
            fail();
        }

        try {
            Mode.forValue("test");
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    void values() {
        Mode[] modes = Mode.values();
        assertEquals(4, modes.length);
        assertEquals(Mode.BUS, modes[0]);
        assertEquals(Mode.TAXI, modes[1]);
        assertEquals(Mode.WATERCRAFT, modes[2]);
        assertEquals(Mode.TRAIN, modes[3]);
    }

    @Test
    void valueOf() {
        assertEquals(Mode.BUS, Mode.valueOf("BUS"));
        assertEquals(Mode.TAXI, Mode.valueOf("TAXI"));
        assertEquals(Mode.WATERCRAFT, Mode.valueOf("WATERCRAFT"));
        assertEquals(Mode.TRAIN, Mode.valueOf("TRAIN"));
    }
}