package de.olech2412.adapter.dbadapter.exception;

public class Result<T, X> {

    private final boolean success;
    private final T data;
    private final X error;

    private Result(boolean success, T data, X error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }

    public static <T, X> Result<T, X> success(T data) {
        return new Result<>(true, data, null);
    }

    public static <T, X> Result<T, X> error(X error) {
        return new Result<>(false, null, error);
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public X getError() {
        return error;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", data=" + data +
                ", error=" + error +
                '}';
    }
}