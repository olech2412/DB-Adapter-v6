package de.olech2412.adapter.dbadapter.gsonadapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapterForTrip implements JsonDeserializer<LocalDateTime> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @Override
    public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String dateString = json.getAsString();
        if (dateString == null || dateString.isEmpty()) {
            return null; // Return null if the date string is empty or null
        }

        try {
            return LocalDateTime.parse(dateString, formatter);
        } catch (Exception e) {
            throw new JsonParseException("Error parsing LocalDateTime", e);
        }
    }
}
