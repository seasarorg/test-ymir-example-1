package com.example.web.mailsender;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.mailsender.MailDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.mailsender";

    public static final String NAME = "index";

    public static final String PATH = "/mailsender/index.html";

    public static final String A_post = "_post";

    public static final String P_mail = "mail";

    public static final String P_to = "to";

    public static final String P_text = "text";

    @Metas({@Meta(name = "property", value = "mail"), @Meta(name = "bornOf", value = {"/mailsender/index.html", "/update/input.html"})})
    protected MailDto mail = new com.example.dto.mailsender.MailDto();

    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = {"/mailsender/index.html", "/update/input.html"})})
    public String getTo() {
        return this.mail.getTo();
    }

    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = {"/mailsender/index.html", "/update/input.html"})})
    @RequestParameter
    public void setTo(String to) {
        this.mail.setTo(to);
    }

    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = {"/mailsender/index.html", "/update/input.html"})})
    public String getText() {
        return this.mail.getText();
    }

    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = {"/mailsender/index.html", "/update/input.html"})})
    @RequestParameter
    public void setText(String text) {
        this.mail.setText(text);
    }

    @Meta(name = "bornOf", value = {"/mailsender/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/mailsender/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    public Response _post_send() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
