package com.example.web.update;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

public class ConfirmPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.update";

    public static final String NAME = "confirm";

    public static final String PATH = "/update/confirm.html";

    public static final String A_post = "_post";

    @Meta(name = "bornOf", value = "/update/input.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void _prerender() {

    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    public Response _post_back() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    public Response _post_complete() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
