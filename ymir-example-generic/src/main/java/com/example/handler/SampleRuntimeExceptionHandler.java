package com.example.handler;

import org.seasar.ymir.handler.annotation.ExceptionHandler;
import org.seasar.ymir.scope.annotation.Inject;

import com.example.web.exceptionHandler.IndexPage;

public class SampleRuntimeExceptionHandler {
    private IndexPage page;

    @Inject
    public void setPage(IndexPage page) {
        this.page = page;
    }

    @ExceptionHandler
    public void handle() {
        page.setMessage("グローバルハンドラで例外を処理しました。");
    }
}
