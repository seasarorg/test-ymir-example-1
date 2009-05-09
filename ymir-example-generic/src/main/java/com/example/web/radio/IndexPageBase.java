package com.example.web.radio;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.render.Selector;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.radio.FormDto;
import com.example.dto.radio.ViewDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.radio";

    public static final String NAME = "index";

    public static final String PATH = "/radio/index.html";

    public static final String A_get = "_get";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_fruitSelector = "fruitSelector";

    @Meta(name = "bornOf", value = "/radio/index.html")
    protected ViewDto view = new ViewDto();

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/radio/index.html")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/radio/index.html")
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = "/radio/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "bornOf", value = "/radio/index.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public Selector getFruitSelector() {
        return this.form.getFruitSelector();
    }

    @Meta(name = "bornOf", value = "/radio/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/radio/index.html")
    public void _prerender() {

    }
}
