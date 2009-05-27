package com.example.web.timeout;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;

public class LogoutPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.timeout";

    public static final String NAME = "logout";

    public static final String PATH = "/timeout/logout.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Metas({@Meta(name = "bornOf", value = {"/timeout/logined.html", "/timeout/logout.html"}), @Meta(name = "source", value = "return \"redirect:index.html\";")})
    public String _get() {
        return "redirect:index.html";
    }

    @Meta(name = "bornOf", value = "/timeout/logined.html")
    public void _prerender() {

    }
}
