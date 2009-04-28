package com.example.web.session;

import org.seasar.ymir.annotation.Meta;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.session";

    public static final String NAME = "index";

    public static final String PATH = "/session/index.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = "/session/index.html")
    public void _prerender() {

    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }
}
