package com.example.web.text;

public class IndexPageBase extends com.example.web.PageBase {
    @org.seasar.ymir.annotation.Meta(name="property",value="form")
    protected com.example.dto.text.FormDto form = new com.example.dto.text.FormDto();


    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    public java.util.Date getDate() {
        return this.form.getDate();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="form")
    @org.seasar.ymir.constraint.annotation.Datetime(pattern="",property={},value="yyyyMMdd")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setDate(java.util.Date date) {
        this.form.setDate(date);
    }

    public void _get() {

    }

    public void _prerender() {

    }
}
