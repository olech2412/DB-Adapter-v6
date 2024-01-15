package de.olech2412.adapter.dbadapter.request;

import lombok.Getter;
import lombok.Setter;

/**
 * This class stores information about all possible requests
 * It stores the base url and the class that represents the response
 */
public class Request {

    // The endpoint of the api
    @Getter
    @Setter
    private String apiEndpoint;

    // The class that represents the response
    @Getter
    private Class<?> responseClass;

    // get the endpoint of the api
    private Request() {
    }


    public static class RequestBuilder {

        // The endpoint of the api
        private RequestPath apiEndpoint;

        // The class that represents the response
        private Class<?> responseClass;

        public RequestBuilder() {
        }

        // set the endpoint of the api
        public RequestBuilder setApiEndpoint(RequestPath apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }

        // set the class that represents the response
        public RequestBuilder setResponseClass(Class<?> responseClass) {
            this.responseClass = responseClass;
            return this;
        }

        // build the request
        public Request build() {
            Request request = new Request();
            request.apiEndpoint = this.apiEndpoint.getPath();
            request.responseClass = this.responseClass;
            return request;
        }
    }

}
