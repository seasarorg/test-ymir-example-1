package com.example.web.mailsender;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.mailsender.MailDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.mailsender";

    public static final String NAME = "index";

    public static final String PATH = "/mailsender/index.html";

    public static final String A_get = "_get";

    public static final String P_mail = "mail";

    public static final String P_to = "to";

    public static final String P_text = "text";

    @Meta(name = "property", value = "mail")
    @Metas({@Meta(name = "property", value = "mail"), @Meta(name = "bornOf", value = "/mailsender/index.html")})
    protected MailDto mail = new MailDto();

    @Meta(name = "formProperty", value = "mail")
    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = "/mailsender/index.html")})
    public String getTo() {
        return this.mail.getTo();
    }

    @Meta(name = "formProperty", value = "mail")
    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = "/mailsender/index.html")})
    @RequestParameter
    public void setTo(String to) {
        this.mail.setTo(to);
    }

    @Meta(name = "formProperty", value = "mail")
    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = "/mailsender/index.html")})
    public String getText() {
        return this.mail.getText();
    }

    @Meta(name = "formProperty", value = "mail")
    @Metas({@Meta(name = "formProperty", value = "mail"), @Meta(name = "bornOf", value = "/mailsender/index.html")})
    @RequestParameter
    public void setText(String text) {
        this.mail.setText(text);
    }

    @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    @Metas({@Meta(name = "bornOf", value = "/mailsender/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_send() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public void _prerender() {

    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }
}
