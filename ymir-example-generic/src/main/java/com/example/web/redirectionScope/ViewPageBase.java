package com.example.web.redirectionScope;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

public class ViewPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.redirectionScope";

    public static final String NAME = "view";

    public static final String PATH = "/redirectionScope/view.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/redirectionScope/view.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/redirectionScope/view.html")
    public void _prerender() {

    }
}
