package com.example.web.update;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

public class InputPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.update";

    public static final String NAME = "input";

    public static final String PATH = "/update/input.html";

    public static final String A_post = "_post";

    public static final String P_id = "id";

    public static final String P_name = "name";

    public static final String P_furigana = "furigana";

    @Meta(name = "bornOf", value = "/update/input.html")
    protected Integer id;

    @Meta(name = "bornOf", value = "/update/input.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    public String getName() {
        return this.form.getName();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    @RequestParameter
    public void setName(String name) {
        this.form.setName(name);
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    public String getFurigana() {
        return this.form.getFurigana();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    @RequestParameter
    public void setFurigana(String furigana) {
        this.form.setFurigana(furigana);
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void _prerender() {

    }

    public void _get() {

    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    public Response _post_confirm() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
