package com.example.web.list3;

import java.util.List;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.list3.EntryDto;
import com.example.dto.list3.FormDto;
import com.example.dto.list3.ViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list3";

    public static final String NAME = "index";

    public static final String PATH = "/list3/index.html";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_entries = "entries";

    @Meta(name = "bornOf", value = "/list3/index.html")
    protected ViewDto view = new ViewDto();

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = "/list3/index.html")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/list3/index.html")
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = "/list3/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/list3/index.html")})
    @RequestParameter
    public List<EntryDto> getEntries() {
        return this.form.getEntries();
    }

    @Meta(name = "bornOf", value = {"/index.html", "/list3/index.html"})
    public void _get() {

    }

    @Metas({@Meta(name = "bornOf", value = "/list3/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/list3/index.html")
    public void _prerender() {

    }
}
