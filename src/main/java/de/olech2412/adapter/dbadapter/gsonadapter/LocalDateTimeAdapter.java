package de.olech2412.adapter.dbadapter.gsonadapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

    // Definieren Sie ein DateTimeFormatter-Objekt, um das Datum und die Uhrzeit zu formatieren
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    // Überschreiben Sie die write-Methode, um ein LocalDateTime-Objekt in einen Json-Wert zu konvertieren
    @Override
    public void write(JsonWriter out, LocalDateTime value) throws IOException {
        // Wenn der Wert null ist, schreiben Sie null in den JsonWriter
        if (value == null) {
            out.nullValue();
            return;
        }
        // Andernfalls formatieren Sie den Wert mit dem DateTimeFormatter und schreiben Sie ihn als String in den JsonWriter
        String formatted = formatter.format(value);
        out.value(formatted);
    }

    // Überschreiben Sie die read-Methode, um einen Json-Wert in ein LocalDateTime-Objekt zu konvertieren
    @Override
    public LocalDateTime read(JsonReader in) throws IOException {
        // Wenn der Json-Wert null ist, geben Sie null zurück
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        // Andernfalls lesen Sie den Json-Wert als String und parsen Sie ihn mit dem DateTimeFormatter
        String formatted = in.nextString();
        return LocalDateTime.parse(formatted, formatter);
    }
}