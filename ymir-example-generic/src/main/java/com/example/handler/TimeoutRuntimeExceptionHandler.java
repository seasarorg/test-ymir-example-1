package com.example.handler;

import org.seasar.ymir.Response;
import org.seasar.ymir.handler.annotation.ExceptionHandler;

import com.example.ymir.util.Forward;

public class TimeoutRuntimeExceptionHandler {
    @ExceptionHandler
    public Response handle() {
        return Forward.to("/WEB-INF/html/error/error.html");
    }

    public String getMessage() {
        return "タイムアウトしました。";
    }
}
