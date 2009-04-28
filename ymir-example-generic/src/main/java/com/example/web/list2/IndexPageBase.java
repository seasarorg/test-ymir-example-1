package com.example.web.list2;

import java.util.List;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.list2.EntryDto;
import com.example.dto.list2.FormDto;
import com.example.dto.list2.ViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list2";

    public static final String NAME = "index";

    public static final String PATH = "/list2/index.html";

    public static final String A_get = "_get";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_entries = "entries";

    @Meta(name = "bornOf", value = "/list2/index.html")
    protected ViewDto view = new ViewDto();

    @Meta(name = "property", value = "form")
    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/list2/index.html")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/list2/index.html")
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Meta(name = "formProperty", value = "form")
    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/list2/index.html")})
    @RequestParameter
    public List<EntryDto> getEntries() {
        return this.form.getEntries();
    }

    @Meta(name = "source", value = {"return new org.seasar.ymir.response.PassthroughResponse();", "index"})
    @Metas({@Meta(name = "bornOf", value = "/list2/index.html"), @Meta(name = "source", value = {"return new org.seasar.ymir.response.PassthroughResponse();", "index"})})
    public Response _post_update(int index) {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
    public void _prerender() {

    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }
}
