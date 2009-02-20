package com.example.web.list2;

public class IndexPageBase extends com.example.web.list2.PageBase {
    @org.seasar.ymir.annotation.Meta(name="property",value="form")
    protected com.example.dto.list2.FormDto form = new com.example.dto.list2.FormDto();

    protected com.example.dto.list2.ViewDto view = new com.example.dto.list2.ViewDto();


    public com.example.dto.list2.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public java.util.List<com.example.dto.list2.EntryDto> getEntries() {
        return this.form.getEntries();
    }

    public com.example.dto.list2.ViewDto getView() {
        return this.view;
    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"return new org.seasar.ymir.response.PassthroughResponse();","index"})
    public org.seasar.ymir.Response _post_update(int index) {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    public void _prerender() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"","notes"})
    public void _validationFailed(org.seasar.ymir.message.Notes notes) {
        
    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"throw ex;","ex"})
    @org.seasar.ymir.conversation.annotation.Begin(alwaysBegin=true)
    public void _permissionDenied(org.seasar.ymir.constraint.PermissionDeniedException ex)
        throws org.seasar.ymir.constraint.PermissionDeniedException {
        throw ex;
    }

    public void _get() {

    }
}
