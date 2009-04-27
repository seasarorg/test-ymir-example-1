package com.example.web.customTag;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.customTag";

    public static final String NAME = "index";

    public static final String PATH = "/customTag/index.html";

    public static final String A_post = "_post";

    @Meta(name = "bornOf", value = {"/customTag/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/customTag/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
