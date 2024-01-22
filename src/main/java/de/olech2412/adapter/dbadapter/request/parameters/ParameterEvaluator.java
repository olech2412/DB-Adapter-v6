package de.olech2412.adapter.dbadapter.request.parameters;

import java.util.List;

public class ParameterEvaluator {

    public static String convertToString(List<Parameter<?>> parameters) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Parameter<?> parameter : parameters) {
            if (stringBuilder.isEmpty()) {
                stringBuilder.append("?");
            }
            stringBuilder.append(parameter.getRequestParametersNames().toString());
            stringBuilder.append("=");
            stringBuilder.append(parameter.getValue().toString());
            if (parameters.indexOf(parameter) != parameters.size() - 1) {
                stringBuilder.append("&");
            }
        }
        return stringBuilder.toString();
    }

}
