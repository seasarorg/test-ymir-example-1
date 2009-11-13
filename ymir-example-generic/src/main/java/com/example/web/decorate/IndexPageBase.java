package com.example.web.decorate;

import java.util.Date;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.constraint.annotation.Datetime;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.decorate.FormDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.decorate";

    public static final String NAME = "index";

    public static final String PATH = "/decorate/index.html";

    @Meta(name = "bornOf", value = "/decorate/index.html")
    public static final String P_date = "date";

    @Meta(name = "bornOf", value = "/decorate/index.html")
    public static final String P_date2 = "date2";

    @Metas({@Meta(name = "bornOf", value = "/decorate/index.html"), @Meta(name = "property", value = "form")})
    protected FormDto form = new FormDto();

    @Metas({@Meta(name = "bornOf", value = "/decorate/index.html"), @Meta(name = "formProperty", value = "form")})
    public Date getDate() {
        return this.form.getDate();
    }

    @Metas({@Meta(name = "bornOf", value = "/decorate/index.html"), @Meta(name = "formProperty", value = "form")})
    @Datetime("yyyyMMdd")
    @RequestParameter
    public void setDate(Date date) {
        this.form.setDate(date);
    }

    @Metas({@Meta(name = "bornOf", value = "/decorate/index.html"), @Meta(name = "formProperty", value = "form")})
    public Date getDate2() {
        return this.form.getDate2();
    }

    @Metas({@Meta(name = "bornOf", value = "/decorate/index.html"), @Meta(name = "formProperty", value = "form")})
    @Datetime("yyyyMMdd")
    @RequestParameter
    public void setDate2(Date date2) {
        this.form.setDate2(date2);
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/decorate/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/decorate/index.html")
    public void _prerender() {

    }
}
