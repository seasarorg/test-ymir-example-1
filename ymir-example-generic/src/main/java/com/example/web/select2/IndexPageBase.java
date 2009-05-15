package com.example.web.select2;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.render.html.Select;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.select2.FormDto;
import com.example.dto.select2.ViewDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.select2";

    public static final String NAME = "index";

    public static final String PATH = "/select2/index.html";

    public static final String P_form = "form";

    public static final String P_fruitsSelect = "fruitsSelect";

    public static final String P_view = "view";

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/select2/index.html")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/select2/index.html")
    protected ViewDto view = new ViewDto();

    @Meta(name = "bornOf", value = "/select2/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/select2/index.html")})
    @RequestParameter
    public Select getFruitsSelect() {
        return this.form.getFruitsSelect();
    }

    @Meta(name = "bornOf", value = "/select2/index.html")
    public ViewDto getView() {
        return this.view;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/select2/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/select2/index.html")
    public void _prerender() {

    }
}
