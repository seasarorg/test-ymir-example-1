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

    @Metas({@Meta(name = "bornOf", value = "/checkbox3/index.html"), @Meta(name = "property", value = "form")})
    protected FormDto form = new FormDto();

    @Metas({@Meta(name = "bornOf", value = "/checkbox3/index.html"), @Meta(name = "formProperty", value = "form")})
    public boolean isDrinking() {
        return this.form.isDrinking();
    }

    @Metas({@Meta(name = "bornOf", value = "/checkbox3/index.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public void setDrinking(boolean drinking) {
        this.form.setDrinking(drinking);
    }

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "bornOf", value = "/checkbox3/index.html"), @Meta(name = "formProperty", value = "form")})
    public boolean isGambling() {
        return this.form.isGambling();
    }

    @Metas({@Meta(name = "bornOf", value = "/checkbox3/index.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public void setGambling(boolean gambling) {
        this.form.setGambling(gambling);
    }

    @Metas({@Meta(name = "bornOf", value = "/checkbox3/index.html"), @Meta(name = "formProperty", value = "form")})
    public boolean isSmoking() {
        return this.form.isSmoking();
    }

    @Metas({@Meta(name = "bornOf", value = "/checkbox3/index.html"), @Meta(name = "formProperty", value = "form")})
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
