package com.example.web.register;

public class InputPageBase extends com.example.web.register.PageBase {

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public String getFurigana() {
        return this.form.getFurigana();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setFurigana(String furigana) {
        this.form.setFurigana(furigana);
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public String getName() {
        return this.form.getName();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setName(String name) {
        this.form.setName(name);
    }

    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"throw ex;","ex"})
    public void _permissionDenied(org.seasar.ymir.constraint.PermissionDeniedException ex)
        throws org.seasar.ymir.constraint.PermissionDeniedException {
        throw ex;
    }

    @org.seasar.ymir.annotation.Meta(name="source",value="return new org.seasar.ymir.response.PassthroughResponse();")
    public org.seasar.ymir.Response _post_confirm() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    public void _prerender() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"","notes"})
    public void _validationFailed(org.seasar.ymir.message.Notes notes) {
        
    }
}
