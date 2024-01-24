package de.olech2412.adapter.dbadapter.gsonadapter;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LocalDateTimeAdapterTest {

    private LocalDateTimeAdapter adapter;
    private JsonWriter writer;
    private StringWriter stringWriter;

    @BeforeEach
    public void setup() {
        adapter = new LocalDateTimeAdapter();
        stringWriter = new StringWriter();
        writer = new JsonWriter(stringWriter);
    }

    @Test
    public void writesLocalDateTimeAsFormattedString() throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2022, 1, 1, 12, 0);

        adapter.write(writer, dateTime);
        writer.close();

        assertEquals("\"2022-01-01T12:00:00\"", stringWriter.toString());
    }

    @Test
    public void writesNullAsNull() throws Exception {
        adapter.write(writer, null);
        writer.close();

        assertEquals("null", stringWriter.toString());
    }

    @Test
    public void readsFormattedStringAsLocalDateTime() throws Exception {
        String input = "\"2022-01-01T12:00:00\"";
        JsonReader reader = new JsonReader(new StringReader(input));

        LocalDateTime result = adapter.read(reader);

        assertEquals(LocalDateTime.of(2022, 1, 1, 12, 0), result);
    }

    @Test
    public void readsNullAsNull() throws Exception {
        String input = "null";
        JsonReader reader = new JsonReader(new StringReader(input));

        LocalDateTime result = adapter.read(reader);

        assertNull(result);
    }
}