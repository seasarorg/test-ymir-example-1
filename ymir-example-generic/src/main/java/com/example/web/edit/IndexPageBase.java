package com.example.web.edit;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.scope.annotation.RequestParameter;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.edit";

    public static final String NAME = "index";

    public static final String PATH = "/edit/index.html";

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/input.html", "/edit/input2.html"})
    public static final String P_id = "id";

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/input.html", "/edit/input2.html"})
    protected Integer id;

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/input.html", "/edit/input2.html"})
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/input.html", "/edit/input2.html"})
    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/index.html", "/edit/input.html", "/edit/input2.html", "/index.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/index.html", "/edit/input.html", "/edit/input2.html", "/index.html"})
    public void _prerender() {

    }
}
