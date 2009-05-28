package com.example.web.checkbox3;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.checkbox3.FormDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.checkbox3";

    public static final String NAME = "index";

    public static final String PATH = "/checkbox3/index.html";

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public static final String P_drinking = "drinking";

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public static final String P_gambling = "gambling";

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public static final String P_smoking = "smoking";

    @Meta(name = "property", value = "form")
    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/checkbox3/index.html")})
    protected FormDto form = new FormDto();

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox3/index.html")})
    public boolean isDrinking() {
        return this.form.isDrinking();
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox3/index.html")})
    @RequestParameter
    public void setDrinking(boolean drinking) {
        this.form.setDrinking(drinking);
    }

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox3/index.html")})
    public boolean isGambling() {
        return this.form.isGambling();
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox3/index.html")})
    @RequestParameter
    public void setGambling(boolean gambling) {
        this.form.setGambling(gambling);
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox3/index.html")})
    public boolean isSmoking() {
        return this.form.isSmoking();
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/checkbox3/index.html")})
    @RequestParameter
    public void setSmoking(boolean smoking) {
        this.form.setSmoking(smoking);
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/index.html"})
    public void _prerender() {

    }
}
