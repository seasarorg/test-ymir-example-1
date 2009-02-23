package com.example.web.list;

public class IndexPageBase extends com.example.web.list.PageBase {
    protected java.util.List<com.example.dto.list.EntryDto> entries;

    public java.util.List<com.example.dto.list.EntryDto> getEntries() {
        return this.entries;
    }

    public void _prerender() {

    }

    @org.seasar.ymir.annotation.Meta(name = "source", value = { "", "notes" })
    public void _validationFailed(org.seasar.ymir.message.Notes notes) {

    }

    @org.seasar.ymir.annotation.Meta(name = "source", value = { "throw ex;",
            "ex" })
    public void _permissionDenied(
            org.seasar.ymir.constraint.PermissionDeniedException ex)
            throws org.seasar.ymir.constraint.PermissionDeniedException {
        throw ex;
    }

    public void _get() {

    }
}
