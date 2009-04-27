package com.example.web.exceptionHandler;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.exceptionHandler";

    public static final String NAME = "index";

    public static final String PATH = "/exceptionHandler/index.html";

    public static final String A_get = "_get";

    public static final String A_post_global = "_post_global";

    public static final String A_post_localAnyAction = "_post_localAnyAction";

    public static final String A_post_localParticularAction = "_post_localParticularAction";

    public static final String A_post = "_post";

    public static final String P_message = "message";

    @Meta(name = "bornOf", value = {"/exceptionHandler/index.html", "/update/input.html"})
    protected String message;

    @Meta(name = "bornOf", value = {"/exceptionHandler/index.html", "/update/input.html"})
    public String getMessage() {
        return this.message;
    }

    @Meta(name = "bornOf", value = {"/exceptionHandler/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/exceptionHandler/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post_global() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Metas({@Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post_localAnyAction() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Metas({@Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post_localParticularAction() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
