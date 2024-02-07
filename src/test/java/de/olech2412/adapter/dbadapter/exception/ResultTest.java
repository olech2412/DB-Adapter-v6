package de.olech2412.adapter.dbadapter.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void successShouldReturnResultWithSuccessTrueAndData() {
        String data = "Success Data";
        Result<String, String> result = Result.success(data);

        assertTrue(result.isSuccess());
        assertEquals(data, result.getData());
        assertNull(result.getError());
    }

    @Test
    void errorShouldReturnResultWithSuccessFalseAndError() {
        String error = "Error Data";
        Result<String, String> result = Result.error(error);

        assertFalse(result.isSuccess());
        assertEquals(error, result.getError());
        assertNull(result.getData());
    }

    @Test
    void toStringShouldReturnCorrectFormat() {
        String data = "Success Data";
        Result<String, String> result = Result.success(data);

        String expected = "Result{success=true, data=Success Data, error=null}";
        assertEquals(expected, result.toString());
    }
}