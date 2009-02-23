package com.example.web.checkbox3;

@SuppressWarnings("unchecked")
public class IndexPageBase extends com.example.web.PageBase {
    @org.seasar.ymir.annotation.Meta(name="property",value="form")
    protected com.example.dto.checkbox3.FormDto form = new com.example.dto.checkbox3.FormDto();


    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public boolean isDrinking() {
        return this.form.isDrinking();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setDrinking(boolean drinking) {
        this.form.setDrinking(drinking);
    }

    public com.example.dto.checkbox3.FormDto getForm() {
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

    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"throw ex;","ex"})
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
