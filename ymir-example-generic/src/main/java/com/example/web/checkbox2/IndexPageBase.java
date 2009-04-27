package com.example.web.checkbox2;

public class IndexPageBase extends com.example.web.PageBase {
    public static final String PACKAGE = "com.example.web.checkbox2";

    public static final String NAME = "index";

    public static final String PATH = "/checkbox2/index.html";

    public static final String A_get = "_get";

    public static final String P_smokingInput = "smokingInput";

    public static final String P_drinkingInput = "drinkingInput";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_gamblingInput = "gamblingInput";

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected com.example.dto.checkbox2.ViewDto view = new com.example.dto.checkbox2.ViewDto();

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "property", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")})
    protected com.example.dto.checkbox2.FormDto form = new com.example.dto.checkbox2.FormDto();

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public net.skirnir.freyja.render.html.Input getSmokingInput() {
        return this.form.getSmokingInput();
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public net.skirnir.freyja.render.html.Input getDrinkingInput() {
        return this.form.getDrinkingInput();
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    public com.example.dto.checkbox2.ViewDto getView() {
        return this.view;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    public com.example.dto.checkbox2.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public net.skirnir.freyja.render.html.Input getGamblingInput() {
        return this.form.getGamblingInput();
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    public void _prerender() {

    }
}
