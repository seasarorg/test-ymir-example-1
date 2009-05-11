package com.example.web.download;

import org.seasar.ymir.annotation.Meta;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.download";

    public static final String NAME = "index";

    public static final String PATH = "/download/index.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = {"/download/index.html", "/index.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/download/index.html")
    public void _prerender() {

    }
}
