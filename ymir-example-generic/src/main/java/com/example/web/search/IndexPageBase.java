package com.example.web.search;

public class IndexPageBase extends com.example.web.search.PageBase {
    protected com.example.dto.search.SearchViewDto searchView = new com.example.dto.search.SearchViewDto();

    @org.seasar.ymir.annotation.Meta(name="property",value="condition")
    protected com.example.dto.search.ConditionDto condition = new com.example.dto.search.ConditionDto();

    protected Integer id;


    public com.example.dto.search.SearchViewDto getSearchView() {
        return this.searchView;
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="condition")
    public String getName() {
        return this.condition.getName();
    }

    @org.seasar.ymir.annotation.Meta(name="formProperty",value="condition")
    @org.seasar.ymir.scope.annotation.RequestParameter(actionName={},name="",populateWhereNull=true)
    public void setName(String name) {
        this.condition.setName(name);
    }

    public Integer getId() {
        return this.id;
    }

    @org.seasar.ymir.scope.annotation.RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    public void _get_search() {

    }

    public void _get() {

    }

    public void _prerender() {

    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"","notes"})
    public void _validationFailed(org.seasar.ymir.message.Notes notes) {
        
    }

    @org.seasar.ymir.annotation.Meta(name="source",value={"throw ex;","ex"})
    public void _permissionDenied(org.seasar.ymir.constraint.PermissionDeniedException ex)
        throws org.seasar.ymir.constraint.PermissionDeniedException {
        throw ex;
    }
}
