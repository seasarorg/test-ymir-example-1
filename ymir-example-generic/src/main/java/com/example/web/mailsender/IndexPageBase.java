package com.example.web.mailsender;

public class IndexPageBase extends com.example.web.PageBase {
    @org.seasar.ymir.annotation.Meta(name="property",value="mail")
    protected com.example.dto.mailsender.MailDto mail = new com.example.dto.mailsender.MailDto();


    @org.seasar.ymir.annotation.Meta(name="formProperty",value="mail")
    public String getText() {
        return this.mail.getText();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="mail")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},value="",populateWhereNull=true)
    public void setText(String text) {
        this.mail.setText(text);
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="mail")
    public String getTo() {
        return this.mail.getTo();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="mail")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},value="",populateWhereNull=true)
    public void setTo(String to) {
        this.mail.setTo(to);
    }

    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value="return new org.seasar.ymir.response.PassthroughResponse();")
    public org.seasar.ymir.Response _post_send() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    public void _prerender() {

    }
}
