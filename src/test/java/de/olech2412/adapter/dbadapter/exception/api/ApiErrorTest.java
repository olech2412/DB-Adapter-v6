package de.olech2412.adapter.dbadapter.exception.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiErrorTest {

    @Test
    void creatingApiErrorShouldSetMessageAndCode() {
        String message = "Error Message";
        int code = 404;
        ApiError apiError = new ApiError(message, code);

        assertEquals(message, apiError.getMessage());
        assertEquals(code, apiError.getCode());
    }

    @Test
    void getErrorShouldReturnFormattedErrorMessage() {
        String message = "Error Message";
        int code = 404;
        ApiError apiError = new ApiError(message, code);

        String expected = "404: Error Message";
        assertEquals(expected, apiError.getError());
    }
}