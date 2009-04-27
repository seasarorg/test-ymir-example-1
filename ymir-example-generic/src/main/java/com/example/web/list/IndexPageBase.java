package com.example.web.list;

import java.util.List;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

import com.example.dto.list.EntryDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list";

    public static final String NAME = "index";

    public static final String PATH = "/list/index.html";

    public static final String A_post = "_post";

    public static final String P_entries = "entries";

    @Meta(name = "bornOf", value = "/update/input.html")
    protected List<EntryDto> entries = new java.util.ArrayList<com.example.dto.list.EntryDto>();

    @Meta(name = "bornOf", value = "/update/input.html")
    public List<EntryDto> getEntries() {
        return this.entries;
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
