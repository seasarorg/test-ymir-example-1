package com.example.web.register;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

public class ConfirmPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.register";

    public static final String NAME = "confirm";

    public static final String PATH = "/register/confirm.html";

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/register/confirm.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post_back() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/register/confirm.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post_complete() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/register/confirm.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/register/confirm.html")
    public void _prerender() {

    }
}
