package com.example.web.mailsender;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.mailsender.MailDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.mailsender";

    public static final String NAME = "index";

    public static final String PATH = "/mailsender/index.html";

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public static final String P_text = "text";

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public static final String P_to = "to";

    @Metas({@Meta(name = "bornOf", value = "/mailsender/index.html"), @Meta(name = "property", value = "mail")})
    protected MailDto mail = new MailDto();

    @Metas({@Meta(name = "bornOf", value = "/mailsender/index.html"), @Meta(name = "formProperty", value = "mail")})
    public String getText() {
        return this.mail.getText();
    }

    @Metas({@Meta(name = "bornOf", value = "/mailsender/index.html"), @Meta(name = "formProperty", value = "mail")})
    @RequestParameter
    public void setText(String text) {
        this.mail.setText(text);
    }

    @Metas({@Meta(name = "bornOf", value = "/mailsender/index.html"), @Meta(name = "formProperty", value = "mail")})
    public String getTo() {
        return this.mail.getTo();
    }

    @Metas({@Meta(name = "bornOf", value = "/mailsender/index.html"), @Meta(name = "formProperty", value = "mail")})
    @RequestParameter
    public void setTo(String to) {
        this.mail.setTo(to);
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    public static interface _post_send extends PostAction {
        public static final String NAME = "_post_send";

        public static final String KEY = "send";

        public static final Class<? extends PostAction> method = _post_send.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/mailsender/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_send() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public void _prerender() {

    }
}
