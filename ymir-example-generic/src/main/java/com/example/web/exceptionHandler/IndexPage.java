package com.example.web.exceptionHandler;

import org.seasar.ymir.Response;
import org.seasar.ymir.handler.annotation.ExceptionHandler;

import com.example.SampleRuntimeException;

public class IndexPage extends IndexPageBase {
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Response _post_localParticularAction() {
        throw new SampleRuntimeException();
    }

    @Override
    public Response _post_localAnyAction() {
        throw new SampleRuntimeException();
    }

    @Override
    public Response _post_global() {
        throw new SampleRuntimeException();
    }

    /**
     * _post_localParticularActionアクション用のSampleRuntimeExceptionのハンドラメソッドです。
     * 
     * @param ex
     */
    @ExceptionHandler(actionName = "_post_localParticularAction")
    public void handleLocalParticularAction(SampleRuntimeException ex) {
        message = "特定アクション用のローカルハンドラで例外を処理しました。";
    }

    /**
     * アクション共通のSampleRuntimeExceptionのハンドラメソッドです。
     * 
     * @param ex
     */
    @ExceptionHandler
    public void handleLocalAnyAction(SampleRuntimeException ex) {
        message = "アクション共通のローカルハンドラで例外を処理しました。";
    }

    /**
     * _post_globalアクション用のSampleRuntimeExceptionのハンドラメソッドです。
     * 
     * @param ex
     */
    @ExceptionHandler(actionName = "_post_global")
    public void handleGlobal(SampleRuntimeException ex) {
        // ローカルハンドラ内でスローされた例外はグローバルハンドラで処理されます。
        // グローバルハンドラクラスはcom.example.handler.SampleRuntimeExceptionHandlerです。
        throw new SampleRuntimeException();
    }

}
