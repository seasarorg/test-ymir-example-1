package com.example.web.register;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;

public class ConfirmPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.register";

    public static final String NAME = "confirm";

    public static final String PATH = "/register/confirm.html";

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/register/confirm.html")
    public void _get() {

    }

    public static interface _post_back extends PostAction {
        public static final String NAME = "_post_back";

        public static final String KEY = "back";

        public static final Class<? extends PostAction> method = _post_back.class;
    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/register/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_back() {
        return new PassthroughResponse();
    }

    public static interface _post_complete extends PostAction {
        public static final String NAME = "_post_complete";

        public static final String KEY = "complete";

        public static final Class<? extends PostAction> method = _post_complete.class;
    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/register/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_complete() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/register/confirm.html")
    public void _prerender() {

    }
}
