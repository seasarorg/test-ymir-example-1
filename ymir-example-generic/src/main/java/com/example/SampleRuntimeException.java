package com.example;

public class SampleRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public SampleRuntimeException() {
    }

    public SampleRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SampleRuntimeException(String message) {
        super(message);
    }

    public SampleRuntimeException(Throwable cause) {
        super(cause);
    }
}
