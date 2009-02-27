package com.example.web.checkbox2;

public class IndexPageBase extends com.example.web.PageBase {
    @org.seasar.ymir.annotation.Meta(name="property",value="form")
    protected com.example.dto.checkbox2.FormDto form = new com.example.dto.checkbox2.FormDto();

    protected com.example.dto.checkbox2.ViewDto view = new com.example.dto.checkbox2.ViewDto();


    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public boolean isDrinking() {
        return this.form.isDrinking();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setDrinking(boolean drinking) {
        this.form.setDrinking(drinking);
    }

    public com.example.dto.checkbox2.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public boolean isGambling() {
        return this.form.isGambling();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setGambling(boolean gambling) {
        this.form.setGambling(gambling);
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public boolean isSmoking() {
        return this.form.isSmoking();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setSmoking(boolean smoking) {
        this.form.setSmoking(smoking);
    }

    public com.example.dto.checkbox2.ViewDto getView() {
        return this.view;
    }

    public void _get() {

    }

    public void _prerender() {

    }
}
