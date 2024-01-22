package de.olech2412.adapter.dbadapter.request.parameters;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ParameterTest {

    @Test
    public void parameterBuilderAddsParameterToList() {
        Parameter.ParameterBuilder parameterBuilder = new Parameter.ParameterBuilder();
        parameterBuilder.add(RequestParametersNames.RESULTS, 1);
        List<Parameter<?>> parameters = parameterBuilder.build();

        Assert.assertEquals(1, parameters.size());
        Assert.assertEquals(RequestParametersNames.RESULTS, parameters.get(0).getRequestParametersNames());
        Assert.assertEquals(1, parameters.get(0).getValue());
    }

    @Test
    public void parameterBuilderCreatesEmptyListWhenNoParametersAdded() {
        Parameter.ParameterBuilder parameterBuilder = new Parameter.ParameterBuilder();
        List<Parameter<?>> parameters = parameterBuilder.build();

        Assert.assertTrue(parameters.isEmpty());
    }

    @Test
    public void parameterBuilderCreatesNewListOnEachBuild() {
        Parameter.ParameterBuilder parameterBuilder = new Parameter.ParameterBuilder();
        parameterBuilder.add(RequestParametersNames.RESULTS, 1);

        List<Parameter<?>> parameters1 = parameterBuilder.build();
        List<Parameter<?>> parameters2 = parameterBuilder.build();

        Assert.assertNotSame(parameters1, parameters2);
    }
}