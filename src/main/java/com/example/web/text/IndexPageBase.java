package com.example.web.text;

public class IndexPageBase extends com.example.web.PageBase {
    @org.seasar.ymir.annotation.Meta(name = "property", value = "form")
    protected com.example.dto.text.FormDto form = new com.example.dto.text.FormDto();


    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    public java.util.Date getDate1() {
        return this.form.getDate1();
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    @org.seasar.ymir.constraint.annotation.Datetime("yyyyMMdd")
    @org.seasar.ymir.scope.annotation.RequestParameter
    public void setDate1(java.util.Date date1) {
        this.form.setDate1(date1);
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    public java.util.Date getDate2() {
        return this.form.getDate2();
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    @org.seasar.ymir.constraint.annotation.Datetime("yyyyMMdd")
    @org.seasar.ymir.scope.annotation.RequestParameter
    public void setDate2(java.util.Date date2) {
        this.form.setDate2(date2);
    }

    public void _get() {

    }

    public void _prerender() {

    }
}
