package de.olech2412.adapter.dbadapter.gsonadapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class is used to convert a LocalDateTime object to a JSON value and vice versa
 *
 * @since 0.0.1
 */
public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

    // define a DateTimeFormatter, which is used to parse and format LocalDateTime objects
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    // override the write method to convert a LocalDateTime object to a JSON value
    @Override
    public void write(JsonWriter out, LocalDateTime value) throws IOException {
        // if the value is null, write null to the JsonWriter
        if (value == null) {
            out.nullValue();
            return;
        }
        // otherwise format the value with the DateTimeFormatter and write it to the JsonWriter
        String formatted = formatter.format(value);
        out.value(formatted);
    }

    // override the read method to convert a JSON value to a LocalDateTime object
    @Override
    public LocalDateTime read(JsonReader in) throws IOException {
        // Wenn der Json-Wert null ist, geben Sie null zurück
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        // otherwise read the value as a String and parse it with the DateTimeFormatter
        String formatted = in.nextString();
        return LocalDateTime.parse(formatted, formatter);
    }
}