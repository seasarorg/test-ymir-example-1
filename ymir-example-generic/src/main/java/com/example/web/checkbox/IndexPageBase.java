package com.example.web.checkbox;

public class IndexPageBase extends com.example.web.PageBase {
    public static final String PACKAGE = "com.example.web.checkbox";

    public static final String NAME = "index";

    public static final String PATH = "/checkbox/index.html";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_fruits = "fruits";

    public static final String P_fruitsCheckboxInputTags = "fruitsCheckboxInputTags";

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")
    protected com.example.dto.checkbox.ViewDto view = new com.example.dto.checkbox.ViewDto();

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "property", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")})
    protected com.example.dto.checkbox.FormDto form = new com.example.dto.checkbox.FormDto();

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")
    public com.example.dto.checkbox.ViewDto getView() {
        return this.view;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")
    public com.example.dto.checkbox.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    public String[] getFruits() {
        return this.form.getFruits();
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    @org.seasar.ymir.scope.annotation.RequestParameter
    public void setFruits(String[] fruits) {
        this.form.setFruits(fruits);
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public net.skirnir.freyja.render.html.CheckboxInputTags getFruitsCheckboxInputTags() {
        return this.form.getFruitsCheckboxInputTags();
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")
    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")
    public void _prerender() {

    }
}
