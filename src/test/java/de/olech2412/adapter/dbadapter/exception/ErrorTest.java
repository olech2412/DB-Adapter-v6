package de.olech2412.adapter.dbadapter.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ErrorTest {

    @Test
    void creatingErrorShouldSetMessageAndCode() {
        String message = "Error Message";
        int code = 404;
        Error error = new Error() {
            @Override
            public String getMessage() {
                return message;
            }

            @Override
            public int getCode() {
                return code;
            }
        };

        assertEquals(message, error.getMessage());
        assertEquals(code, error.getCode());
    }

    @Test
    void getErrorShouldReturnFormattedErrorMessage() {
        String message = "Error Message";
        int code = 404;
        Error error = new Error() {
            @Override
            public String getMessage() {
                return message;
            }

            @Override
            public int getCode() {
                return code;
            }
        };

        String expected = "404: Error Message";
        assertEquals(expected, error.getError());
    }
}