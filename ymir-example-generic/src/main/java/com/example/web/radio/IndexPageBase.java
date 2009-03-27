package com.example.web.radio;

public class IndexPageBase extends com.example.web.PageBase {
    public static final String PACKAGE = "com.example.web.radio";

    public static final String NAME = "index";

    public static final String PATH = "/radio/index.html";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_fruitsRadio = "fruitsRadio";

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/radio/index.html")
    protected com.example.dto.radio.ViewDto view = new com.example.dto.radio.ViewDto();

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "property", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/radio/index.html")})
    protected com.example.dto.radio.FormDto form = new com.example.dto.radio.FormDto();

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/radio/index.html")
    public com.example.dto.radio.ViewDto getView() {
        return this.view;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/radio/index.html")
    public com.example.dto.radio.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/radio/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public net.skirnir.freyja.render.html.Radio getFruitsRadio() {
        return this.form.getFruitsRadio();
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/radio/index.html")
    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/radio/index.html")
    public void _prerender() {

    }
}
