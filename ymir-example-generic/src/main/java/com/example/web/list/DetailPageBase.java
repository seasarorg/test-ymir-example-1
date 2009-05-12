package com.example.web.list;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.list.EntryDto;

public class DetailPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list";

    public static final String NAME = "detail";

    public static final String PATH = "/list/detail.html";

    public static final String P_id = "id";

    public static final String P_entry = "entry";

    @Meta(name = "bornOf", value = "/list/index.html")
    protected Integer id;

    @Meta(name = "bornOf", value = "/list/detail.html")
    protected EntryDto entry = new EntryDto();

    @Meta(name = "bornOf", value = "/list/index.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/list/index.html")
    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    @Meta(name = "bornOf", value = "/list/detail.html")
    public EntryDto getEntry() {
        return this.entry;
    }

    @Meta(name = "bornOf", value = "/list/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = {"/list/detail.html", "/list/index.html"})
    public void _prerender() {

    }
}
