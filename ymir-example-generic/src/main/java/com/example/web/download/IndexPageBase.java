package com.example.web.download;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.download";

    public static final String NAME = "index";

    public static final String PATH = "/download/index.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/download/index.html", "/index.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/download/index.html", "/index.html"})
    public void _prerender() {

    }
}
