package com.example.web.function;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.function";

    public static final String NAME = "index";

    public static final String PATH = "/function/index.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/function/index.html", "/index.html"})
    public void _prerender() {

    }
}
