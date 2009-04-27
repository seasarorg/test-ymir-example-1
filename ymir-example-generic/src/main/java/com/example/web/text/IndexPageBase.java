package com.example.web.text;

import java.util.Date;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.constraint.annotation.Datetime;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.text.FormDto;
import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.text";

    public static final String NAME = "index";

    public static final String PATH = "/text/index.html";

    public static final String A_post = "_post";

    public static final String P_form = "form";

    public static final String P_date1 = "date1";

    public static final String P_date2 = "date2";

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    protected FormDto form = new com.example.dto.text.FormDto();

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    public Date getDate1() {
        return this.form.getDate1();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    @Datetime("yyyyMMdd")
    @RequestParameter
    public void setDate1(Date date1) {
        this.form.setDate1(date1);
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    public Date getDate2() {
        return this.form.getDate2();
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/update/input.html")})
    @Datetime("yyyyMMdd")
    @RequestParameter
    public void setDate2(Date date2) {
        this.form.setDate2(date2);
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void _prerender() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
