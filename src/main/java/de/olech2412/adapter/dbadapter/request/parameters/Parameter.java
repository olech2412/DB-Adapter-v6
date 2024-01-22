package de.olech2412.adapter.dbadapter.request.parameters;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a parameter that can be used in a request.
 * It contains a name and a value of generic type T.
 *
 * @param <T> the type of the value of the parameter
 */
@Getter
public class Parameter<T> {

    private final RequestParametersNames requestParametersNames;
    private final T value;

    /**
     * Private constructor for creating a new Parameter.
     *
     * @param requestParametersNames the name of the parameter
     * @param value                  the value of the parameter
     */
    private Parameter(RequestParametersNames requestParametersNames, T value) {
        this.requestParametersNames = requestParametersNames;
        this.value = value;
    }

    /**
     * This class is used to build a list of Parameters.
     */
    public static class ParameterBuilder {
        private final List<Parameter<?>> parameters = new ArrayList<>();

        /**
         * Adds a new Parameter to the list.
         *
         * @param requestParameter the name of the parameter
         * @param value            the value of the parameter
         * @return the ParameterBuilder instance
         */
        public <T> ParameterBuilder add(RequestParametersNames requestParameter, T value) {
            parameters.add(new Parameter<>(requestParameter, value));
            return this;
        }

        /**
         * Returns a new list of Parameters.
         *
         * @return a new list of Parameters
         */
        public List<Parameter<?>> build() {
            return new ArrayList<>(parameters);
        }
    }

}