package com.example.web.requestHeader;

@SuppressWarnings("unchecked")
public class IndexPageBase extends com.example.web.PageBase {
    protected String userAgent;


    public String getUserAgent() {
        return this.userAgent;
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
