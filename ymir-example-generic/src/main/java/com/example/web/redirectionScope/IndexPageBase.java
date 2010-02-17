package com.example.web.redirectionScope;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.redirectionScope";

    public static final String NAME = "index";

    public static final String PATH = "/redirectionScope/index.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/redirectionScope/index.html")
    public void _get() {

    }

    public static interface _post extends PostAction {
        public static final String NAME = "_post";

        public static final String KEY = "";

        public static final Class<? extends PostAction> method = _post.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/redirectionScope/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/redirectionScope/index.html")
    public void _prerender() {

    }
}
