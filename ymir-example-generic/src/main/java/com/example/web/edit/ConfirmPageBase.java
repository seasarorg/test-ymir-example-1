package com.example.web.edit;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.Inject;

import com.example.converter.edit.FormConverter;
import com.example.dto.edit.FormDto;

public class ConfirmPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.edit";

    public static final String NAME = "confirm";

    public static final String PATH = "/edit/confirm.html";

    public static final String A_get = "_get";

    public static final String A_post_next = "_post_next";

    public static final String A_post_previous = "_post_previous";

    public static final String P_form = "form";

    public static final String P_formConverter = "formConverter";

    @Metas({@Meta(name = "bornOf", value = "/edit/confirm.html"), @Meta(name = "property", value = "form")})
    protected FormDto form = new FormDto();

    protected FormConverter formConverter;

    @Meta(name = "bornOf", value = "/edit/confirm.html")
    public FormDto getForm() {
        return this.form;
    }

    @Inject
    public void setFormConverter(FormConverter formConverter) {
        this.formConverter = formConverter;
    }

    @Meta(name = "bornOf", value = "/edit/confirm.html")
    public void _get() {

    }

    @Metas({@Meta(name = "bornOf", value = "/edit/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_next() {
        return new PassthroughResponse();
    }

    @Metas({@Meta(name = "bornOf", value = "/edit/confirm.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_previous() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/edit/confirm.html")
    public void _prerender() {

    }
}
