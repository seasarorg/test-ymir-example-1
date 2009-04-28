package com.example.web.update;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.conversation.annotation.End;

public class CompletePageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.update";

    public static final String NAME = "complete";

    public static final String PATH = "/update/complete.html";

    public static final String A_get = "_get";

    @Meta(name = "bornOf", value = "/update/complete.html")
    @End
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/update/complete.html")
    public void _prerender() {

    }
}
