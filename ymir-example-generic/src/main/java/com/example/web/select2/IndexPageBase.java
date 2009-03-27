package com.example.web.select2;

public class IndexPageBase extends com.example.web.PageBase {
    public static final String PACKAGE = "com.example.web.select2";

    public static final String NAME = "index";

    public static final String PATH = "/select2/index.html";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_fruitsSelect = "fruitsSelect";

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    protected com.example.dto.select2.ViewDto view = new com.example.dto.select2.ViewDto();

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "property", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")})
    protected com.example.dto.select2.FormDto form = new com.example.dto.select2.FormDto();

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    public com.example.dto.select2.ViewDto getView() {
        return this.view;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    public com.example.dto.select2.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public net.skirnir.freyja.render.html.Select getFruitsSelect() {
        return this.form.getFruitsSelect();
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    public void _prerender() {

    }
}
