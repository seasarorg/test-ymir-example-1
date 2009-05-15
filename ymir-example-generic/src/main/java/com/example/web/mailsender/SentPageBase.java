package com.example.web.mailsender;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

import com.example.web.PageBase;

public class SentPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.mailsender";

    public static final String NAME = "sent";

    public static final String PATH = "/mailsender/sent.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/mailsender/sent.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/mailsender/sent.html")
    public void _prerender() {

    }
}
