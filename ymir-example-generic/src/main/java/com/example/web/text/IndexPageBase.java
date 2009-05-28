package com.example.web.text;

import java.util.Date;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.constraint.annotation.Datetime;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.text.FormDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.text";

    public static final String NAME = "index";

    public static final String PATH = "/text/index.html";

    @Meta(name = "bornOf", value = "/text/index.html")
    public static final String P_date1 = "date1";

    @Meta(name = "bornOf", value = "/text/index.html")
    public static final String P_date2 = "date2";

    @Meta(name = "property", value = "form")
    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/text/index.html")})
    protected FormDto form = new FormDto();

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/text/index.html")})
    public Date getDate1() {
        return this.form.getDate1();
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/text/index.html")})
    @Datetime("yyyyMMdd")
    @RequestParameter
    public void setDate1(Date date1) {
        this.form.setDate1(date1);
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/text/index.html")})
    public Date getDate2() {
        return this.form.getDate2();
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/text/index.html")})
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

    @Meta(name = "bornOf", value = "/text/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/text/index.html")
    public void _prerender() {

    }
}
