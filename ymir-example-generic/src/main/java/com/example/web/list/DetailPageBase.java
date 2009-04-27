package com.example.web.list;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.list.EntryDto;

public class DetailPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list";

    public static final String NAME = "detail";

    public static final String PATH = "/list/detail.html";

    public static final String A_post = "_post";

    public static final String P_entry = "entry";

    public static final String P_id = "id";

    @Meta(name = "bornOf", value = "/update/input.html")
    protected EntryDto entry = new com.example.dto.list.EntryDto();

    @Meta(name = "bornOf", value = "/update/input.html")
    protected Integer id;

    @Meta(name = "bornOf", value = "/update/input.html")
    public EntryDto getEntry() {
        return this.entry;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
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
