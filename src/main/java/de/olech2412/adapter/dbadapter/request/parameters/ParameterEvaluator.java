package de.olech2412.adapter.dbadapter.request.parameters;

import java.util.List;

/**
 * This class is responsible for evaluating a list of Parameters.
 * It provides a method to convert a list of Parameters to a String.
 */
public class ParameterEvaluator {

    /**
     * Converts a list of Parameters to a String.
     * The resulting String is a concatenation of the parameter names and their values,
     * separated by an equals sign. Each parameter is separated by an ampersand.
     *
     * @param parameters the list of Parameters to convert
     * @return a String representation of the list of Parameters
     */
    public static String convertToString(List<Parameter<?>> parameters) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Parameter<?> parameter : parameters) {
            if (stringBuilder.isEmpty()) { // if its the first parameter, add a question mark
                stringBuilder.append("?");
            }
            stringBuilder.append(parameter.getRequestParametersNames().toString());
            stringBuilder.append("=");
            stringBuilder.append(parameter.getValue().toString());
            if (parameters.indexOf(parameter) != parameters.size() - 1) { // if its not the last parameter, add an ampersand
                stringBuilder.append("&");
            }
        }
        return stringBuilder.toString();
    }

}