package com.example.web.edit;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

public class CompletePageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.edit";

    public static final String NAME = "complete";

    public static final String PATH = "/edit/complete.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/edit/complete.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/edit/complete.html")
    public void _prerender() {

    }
}
