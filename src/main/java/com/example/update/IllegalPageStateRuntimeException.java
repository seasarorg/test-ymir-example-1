package com.example.update;

public class IllegalPageStateRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public IllegalPageStateRuntimeException() {
    }

    public IllegalPageStateRuntimeException(String message) {
        super(message);
    }
}
