package com.example.web.edit;

import org.seasar.ymir.annotation.Meta;

public class CompletePageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.edit";

    public static final String NAME = "complete";

    public static final String PATH = "/edit/complete.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = "/edit/complete.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/edit/complete.html")
    public void _prerender() {

    }
}
