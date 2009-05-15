package com.example.web.timeout;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

public class LoginedPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.timeout";

    public static final String NAME = "logined";

    public static final String PATH = "/timeout/logined.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/timeout/index.html", "/timeout/logined.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/timeout/index.html", "/timeout/logined.html"})
    public void _prerender() {

    }
}
