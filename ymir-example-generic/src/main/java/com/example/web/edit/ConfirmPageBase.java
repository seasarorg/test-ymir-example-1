package com.example.web.edit;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.Inject;

import com.example.converter.edit.FormConverter;

public class ConfirmPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.edit";

    public static final String NAME = "confirm";

    public static final String PATH = "/edit/confirm.html";

    protected FormConverter formConverter;

    @Inject
    public void setFormConverter(FormConverter formConverter) {
        this.formConverter = formConverter;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/edit/confirm.html")
    public void _get() {

    }

    public static interface _post_next extends PostAction {
        public static final String NAME = "_post_next";

        public static final String KEY = "next";

        public static final Class<? extends PostAction> method = _post_next.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/edit/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_next() {
        return new PassthroughResponse();
    }

    public static interface _post_previous extends PostAction {
        public static final String NAME = "_post_previous";

        public static final String KEY = "previous";

        public static final Class<? extends PostAction> method = _post_previous.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/edit/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_previous() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/edit/confirm.html")
    public void _prerender() {

    }
}
