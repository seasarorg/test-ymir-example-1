package com.example.web.requestHeader;

import org.seasar.ymir.annotation.Meta;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.requestHeader";

    public static final String NAME = "index";

    public static final String PATH = "/requestHeader/index.html";

    public static final String P_userAgent = "userAgent";

    @Meta(name = "bornOf", value = "/requestHeader/index.html")
    protected String userAgent;

    @Meta(name = "bornOf", value = "/requestHeader/index.html")
    public String getUserAgent() {
        return this.userAgent;
    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/requestHeader/index.html")
    public void _prerender() {

    }
}
