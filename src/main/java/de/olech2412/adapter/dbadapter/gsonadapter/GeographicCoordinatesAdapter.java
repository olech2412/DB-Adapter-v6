package de.olech2412.adapter.dbadapter.gsonadapter;

import com.google.gson.*;
import de.olech2412.adapter.dbadapter.model.station.sub.GeographicCoordinates;

public class GeographicCoordinatesAdapter implements JsonDeserializer<GeographicCoordinates> {

    @Override
    public GeographicCoordinates deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String type = jsonObject.get("type").getAsString();
        JsonArray coordinatesArray = jsonObject.getAsJsonArray("coordinates");

        float latitude = coordinatesArray.get(0).getAsFloat();
        float longitude = coordinatesArray.get(1).getAsFloat();

        GeographicCoordinates geographicCoordinates = new GeographicCoordinates();
        geographicCoordinates.setType(type);
        geographicCoordinates.setLatitude(latitude);
        geographicCoordinates.setLongitude(longitude);

        return geographicCoordinates;
    }
}