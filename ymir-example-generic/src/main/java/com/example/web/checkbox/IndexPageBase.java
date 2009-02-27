package com.example.web.checkbox;

public class IndexPageBase extends com.example.web.PageBase {
    protected com.example.dto.checkbox.ViewDto view = new com.example.dto.checkbox.ViewDto();

    @org.seasar.ymir.annotation.Meta(name = "property", value = "form")
    protected com.example.dto.checkbox.FormDto form = new com.example.dto.checkbox.FormDto();


    public com.example.dto.checkbox.ViewDto getView() {
        return this.view;
    }

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

    public void _get() {

    }

    public void _prerender() {

    }
}
