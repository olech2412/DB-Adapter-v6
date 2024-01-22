package de.olech2412.adapter.dbadapter.request.parameters;

import lombok.Getter;

@Getter
public enum RequestParametersNames {

    PRETTY("pretty"), // pretty print

    LINES_OF_STOPS("linesOfStops"), // parse & print lines for each stop?

    LANGUAGE("language"), // language

    WHEN("when"), // date and time

    DIRECTION("direction"), // direction

    DURATION("duration"), // duration (fetch data for the next n minutes)

    RESULTS("results"), // number of results

    REMARKS("remarks"); // parse & print remarks? like hints and warnings

    private final String parameter;

    RequestParametersNames(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return parameter;
    }
}