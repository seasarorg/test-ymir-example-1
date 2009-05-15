package com.example.web.register;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.conversation.annotation.End;
import org.seasar.ymir.id.action.GetAction;

public class CompletePageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.register";

    public static final String NAME = "complete";

    public static final String PATH = "/register/complete.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/register/complete.html")
    @End
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/register/complete.html")
    public void _prerender() {

    }
}
