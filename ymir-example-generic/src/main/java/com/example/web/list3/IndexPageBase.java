package com.example.web.list3;

public class IndexPageBase extends com.example.web.list3.PageBase {
    protected com.example.dto.list3.ViewDto view = new com.example.dto.list3.ViewDto();

    @org.seasar.ymir.annotation.Meta(name="property",value="form")
    protected com.example.dto.list3.FormDto form = new com.example.dto.list3.FormDto();


    public com.example.dto.list3.ViewDto getView() {
        return this.view;
    }

    public com.example.dto.list3.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.scope.annotation.RequestParameter
    public java.util.List<com.example.dto.list3.EntryDto> getEntries() {
        return this.form.getEntries();
    }

    @org.seasar.ymir.annotation.Meta(name="source",value="return new org.seasar.ymir.response.PassthroughResponse();")
    public org.seasar.ymir.Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    public void _get() {

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
}
