package com.example.web;

public class IndexPageBase extends com.example.web.PageBase {
    public static final String PACKAGE = "com.example.web";

    public static final String NAME = "index";

    public static final String PATH = "/index.html";

    public static final String A_get = "_get";

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = {"/exceptionHandler/index.html", "/aaa/index.html", "/ncheckbox/index.html", "/checkbox/index.html"})
    public void _get() {

    }

    public void _prerender() {

    }
}
