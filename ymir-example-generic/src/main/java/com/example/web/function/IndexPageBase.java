package com.example.web.function;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.function";

    public static final String NAME = "index";

    public static final String PATH = "/function/index.html";

    public static final String A_get = "_get";

    public static final String A_post = "_post";

    @Meta(name = "bornOf", value = "/update/input.html")
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
