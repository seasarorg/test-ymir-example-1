package com.example.web.timeout;

import javax.servlet.http.HttpServletRequest;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;
import org.seasar.ymir.scope.annotation.Inject;

import com.example.timeout.TimeoutRuntimeException;

public class PageBase extends com.example.web.PageBase {
    @Invoke(Phase.PAGECOMPONENT_CREATED)
    public void checkTimeout(@Inject
    HttpServletRequest request) {
        if (request.getRequestedSessionId() != null
                && request.getSession(false) == null) {
            // セッションIDがリクエストに付与されているのにセッションが存在しないので、
            // タイムアウトしたとみなします。
            throw new TimeoutRuntimeException();
        }
    }
}
