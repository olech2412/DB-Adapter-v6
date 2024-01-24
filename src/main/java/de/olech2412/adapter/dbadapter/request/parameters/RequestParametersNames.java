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

    REMARKS("remarks"), // parse & print remarks? like hints and warnings

    NATIONAL_EXPRESS("nationalExpress"), // include national express?

    NATIONAL("national"), // include national trains?

    REGIONAL("regional"), // include regional trains?

    REGIONAL_EXPRESS("regionalExpress"), // include regional express?

    SUBURBAN("suburban"), // include suburban trains?

    BUS("bus"), // include bus?

    FERRY("ferry"), // include ferry?

    SUBWAY("subway"), // include subway?

    TRAM("tram"), // include tram?

    TAXI("taxi"); // include taxi?

    private final String parameter;

    RequestParametersNames(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return parameter;
    }
}
