package de.olech2412.adapter.dbadapter.exception;

public interface Error {

    String getMessage();

    int getCode();

    default String getError() {
        return String.format("%s: %s", getCode(), getMessage());
    }

}
