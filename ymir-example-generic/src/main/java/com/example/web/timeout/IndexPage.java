package com.example.web.timeout;

import javax.servlet.http.HttpServletRequest;

import org.seasar.ymir.Response;
import org.seasar.ymir.scope.annotation.Inject;
import org.seasar.ymir.session.SessionManager;

import com.example.ymir.util.Redirect;

public class IndexPage extends IndexPageBase {
    private SessionManager sessionManager;

    // ログイン画面については、タイムアウトしてもエラーにせずそのままログイン画面を
    // 表示させたほうが親切と言えます。
    // そのため、LoginPageではcheckTimeoutメソッドをオーバライドして
    // 何もしないようにしています。
    @Override
    public void checkTimeout(HttpServletRequest request) {
    }

    @Inject
    public void setSessionManager(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public Response _post_login() {
        // セッションを開始します。
        sessionManager.getSession();

        return Redirect.to(LoginedPage.class);
    }
}
