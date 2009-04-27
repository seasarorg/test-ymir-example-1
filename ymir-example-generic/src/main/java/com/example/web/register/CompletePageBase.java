package com.example.web.register;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

public class CompletePageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.register";

    public static final String NAME = "complete";

    public static final String PATH = "/register/complete.html";

    public static final String A_post = "_post";

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
