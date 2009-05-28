package com.example.web.update;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

public class InputPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.update";

    public static final String NAME = "input";

    public static final String PATH = "/update/input.html";

    @Meta(name = "bornOf", value = "/update/input.html")
    public static final String P_furigana = "furigana";

    @Meta(name = "bornOf", value = "/index.html")
    public static final String P_id = "id";

    @Meta(name = "bornOf", value = "/update/input.html")
    public static final String P_name = "name";

    @Meta(name = "bornOf", value = "/index.html")
    protected Integer id;

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "formProperty", value = "form")})
    public String getFurigana() {
        return this.form.getFurigana();
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public void setFurigana(String furigana) {
        this.form.setFurigana(furigana);
    }

    @Meta(name = "bornOf", value = "/index.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/index.html")
    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "formProperty", value = "form")})
    public String getName() {
        return this.form.getName();
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public void setName(String name) {
        this.form.setName(name);
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/index.html", "/update/input.html"})
    public void _get() {

    }

    public static interface _get_retry extends GetAction {
        public static final String NAME = "_get_retry";

        public static final String KEY = "retry";

        public static final Class<? extends GetAction> method = _get_retry.class;
    }

    @Meta(name = "bornOf", value = "request:/update/input.html")
    public void _get_retry() {

    }

    public static interface _post_confirm extends PostAction {
        public static final String NAME = "_post_confirm";

        public static final String KEY = "confirm";

        public static final Class<? extends PostAction> method = _post_confirm.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_confirm() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void _prerender() {

    }
}
