package com.example.web.checkbox2;

import net.skirnir.freyja.render.html.Input;
import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.checkbox2.FormDto;
import com.example.dto.checkbox2.ViewDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.checkbox2";

    public static final String NAME = "index";

    public static final String PATH = "/checkbox2/index.html";

    public static final String A_get = "_get";

    public static final String A_post = "_post";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_smokingInput = "smokingInput";

    public static final String P_drinkingInput = "drinkingInput";

    public static final String P_gamblingInput = "gamblingInput";

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    protected ViewDto view = new com.example.dto.checkbox2.ViewDto();

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})})
    protected FormDto form = new com.example.dto.checkbox2.FormDto();

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    protected Input smokingInput = new net.skirnir.freyja.render.html.Input();

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    protected Input drinkingInput = new net.skirnir.freyja.render.html.Input();

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    protected Input gamblingInput = new net.skirnir.freyja.render.html.Input();

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})})
    @RequestParameter
    public Input getSmokingInput() {
        return this.form.getSmokingInput();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})})
    @RequestParameter
    public Input getDrinkingInput() {
        return this.form.getDrinkingInput();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})})
    @RequestParameter
    public Input getGamblingInput() {
        return this.form.getGamblingInput();
    }

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
