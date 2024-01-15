package de.olech2412.adapter.dbadapter.exception.api;

import de.olech2412.adapter.dbadapter.exception.Error;

public class ApiError implements Error {

    private final String message;

    private final int code;

    public ApiError(String message, int code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getError() {
        return String.format("%s: %s", getCode(), getMessage());
    }
}
