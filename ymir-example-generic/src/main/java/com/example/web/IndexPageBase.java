package com.example.web;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web";

    public static final String NAME = "index";

    public static final String PATH = "/index.html";

    public static final String A_get = "_get";

    public static final String A_post = "_post";

    @Meta(name = "bornOf", value = {"/exceptionHandler/index.html", "/aaa/index.html", "/ncheckbox/index.html", "/radio/index.html", "/select2/index.html", "/list3/index.html", "/list4/index.html", "/list2/index.html", "/mailsender/index.html", "/checkbox3/index.html", "/customTag/index.html", "/checkbox/index.html", "/checkbox2/index.html", "/select/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
