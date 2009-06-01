package com.example.web;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web";

    public static final String NAME = "index";

    public static final String PATH = "/index.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/aaa/index.html", "/checkbox/index.html", "/checkbox2/index.html", "/download/index.html", "/edit/complete.html", "/edit/index.html", "/edit/input2.html", "/exceptionHandler/index.html", "/includedForm/index.html", "/list3/index.html", "/list4/index.html", "/ncheckbox/index.html", "/radio/index.html", "/select/index.html", "/select2/index.html", "/timeout/index.html", "/timeout/logined.html", "/update/input.html", "/upload/index.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/checkbox/index.html", "/edit/complete.html", "/edit/index.html", "/edit/input2.html", "/includedForm/index.html", "/index.html", "/timeout/index.html", "/timeout/logined.html", "/update/input.html", "/upload/index.html"})
    public void _prerender() {

    }
}
