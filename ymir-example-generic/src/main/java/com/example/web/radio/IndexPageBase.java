package com.example.web.radio;

import net.skirnir.freyja.render.html.Radio;
import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.radio.FormDto;
import com.example.dto.radio.ViewDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.radio";

    public static final String NAME = "index";

    public static final String PATH = "/radio/index.html";

    public static final String A_post = "_post";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_fruitsRadio = "fruitsRadio";

    @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})
    protected ViewDto view = new com.example.dto.radio.ViewDto();

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})})
    protected FormDto form = new com.example.dto.radio.FormDto();

    @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})
    protected Radio fruitsRadio = new net.skirnir.freyja.render.html.Radio();

    @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})})
    @RequestParameter
    public Radio getFruitsRadio() {
        return this.form.getFruitsRadio();
    }

    @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/radio/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
