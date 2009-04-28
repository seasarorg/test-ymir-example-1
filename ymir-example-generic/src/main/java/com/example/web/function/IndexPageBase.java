package com.example.web.function;

import org.seasar.ymir.annotation.Meta;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.function";

    public static final String NAME = "index";

    public static final String PATH = "/function/index.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/function/index.html")
    public void _prerender() {

    }
}
