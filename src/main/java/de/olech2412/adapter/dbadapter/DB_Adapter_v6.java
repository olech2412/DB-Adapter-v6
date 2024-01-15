package de.olech2412.adapter.dbadapter;

import com.google.gson.*;
import de.olech2412.adapter.dbadapter.exception.Error;
import de.olech2412.adapter.dbadapter.exception.Result;
import de.olech2412.adapter.dbadapter.exception.api.ApiError;
import de.olech2412.adapter.dbadapter.gsonadapter.LocalDateTimeAdapter;
import de.olech2412.adapter.dbadapter.model.station.Station;
import de.olech2412.adapter.dbadapter.request.Request;
import de.olech2412.adapter.dbadapter.request.RequestPath;
import org.apache.commons.io.IOUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class DB_Adapter_v6 {

    private final APIConfiguration apiConfiguration;

    private String baseUrl;

    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
            .create();

    public DB_Adapter_v6(APIConfiguration apiConfiguration) {
        this.apiConfiguration = apiConfiguration;
        this.baseUrl = apiConfiguration.getBaseUrl();
    }

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
     * @param requestPath the path of the request
     * @return the request
     */
    private Request getRequest(RequestPath requestPath) {
        for (Request request : apiConfiguration.getRequests()) {
            if (request.getApiEndpoint().equals(requestPath.getPath())) {
                return request;
            }
        }

        return null;
    }



    private Result<JsonObject, Error> performRequest(Request request) throws IOException {
        URL url = new URL(baseUrl + request.getApiEndpoint());
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setDoOutput(true);
        con.setConnectTimeout(10000); // Timeout for connecting and reading 10 seconds
        con.setReadTimeout(10000);

        con.setRequestProperty("Content-Type", "application/json");

        con.connect();

        if(con.getResponseCode() != 200) {
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

/**
    public void makeRequest(Request request) throws IOException {
        URL url = new URL(apiConfiguration.getStationsEndpoint());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setDoOutput(true);

        con.setConnectTimeout(10000); // Timeout for connecting and reading 10 seconds
        con.setReadTimeout(10000);

        con.setRequestProperty("Content-Type", "application/json");

        con.connect();

        InputStream jsonObject = con.getInputStream();

        String result = IOUtils.toString(jsonObject, StandardCharsets.UTF_8);

        JsonParser parser = new JsonParser();

        JsonElement element = parser.parse(result);

        JsonObject outerObject = element.getAsJsonObject();

        List<Station> stations = new ArrayList<>();

        Set<String> keys = outerObject.keySet();

        for (String key : keys) {

            // Extrahieren Sie das innere Objekt unter dem Schlüssel als ein JsonObject
            JsonObject stationObject = outerObject.get(key).getAsJsonObject();

            // Verwenden Sie Gson, um das JsonObject in eine Station-Instanz umzuwandeln
            Station station = new Gson().fromJson(stationObject, Station.class);

            // Fügen Sie die Station-Instanz der Liste hinzu
            stations.add(station);
        }
    }

    private void processStop(Stop stop) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 9050));
            URL url = new URL(String.format(apiConfiguration.getStationsEndpoint(), stop.getId()));
            HttpURLConnection con = (HttpURLConnection) url.openConnection(proxy);
            con.setRequestMethod("GET");
            con.setDoOutput(true);
            con.setConnectTimeout(20000); // Timeout for connecting and reading 20 seconds
            con.setReadTimeout(20000);
            con.setRequestProperty("Content-Type", "application/json");

            con.connect();

            int responseCode = con.getResponseCode();

            if (responseCode == 404) {
                log.info("Station with id {} not found", stop.getId());
            } else if (responseCode == 200) {
                processResponse(con.getInputStream(), stop);
            } else {
                log.info("Error while requesting station with id {} with status code {}", stop.getId(), responseCode);
            }
        } catch (IOException e) {
            log.error("Error during network request", e);
        }
    }
 */
}
