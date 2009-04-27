package com.example.web.list3;

import java.util.List;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
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

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    protected ViewDto view = new com.example.dto.list3.ViewDto();

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})})
    protected FormDto form = new com.example.dto.list3.FormDto();

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    protected List<EntryDto> entries = new org.seasar.ymir.util.FlexibleList<com.example.dto.list3.EntryDto>();

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})})
    @RequestParameter
    public List<EntryDto> getEntries() {
        return this.form.getEntries();
    }

    @Metas({@Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"}), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public void _prerender() {

    }

    @Meta(name = "bornOf", value = "/list3/index.html")
    public void _get() {

    }
}
