package com.example.web.mailsender;

import org.seasar.ymir.annotation.Meta;

import com.example.web.PageBase;

public class SentPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.mailsender";

    public static final String NAME = "sent";

    public static final String PATH = "/mailsender/sent.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = "/mailsender/sent.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/mailsender/sent.html")
    public void _prerender() {

    }
}
