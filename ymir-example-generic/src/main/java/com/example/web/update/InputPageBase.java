package com.example.web.update;

public class InputPageBase extends com.example.web.update.PageBase {
    protected Integer id;

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    public String getName() {
        return this.form.getName();
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName = {}, name = "", populateWhereNull = true)
    public void setName(String name) {
        this.form.setName(name);
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    public String getFurigana() {
        return this.form.getFurigana();
    }

    @org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName = {}, name = "", populateWhereNull = true)
    public void setFurigana(String furigana) {
        this.form.setFurigana(furigana);
    }

    public Integer getId() {
        return this.id;
    }

    @org.seasar.ymir.scope.annotation.RequestParameter(actionName = {}, name = "", populateWhereNull = true)
    public void setId(Integer id) {
        this.id = id;
    }

    @org.seasar.ymir.annotation.Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")
    public org.seasar.ymir.Response _post_confirm() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    public void _prerender() {

    }

    public void _get() {

    }
}
