package com.example.web.exceptionHandler;

public class IndexPageBase extends com.example.web.PageBase {
    public static final String PACKAGE = "com.example.web.exceptionHandler";

    public static final String NAME = "index";

    public static final String PATH = "/exceptionHandler/index.html";

    public static final String A_post_localParticularAction = "_post_localParticularAction";

    public static final String A_post_localAnyAction = "_post_localAnyAction";

    public static final String A_post_global = "_post_global";

    public static final String A_get = "_get";

    public static final String P_message = "message";

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    protected String message;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    public String getMessage() {
        return this.message;
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @org.seasar.ymir.annotation.Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public org.seasar.ymir.Response _post_localParticularAction() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @org.seasar.ymir.annotation.Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public org.seasar.ymir.Response _post_localAnyAction() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @org.seasar.ymir.annotation.Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public org.seasar.ymir.Response _post_global() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    public void _prerender() {

    }
}
