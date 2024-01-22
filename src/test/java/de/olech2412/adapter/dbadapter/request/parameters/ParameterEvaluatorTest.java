package de.olech2412.adapter.dbadapter.request.parameters;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ParameterEvaluatorTest {

    @Test
    public void convertToStringReturnsEmptyStringWhenNoParameters() {
        List<Parameter<?>> parameters = Arrays.asList();
        String result = ParameterEvaluator.convertToString(parameters);
        Assert.assertEquals("", result);
    }

    @Test
    public void convertToStringReturnsCorrectStringForSingleParameter() {
        Parameter<?> parameter = new Parameter<>(RequestParametersNames.RESULTS, 1);
        List<Parameter<?>> parameters = Arrays.asList(parameter);
        String result = ParameterEvaluator.convertToString(parameters);
        Assert.assertEquals("?results=1", result);
    }

    @Test
    public void convertToStringReturnsCorrectStringForMultipleParameters() {
        Parameter<?> parameter1 = new Parameter<>(RequestParametersNames.DIRECTION, "München");
        Parameter<?> parameter2 = new Parameter<>(RequestParametersNames.RESULTS, 2);
        List<Parameter<?>> parameters = Arrays.asList(parameter1, parameter2);
        String result = ParameterEvaluator.convertToString(parameters);
        Assert.assertEquals("?direction=München&results=2", result);
    }
}