package com.example.web.timeout;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.timeout";

    public static final String NAME = "index";

    public static final String PATH = "/timeout/index.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/timeout/index.html")
    public void _get() {

    }

    public static interface _post_login extends PostAction {
        public static final String NAME = "_post_login";

        public static final String KEY = "login";

        public static final Class<? extends PostAction> method = _post_login.class;
    }

    @Metas( {
            @Meta(name = "bornOf", value = "/timeout/index.html"),
            @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class) })
    public Response _post_login() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/timeout/index.html")
    public void _prerender() {

    }
}
