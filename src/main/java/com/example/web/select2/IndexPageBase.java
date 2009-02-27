package com.example.web.select2;

public class IndexPageBase extends com.example.web.PageBase {
    @org.seasar.ymir.annotation.Meta(name="property",value="form")
    protected com.example.dto.select2.FormDto form = new com.example.dto.select2.FormDto();

    protected com.example.dto.select2.ViewDto view = new com.example.dto.select2.ViewDto();


    public com.example.dto.select2.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public String[] getFruits() {
        return this.form.getFruits();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setFruits(String[] fruits) {
        this.form.setFruits(fruits);
    }

    public com.example.dto.select2.ViewDto getView() {
        return this.view;
    }

    public void _get() {

    }

    public void _prerender() {

    }
}
