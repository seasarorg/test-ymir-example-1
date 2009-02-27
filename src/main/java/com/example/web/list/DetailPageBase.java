package com.example.web.list;

public class DetailPageBase extends com.example.web.list.PageBase {
    protected Integer id;

    protected com.example.dto.list.EntryDto entry = new com.example.dto.list.EntryDto();

    public Integer getId() {
        return this.id;
    }

    @org.seasar.ymir.scope.annotation.RequestParameter(actionName = {}, name = "", populateWhereNull = true)
    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.dto.list.EntryDto getEntry() {
        return this.entry;
    }

    public void _get() {

    }

    public void _prerender() {

    }
}
