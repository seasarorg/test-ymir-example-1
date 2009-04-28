package com.example.web.register;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.conversation.annotation.End;

public class CompletePageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.register";

    public static final String NAME = "complete";

    public static final String PATH = "/register/complete.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = "/register/complete.html")
    @End
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/register/complete.html")
    public void _prerender() {

    }
}
