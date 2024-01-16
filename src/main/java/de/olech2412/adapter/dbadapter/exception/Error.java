package de.olech2412.adapter.dbadapter.exception;

/**
 * This class represents an general error and can be implemented by other classes
 *
 * @since 0.0.1
 */
public interface Error {

    String getMessage();

    int getCode();

    default String getError() {
        return String.format("%s: %s", getCode(), getMessage());
    }

}
