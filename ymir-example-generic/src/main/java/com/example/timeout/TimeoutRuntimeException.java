package com.example.timeout;

public class TimeoutRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TimeoutRuntimeException() {
    }

    public TimeoutRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeoutRuntimeException(String message) {
        super(message);
    }

    public TimeoutRuntimeException(Throwable cause) {
        super(cause);
    }
}
