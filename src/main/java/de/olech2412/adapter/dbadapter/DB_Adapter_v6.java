package de.olech2412.adapter.dbadapter;

import com.google.gson.*;
import de.olech2412.adapter.dbadapter.exception.Error;
import de.olech2412.adapter.dbadapter.exception.Result;
import de.olech2412.adapter.dbadapter.exception.api.ApiError;
import de.olech2412.adapter.dbadapter.gsonadapter.LocalDateTimeAdapter;
import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.model.stop.Stop;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import de.olech2412.adapter.dbadapter.request.Request;
import de.olech2412.adapter.dbadapter.request.RequestPath;
import org.apache.commons.io.IOUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 * This class is responsible for making requests to the API and returning the response
 * It uses the APIConfiguration to get the base url and the requests
 * It uses the Gson library to parse the response
 *
 * @author olech2412
 * @since 0.0.1
 */
public class DB_Adapter_v6 {

    private final APIConfiguration apiConfiguration; // The configuration of the api

    // The gson object that is used to parse the response
    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
            .create();

    public DB_Adapter_v6(APIConfiguration apiConfiguration) {
        this.apiConfiguration = apiConfiguration;
    }

    /**
     * Get all departures of a stop by id with a duration and a number of results
     *
     * @param id       the id of the stop
     * @param duration the duration in minutes
     * @param results  the number of results
     * @return the departures as an array of trips
     * @throws IOException if the request fails
     */
    public Trip[] getDeparturesByStopIdWithDurationAndResults(Integer id, Integer duration, Integer results) throws IOException {
        Request request = getRequest(RequestPath.STOPS_BY_ID_DEPARTURES);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + "?duration=" + duration + "&" + "results=" + results);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("departures");
            return gson.fromJson(jsonArray, Trip[].class);
        }
    }

    /**
     * Get all arrivals of a stop by id with a duration and a number of results
     *
     * @param id       the id of the stop
     * @param duration the duration in minutes
     * @param results  the number of results
     * @return the arrivals as an array of trips
     * @throws IOException if the request fails
     */
    public Trip[] getArrivalsByStopIdWithDurationAndResults(Integer id, Integer duration, Integer results) throws IOException {
        Request request = getRequest(RequestPath.STOPS_BY_ID_ARRIVALS);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + "?duration=" + duration + "&" + "results=" + results);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("arrivals");
            return gson.fromJson(jsonArray, Trip[].class);
        }
    }

    /**
     * Get all departures of a stop by id with a duration
     *
     * @param id       the id of the stop
     * @param duration the duration in minutes
     * @return the departures as an array of trips
     * @throws IOException if the request fails
     */
    public Trip[] getDeparturesByStopIdWithDuration(Integer id, Integer duration) throws IOException {
        Request request = getRequest(RequestPath.STOPS_BY_ID_DEPARTURES);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + "?duration=" + duration);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("departures");
            return gson.fromJson(jsonArray, Trip[].class);
        }
    }

    /**
     * Get all arrivals of a stop by id with a duration
     *
     * @param id       the id of the stop
     * @param duration the duration in minutes
     * @return the arrivals as an array of trips
     * @throws IOException if the request fails
     */
    public Trip[] getArrivalsByStopIdWithDuration(Integer id, Integer duration) throws IOException {
        Request request = getRequest(RequestPath.STOPS_BY_ID_ARRIVALS);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + "?duration=" + duration);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("arrivals");
            return gson.fromJson(jsonArray, Trip[].class);
        }
    }

    /**
     * Get all departures of a stop by id
     *
     * @param id the id of the stop
     * @return the departures as an array of trips
     * @throws IOException if the request fails
     */
    public Trip[] getDeparturesByStopId(Integer id) throws IOException {
        Request request = getRequest(RequestPath.STOPS_BY_ID_DEPARTURES);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id));
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("departures");
            return gson.fromJson(jsonArray, Trip[].class);
        }
    }

    /**
     * Get all arrivals of a stop by id
     *
     * @param id the id of the stop
     * @return the arrivals as an array of trips
     * @throws IOException if the request fails
     */
    public Trip[] getArrivalsByStopId(Integer id) throws IOException {
        Request request = getRequest(RequestPath.STOPS_BY_ID_ARRIVALS);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id));
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("arrivals");
            return gson.fromJson(jsonArray, Trip[].class);
        }
    }

    /**
     * Get all stops by id
     *
     * @param id the id of the stop
     * @return the stop
     * @throws IOException if the request fails
     */
    public Stop getStopById(Integer id) throws IOException {
        Request request = getRequest(RequestPath.STOPS_BY_ID);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id));
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            return gson.fromJson(result.getData(), Stop.class);
        }
    }

    /**
     * Get all stations by id
     *
     * @param id the id of the station
     * @return the station
     * @throws IOException if the request fails
     */
    public Station getStationById(Integer id) throws IOException {
        Request request = getRequest(RequestPath.STATIONS_BY_ID);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id));
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            throw new IOException(result.getError().getError());
        } else {
            return gson.fromJson(result.getData(), Station.class);
        }
    }

    /**
     * Get the request from the api configuration
     *
     * @param requestPath the path of the request
     * @return the request
     */
    private Request getRequest(RequestPath requestPath) {
        for (Request request : apiConfiguration.getRequests()) {
            if (request.getApiEndpoint().equals(requestPath.getPath())) {
                return request;
            }
        }

        throw new IllegalArgumentException("Request not found");
    }

    /**
     * Perform the request
     * @param request the request
     * @return the result of the request
     * @throws IOException if the request fails
     */
    private Result<JsonObject, Error> performRequest(Request request) throws IOException {
        URL url = new URL(apiConfiguration.getBaseUrl() + request.getApiEndpoint());
        HttpsURLConnection con;

        if (apiConfiguration.getProxy() != null) {
            con = (HttpsURLConnection) url.openConnection(apiConfiguration.getProxy());
        } else {
            con = (HttpsURLConnection) url.openConnection();
        }

        con.setRequestMethod("GET");
        con.setDoOutput(true);
        con.setConnectTimeout(10000); // Timeout for connecting and reading 10 seconds
        con.setReadTimeout(10000);

        con.setRequestProperty("Content-Type", "application/json");

        con.connect();

        if (con.getResponseCode() != 200) {
            InputStream errorStream = con.getErrorStream();
            String errorString = IOUtils.toString(errorStream, StandardCharsets.UTF_8);
            ApiError apiError = new ApiError(errorString, con.getResponseCode());
            return Result.error(apiError);
        }

        InputStream jsonResponse = con.getInputStream();

        JsonStreamParser jsonStreamParser = new JsonStreamParser(IOUtils.toString(jsonResponse, StandardCharsets.UTF_8));

        JsonElement element = jsonStreamParser.next();

        JsonObject outerObject = element.getAsJsonObject();

        return Result.success(outerObject);

    }
}