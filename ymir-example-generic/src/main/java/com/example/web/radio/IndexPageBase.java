package com.example.web.radio;

@SuppressWarnings("unchecked")
public class IndexPageBase extends com.example.web.PageBase {
    @org.seasar.ymir.annotation.Meta(name="property",value="form")
    protected com.example.dto.radio.FormDto form = new com.example.dto.radio.FormDto();

    protected com.example.dto.radio.ViewDto view = new com.example.dto.radio.ViewDto();


    public com.example.dto.radio.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public String getFruits() {
        return this.form.getFruits();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setFruits(String fruits) {
        this.form.setFruits(fruits);
    }

    public com.example.dto.radio.ViewDto getView() {
        return this.view;
    }

    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"throw ex;","ex"})
    @org.seasar.ymir.conversation.annotation.Begin(alwaysBegin=true)
    public void _permissionDenied(org.seasar.ymir.constraint.PermissionDeniedException ex)
        throws org.seasar.ymir.constraint.PermissionDeniedException {
        throw ex;
    }

    public void _prerender() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"","notes"})
    public void _validationFailed(org.seasar.ymir.message.Notes notes) {
        
    }
}
