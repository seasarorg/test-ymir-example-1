package com.example.web.register;

public class ConfirmPageBase extends com.example.web.register.PageBase {
    @org.seasar.ymir.annotation.Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    public org.seasar.ymir.Response _post_back() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @org.seasar.ymir.annotation.Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    public org.seasar.ymir.Response _post_complete() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    public void _prerender() {

    }

    public void _get() {

    }
}
