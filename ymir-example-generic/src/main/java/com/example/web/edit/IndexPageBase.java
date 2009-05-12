package com.example.web.edit;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.scope.annotation.RequestParameter;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.edit";

    public static final String NAME = "index";

    public static final String PATH = "/edit/index.html";

    public static final String A_get = "_get";

    public static final String P_id = "id";

    @Meta(name = "bornOf", value = "/edit/complete.html")
    protected String id;

    @Meta(name = "bornOf", value = "/edit/complete.html")
    public String getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/edit/complete.html")
    @RequestParameter
    public void setId(String id) {
        this.id = id;
    }

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/index.html", "/edit/input.html", "/index.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/edit/complete.html", "/edit/confirm.html", "/edit/index.html", "/edit/input.html", "/index.html"})
    public void _prerender() {

    }
}
