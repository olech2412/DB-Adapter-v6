package de.olech2412.adapter.dbadapter.model.stop.sub;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * This class is used to convert a Mode object to a JSON value and vice versa
 */
@JsonAdapter(Mode.ModeTypeAdapter.class)
public enum Mode {
    BUS, TAXI, WATERCRAFT, TRAIN;

    public String toValue() {
        switch (this) {
            case BUS: return "bus";
            case TAXI: return "taxi";
            case WATERCRAFT: return "watercraft";
            case TRAIN: return "train";
        }
        return null;
    }

    public static Mode forValue(String value) throws IOException {
        if (value.equals("bus")) return BUS;
        if (value.equals("taxi")) return TAXI;
        if (value.equals("watercraft")) return WATERCRAFT;
        if (value.equals("train")) return TRAIN;
        throw new IOException("Cannot deserialize Mode");
    }

    // Ihre benutzerdefinierte EnumTypeAdapter-Klasse, die das TypeAdapter-Interface implementiert
    public static class ModeTypeAdapter extends TypeAdapter<Mode> {

        @Override
        public void write(JsonWriter out, Mode value) throws IOException {
            // Schreiben Sie den Enum-Wert als String in den JsonWriter
            out.value(value.toValue());
        }

        @Override
        public Mode read(JsonReader in) throws IOException {
            // Lesen Sie den String-Wert aus dem JsonReader
            String value = in.nextString();
            // Verwenden Sie die forValue-Methode, um den entsprechenden Enum-Wert zu erhalten oder eine IOException zu werfen
            return Mode.forValue(value);
        }
    }
}