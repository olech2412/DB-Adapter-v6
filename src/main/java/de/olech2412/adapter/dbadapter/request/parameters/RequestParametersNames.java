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

    FROM("from"), // from

    TO("to"), // to

    DEPARTURE("departure"), // departure

    ARRIVAL("arrival"), // arrival

    EARLIER_THAN("earlierThan"), // Compute journeys "before" an ealierRef.

    LATER_THAN("laterThan"), // Compute journeys "after" an laterRef.

    STOP_OVERS("stopovers"), // Fetch & parse stopovers on the way?

    TRANSFERS("transfers"), // Maximum number of transfers.

    TRANSFER_TIME("transferTime"), // Minimum time for a single transfer in minutes.

    ACCESSIBILITY("accessibility"), // Partial or complete

    BIKE("bike"), // Compute only bike-friendly journeys?

    START_WITH_WALKING("startWithWalking"), // Consider walking to nearby stations at the beginning of a journey?

    WALKING_SPEED("walkingSpeed"), // slow, normal or fast

    TICKETS("tickets"), // Return information about available tickets?

    POLYLINES("polylines"), // Fetch & parse a shape for each journey leg?

    SUB_STOPS("subStops"), // Parse & return sub-stops of stations?

    ENTRANCES("entrances"), // Parse & return entrances of stops/stations?

    SCHEDULED_DAYS("scheduledDays"), // Parse & return dates each journey is valid on?

    LOYALTY_CARD("loyaltyCard"),  // Type of loyalty card in use

    FIRST_CLASS("firstClass"), // Search for first-class options?

    AGE("age"), // Age of traveller

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
