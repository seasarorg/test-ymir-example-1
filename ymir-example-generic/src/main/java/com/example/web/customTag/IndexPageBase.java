package com.example.web.customTag;

import org.seasar.ymir.annotation.Meta;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.customTag";

    public static final String NAME = "index";

    public static final String PATH = "/customTag/index.html";

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/customTag/index.html", "/index.html"})
    public void _prerender() {

    }
}
