package com.example.web.checkbox;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.render.Selector;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.checkbox.FormDto;
import com.example.dto.checkbox.ViewDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.checkbox";

    public static final String NAME = "index";

    public static final String PATH = "/checkbox/index.html";

    @Meta(name = "bornOf", value = "/checkbox/index.html")
    public static final String P_fruitSelector$selectedValues = "fruitSelector.selectedValues";

    @Metas({@Meta(name = "bornOf", value = "/checkbox/index.html"), @Meta(name = "property", value = "form")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/checkbox/index.html")
    protected ViewDto view = new ViewDto();

    @Meta(name = "bornOf", value = "/checkbox/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "bornOf", value = "/checkbox/index.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public Selector getFruitSelector() {
        return this.form.getFruitSelector();
    }

    @Meta(name = "bornOf", value = "/checkbox/index.html")
    public ViewDto getView() {
        return this.view;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/checkbox/index.html", "/index.html"})
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/checkbox/index.html", "/index.html"})
    public void _prerender() {

    }
}
