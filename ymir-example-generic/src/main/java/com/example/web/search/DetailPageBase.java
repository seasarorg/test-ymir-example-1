package com.example.web.search;

import org.seasar.ymir.Response;

public class DetailPageBase extends com.example.web.search.PageBase {
    protected Integer id;

    protected com.example.dto.search.DetailViewDto detailView = new com.example.dto.search.DetailViewDto();

    protected com.example.converter.search.DetailViewConverter detailViewConverter;

    public Integer getId() {
        return this.id;
    }

    @org.seasar.ymir.scope.annotation.RequestParameter(actionName = {}, value = "", populateWhereNull = true)
    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.dto.search.DetailViewDto getDetailView() {
        return this.detailView;
    }

    @org.seasar.ymir.scope.annotation.Inject(actionName = {}, value = "", required = true)
    public void setDetailViewConverter(
            com.example.converter.search.DetailViewConverter detailViewConverter) {
        this.detailViewConverter = detailViewConverter;
    }

    public void _get() {

    }

    public Response _get_back() {
        return null;
    }

    public void _prerender() {

    }
}
