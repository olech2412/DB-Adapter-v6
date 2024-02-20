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

    public static Mode forValue(String value) throws IOException {
        if (value.equals("bus")) return BUS;
        if (value.equals("taxi")) return TAXI;
        if (value.equals("watercraft")) return WATERCRAFT;
        if (value.equals("train")) return TRAIN;
        throw new IOException("Cannot deserialize Mode");
    }

    public String toValue() {
        switch (this) {
            case BUS:
                return "bus";
            case TAXI:
                return "taxi";
            case WATERCRAFT:
                return "watercraft";
            case TRAIN:
                return "train";
        }
        return null;
    }

    // custom ModeTypeAdapter for gson
    public static class ModeTypeAdapter extends TypeAdapter<Mode> {

        @Override
        public void write(JsonWriter out, Mode value) throws IOException {
            out.value(value.toValue());
        }

        @Override
        public Mode read(JsonReader in) throws IOException {
            String value = in.nextString();
            return Mode.forValue(value);
        }
    }
}