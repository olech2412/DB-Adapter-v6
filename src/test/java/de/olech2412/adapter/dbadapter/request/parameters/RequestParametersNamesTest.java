package de.olech2412.adapter.dbadapter.request.parameters;

import org.junit.Assert;
import org.junit.Test;

public class RequestParametersNamesTest {

    @Test
    public void toStringReturnsCorrectParameterName() {
        Assert.assertEquals("pretty", RequestParametersNames.PRETTY.toString());
        Assert.assertEquals("linesOfStops", RequestParametersNames.LINES_OF_STOPS.toString());
        Assert.assertEquals("language", RequestParametersNames.LANGUAGE.toString());
        Assert.assertEquals("when", RequestParametersNames.WHEN.toString());
        Assert.assertEquals("direction", RequestParametersNames.DIRECTION.toString());
        Assert.assertEquals("duration", RequestParametersNames.DURATION.toString());
        Assert.assertEquals("results", RequestParametersNames.RESULTS.toString());
        Assert.assertEquals("remarks", RequestParametersNames.REMARKS.toString());
    }
}