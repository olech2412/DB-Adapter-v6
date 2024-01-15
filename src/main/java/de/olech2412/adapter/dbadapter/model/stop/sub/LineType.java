package de.olech2412.adapter.dbadapter.model.stop.sub;

import java.io.IOException;

public enum LineType {
    LINE;

    public String toValue() {
        switch (this) {
            case LINE: return "line";
        }
        return null;
    }

    public static LineType forValue(String value) throws IOException {
        if (value.equals("line")) return LINE;
        throw new IOException("Cannot deserialize LineType");
    }
}