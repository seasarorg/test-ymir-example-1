package com.example.web.checkbox3;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.checkbox3.FormDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.checkbox3";

    public static final String NAME = "index";

    public static final String PATH = "/checkbox3/index.html";

    public static final String A_post = "_post";

    public static final String P_form = "form";

    public static final String P_smoking = "smoking";

    public static final String P_drinking = "drinking";

    public static final String P_gambling = "gambling";

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})})
    protected FormDto form = new com.example.dto.checkbox3.FormDto();

    @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})})
    public boolean isSmoking() {
        return this.form.isSmoking();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})})
    @RequestParameter
    public void setSmoking(boolean smoking) {
        this.form.setSmoking(smoking);
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})})
    public boolean isDrinking() {
        return this.form.isDrinking();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})})
    @RequestParameter
    public void setDrinking(boolean drinking) {
        this.form.setDrinking(drinking);
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})})
    public boolean isGambling() {
        return this.form.isGambling();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})})
    @RequestParameter
    public void setGambling(boolean gambling) {
        this.form.setGambling(gambling);
    }

    @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
