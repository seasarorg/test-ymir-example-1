package com.example.web.checkbox2;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.render.html.Input;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.checkbox2.FormDto;
import com.example.dto.checkbox2.ViewDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.checkbox2";

    public static final String NAME = "index";

    public static final String PATH = "/checkbox2/index.html";

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public static final String P_drinkingInput$value = "drinkingInput.value";

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public static final String P_gamblingInput$value = "gamblingInput.value";

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public static final String P_smokingInput$value = "smokingInput.value";

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/checkbox2/index.html")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected ViewDto view = new ViewDto();

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox2/index.html")})
    @RequestParameter
    public Input getDrinkingInput() {
        return this.form.getDrinkingInput();
    }

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox2/index.html")})
    @RequestParameter
    public Input getGamblingInput() {
        return this.form.getGamblingInput();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox2/index.html")})
    @RequestParameter
    public Input getSmokingInput() {
        return this.form.getSmokingInput();
    }

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public ViewDto getView() {
        return this.view;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/index.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/index.html"})
    public void _prerender() {

    }
}
