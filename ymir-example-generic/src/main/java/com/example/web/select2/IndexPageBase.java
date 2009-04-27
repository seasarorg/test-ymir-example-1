package com.example.web.select2;

import net.skirnir.freyja.render.html.Select;
import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.select2.FormDto;
import com.example.dto.select2.ViewDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.select2";

    public static final String NAME = "index";

    public static final String PATH = "/select2/index.html";

    public static final String A_post = "_post";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_fruitsSelect = "fruitsSelect";

    @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})
    protected ViewDto view = new com.example.dto.select2.ViewDto();

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})})
    protected FormDto form = new com.example.dto.select2.FormDto();

    @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})
    protected Select fruitsSelect = new net.skirnir.freyja.render.html.Select();

    @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})})
    @RequestParameter
    public Select getFruitsSelect() {
        return this.form.getFruitsSelect();
    }

    @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/select2/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
