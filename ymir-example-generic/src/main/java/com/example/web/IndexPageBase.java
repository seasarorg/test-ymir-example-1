package com.example.web;

import org.seasar.ymir.annotation.Meta;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web";

    public static final String NAME = "index";

    public static final String PATH = "/index.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = {"/exceptionHandler/index.html", "/aaa/index.html", "/ncheckbox/index.html", "/checkbox/index.html", "/checkbox2/index.html", "/radio/index.html", "/select/index.html", "/select2/index.html", "/list3/index.html", "/list4/index.html"})
    public void _get() {

    }

    public void _prerender() {

    }
}
