package com.example.web.list4;

public class IndexPageBase extends com.example.web.PageBase {
    public static final String PACKAGE = "com.example.web.list4";

    public static final String NAME = "index";

    public static final String PATH = "/list4/index.html";

    public static final String A_post = "_post";

    public static final String A_get = "_get";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_entrySelector = "entrySelector";

    public static final String P_entries = "entries";

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    protected com.example.dto.list4.ViewDto view = new com.example.dto.list4.ViewDto();

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "property", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")})
    protected com.example.dto.list4.FormDto form = new com.example.dto.list4.FormDto();

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public com.example.dto.list4.ViewDto getView() {
        return this.view;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public com.example.dto.list4.FormDto getForm() {
        return this.form;
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public org.seasar.ymir.render.Selector getEntrySelector() {
        return this.form.getEntrySelector();
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public java.util.List<com.example.dto.list4.EntryDto> getEntries() {
        return this.form.getEntries();
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html"), @org.seasar.ymir.annotation.Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public org.seasar.ymir.Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public void _get() {

    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public void _prerender() {

    }
}
