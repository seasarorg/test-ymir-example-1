package com.example.web.edit;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.render.html.Select;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.Inject;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.converter.edit.FormConverter;
import com.example.dto.edit.FormDto;

public class InputPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.edit";

    public static final String NAME = "input";

    public static final String PATH = "/edit/input.html";

    @Meta(name = "bornOf", value = "/edit/input.html")
    public static final String P_description = "description";

    @Meta(name = "bornOf", value = "/edit/index.html")
    public static final String P_id = "id";

    @Meta(name = "bornOf", value = "/edit/input.html")
    public static final String P_name = "name";

    @Meta(name = "bornOf", value = "/edit/input.html")
    public static final String P_productTypeSelect$value = "productTypeSelect.value";

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/edit/input.html")})
    protected FormDto form = new FormDto();

    protected FormConverter formConverter;

    @Meta(name = "bornOf", value = "/edit/index.html")
    protected Integer id;

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/edit/input.html")})
    public String getDescription() {
        return this.form.getDescription();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/edit/input.html")})
    @RequestParameter
    public void setDescription(String description) {
        this.form.setDescription(description);
    }

    @Meta(name = "bornOf", value = "/edit/input.html")
    public FormDto getForm() {
        return this.form;
    }

    @Inject
    public void setFormConverter(FormConverter formConverter) {
        this.formConverter = formConverter;
    }

    @Meta(name = "bornOf", value = "/edit/index.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/edit/index.html")
    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/edit/input.html")})
    public String getName() {
        return this.form.getName();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/edit/input.html")})
    @RequestParameter
    public void setName(String name) {
        this.form.setName(name);
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/edit/input.html")})
    @RequestParameter
    public Select getProductTypeSelect() {
        return this.form.getProductTypeSelect();
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/edit/index.html", "/edit/input.html"})
    @Begin
    public void _get() {

    }

    public static interface _get_backed extends GetAction {
        public static final String NAME = "_get_backed";

        public static final String KEY = "backed";

        public static final Class<? extends GetAction> method = _get_backed.class;
    }

    @Meta(name = "bornOf", value = "request:/edit/input.html")
    public void _get_backed() {

    }

    public static interface _post_next extends PostAction {
        public static final String NAME = "_post_next";

        public static final String KEY = "next";

        public static final Class<? extends PostAction> method = _post_next.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/edit/input.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post_next() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = {"/edit/index.html", "/edit/input.html"})
    public void _prerender() {

    }
}
