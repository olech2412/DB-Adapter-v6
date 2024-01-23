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
import de.olech2412.adapter.dbadapter.request.parameters.Parameter;
import de.olech2412.adapter.dbadapter.request.parameters.ParameterEvaluator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This class is responsible for making requests to the API and returning the response
 * It uses the APIConfiguration to get the base url and the requests
 * It uses the Gson library to parse the response
 *
 * @author olech2412
 * @since 0.0.1
 */
@Slf4j
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
     * Get all departures of a stop by id
     *
     * @param id the id of the stop
     * @return the departures as an array of trips
     * @throws IOException if the request fails
     */
    public Result<Trip[], Error> getDeparturesByStopId(Integer id, List<Parameter<?>> parameters) throws IOException {
        String parameter = ParameterEvaluator.convertToString(parameters);
        Request request = getRequest(RequestPath.STOPS_BY_ID_DEPARTURES);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + parameter);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            log.error(String.format("Error while getting departures by stop id %s: %s", id, result.getError().getError()));
            return Result.error(result.getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("departures");
            return Result.success(gson.fromJson(jsonArray, Trip[].class));
        }
    }

    /**
     * Get all arrivals of a stop by id
     *
     * @param id the id of the stop
     * @return the arrivals as an array of trips
     * @throws IOException if the request fails
     */
    public Result<Trip[], Error> getArrivalsByStopId(Integer id, List<Parameter<?>> parameters) throws IOException {
        String parameter = ParameterEvaluator.convertToString(parameters);
        Request request = getRequest(RequestPath.STOPS_BY_ID_ARRIVALS);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + parameter);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            log.error(String.format("Error while getting arrivals by stop id %s: %s", id, result.getError().getError()));
            return Result.error(result.getError());
        } else {
            JsonArray jsonArray = result.getData().getAsJsonArray("arrivals");
            return Result.success(gson.fromJson(jsonArray, Trip[].class));
        }
    }

    /**
     * Get all stops by id
     *
     * @param id the id of the stop
     * @return a result with the stop or an error
     * @throws IOException if the request fails
     */
    public Result<Stop, Error> getStopById(Integer id, List<Parameter<?>> parameters) throws IOException {
        String parameter = ParameterEvaluator.convertToString(parameters);
        Request request = getRequest(RequestPath.STOPS_BY_ID);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + parameter);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            log.error(String.format("Error while getting stop by id %s: %s", id, result.getError().getError()));
            return Result.error(result.getError());
        } else {
            return Result.success(gson.fromJson(result.getData(), Stop.class));
        }
    }

    /**
     * Get all stations by id
     *
     * @param id the id of the station
     * @return a result with the station or an error
     * @throws IOException if the request fails
     */
    public Result<Station, Error> getStationById(Integer id, List<Parameter<?>> parameters) throws IOException {
        String parameter = ParameterEvaluator.convertToString(parameters);
        Request request = getRequest(RequestPath.STATIONS_BY_ID);
        request.setApiEndpoint(String.format(request.getApiEndpoint(), id) + parameter);
        Result<JsonObject, Error> result = performRequest(request);

        if (!result.isSuccess()) {
            log.error(String.format("Error while getting station by id %s: %s", id, result.getError().getError()));
            return Result.error(result.getError());
        } else {
            return Result.success(gson.fromJson(result.getData(), Station.class));
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
                // important! otherwise it would change the ApiEndpoint permanent
                return new Request.RequestBuilder().setApiEndpoint(requestPath).build(); // Create a new request with the same api endpoint
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
        HttpURLConnection con;

        if (apiConfiguration.getProxy() != null) {
            con = (HttpURLConnection) url.openConnection(apiConfiguration.getProxy());
        } else {
            con = (HttpURLConnection) url.openConnection();
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
