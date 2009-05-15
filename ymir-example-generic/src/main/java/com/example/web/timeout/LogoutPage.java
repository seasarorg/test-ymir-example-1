package com.example.web.timeout;

import org.seasar.ymir.session.annotation.InvalidateSession;

public class LogoutPage extends LogoutPageBase {
    @Override
    @InvalidateSession
    public String _get() {
        // @InvalidationSessionアノテーションによってセッションを破棄します。
        return super._get();
    }
}
