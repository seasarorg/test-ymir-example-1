package com.example.web.register;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

public class InputPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.register";

    public static final String NAME = "input";

    public static final String PATH = "/register/input.html";

    public static final String A_get = "_get";

    public static final String P_furigana = "furigana";

    public static final String P_name = "name";

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/register/input.html")})
    public String getFurigana() {
        return this.form.getFurigana();
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/register/input.html")})
    @RequestParameter
    public void setFurigana(String furigana) {
        this.form.setFurigana(furigana);
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/register/input.html")})
    public String getName() {
        return this.form.getName();
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/register/input.html")})
    @RequestParameter
    public void setName(String name) {
        this.form.setName(name);
    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/register/input.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_confirm() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/register/input.html")
    public void _prerender() {

    }
}
