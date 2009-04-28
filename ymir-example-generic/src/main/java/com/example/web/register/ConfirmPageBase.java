package com.example.web.register;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.response.PassthroughResponse;

public class ConfirmPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.register";

    public static final String NAME = "confirm";

    public static final String PATH = "/register/confirm.html";

    public static final String A_post_back = "_post_back";

    public static final String A_post_complete = "_post_complete";

    public static final String A_get = "_get";

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/register/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_back() {
        return new PassthroughResponse();
    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/register/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_complete() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/register/confirm.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/register/confirm.html")
    public void _prerender() {

    }
}
