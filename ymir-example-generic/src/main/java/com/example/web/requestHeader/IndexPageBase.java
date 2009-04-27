package com.example.web.requestHeader;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.requestHeader";

    public static final String NAME = "index";

    public static final String PATH = "/requestHeader/index.html";

    public static final String A_post = "_post";

    public static final String P_userAgent = "userAgent";

    @Meta(name = "bornOf", value = "/update/input.html")
    protected String userAgent;

    @Meta(name = "bornOf", value = "/update/input.html")
    public String getUserAgent() {
        return this.userAgent;
    }

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
