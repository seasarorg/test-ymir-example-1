package com.example.web.session;

import javax.servlet.http.HttpServletRequest;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;
import org.seasar.ymir.scope.annotation.Inject;

public class IndexPage extends IndexPageBase {
    private HttpServletRequest request;

    @Inject
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Invoke(Phase.OBJECT_INJECTED)
    public void initialize() {
        // セッションIDがURLに付与されるよう、セッションを生成しておきます。
        request.getSession();
    }
}
