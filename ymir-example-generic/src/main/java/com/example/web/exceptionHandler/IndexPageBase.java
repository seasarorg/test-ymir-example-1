package com.example.web.exceptionHandler;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.exceptionHandler";

    public static final String NAME = "index";

    public static final String PATH = "/exceptionHandler/index.html";

    public static final String P_message = "message";

    @Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    protected String message;

    @Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    public String getMessage() {
        return this.message;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    public void _get() {

    }

    public static interface _post_global extends PostAction {
        public static final String NAME = "_post_global";

        public static final String KEY = "global";

        public static final Class<? extends PostAction> method = _post_global.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_global() {
        return new PassthroughResponse();
    }

    public static interface _post_localAnyAction extends PostAction {
        public static final String NAME = "_post_localAnyAction";

        public static final String KEY = "localAnyAction";

        public static final Class<? extends PostAction> method = _post_localAnyAction.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_localAnyAction() {
        return new PassthroughResponse();
    }

    public static interface _post_localParticularAction extends PostAction {
        public static final String NAME = "_post_localParticularAction";

        public static final String KEY = "localParticularAction";

        public static final Class<? extends PostAction> method = _post_localParticularAction.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/exceptionHandler/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_localParticularAction() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/exceptionHandler/index.html")
    public void _prerender() {

    }
}
