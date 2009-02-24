package com.example.web.search;

import org.seasar.ymir.Response;

public class DetailPageBase extends com.example.web.search.PageBase {
    protected Integer id;

    protected com.example.dto.search.DetailViewDto detailView = new com.example.dto.search.DetailViewDto();

    protected com.example.converter.search.DetailViewConverter detailViewConverter;

    public Integer getId() {
        return this.id;
    }

    @org.seasar.ymir.scope.annotation.RequestParameter(actionName = {}, name = "", populateWhereNull = true)
    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.dto.search.DetailViewDto getDetailView() {
        return this.detailView;
    }

    @org.seasar.ymir.scope.annotation.Inject(actionName = {}, name = "", required = true)
    public void setDetailViewConverter(
            com.example.converter.search.DetailViewConverter detailViewConverter) {
        this.detailViewConverter = detailViewConverter;
    }

    public void _get() {

    }

    public Response _get_back() {
        return null;
    }

    @org.seasar.ymir.annotation.Meta(name = "source", value = { "throw ex;",
            "ex" })
    public void _permissionDenied(
            org.seasar.ymir.constraint.PermissionDeniedException ex)
            throws org.seasar.ymir.constraint.PermissionDeniedException {
        throw ex;
    }

    public void _prerender() {

    }

    @org.seasar.ymir.annotation.Meta(name = "source", value = { "", "notes" })
    public void _validationFailed(org.seasar.ymir.message.Notes notes) {

    }
}
