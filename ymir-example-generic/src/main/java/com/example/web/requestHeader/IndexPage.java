package com.example.web.requestHeader;

import org.seasar.ymir.scope.annotation.In;
import org.seasar.ymir.scope.impl.RequestHeaderScope;

public class IndexPage extends IndexPageBase {
    /**
     * Inアノテーションのname属性に取得したいリクエストヘッダ名を指定し、
     * scopeClass属性にRequestHeaderScopeクラスを指定することで、
     * リクエストヘッダを取得することができます。
     * なお同一ヘッダに複数の値がある場合、引数の型を配列型にすることで全ての値を取得することができます。
     */
    @In(name = "User-Agent", scopeClass = RequestHeaderScope.class)
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
