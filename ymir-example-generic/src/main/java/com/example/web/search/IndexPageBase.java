package com.example.web.search;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.search.ConditionDto;
import com.example.dto.search.SearchViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.search";

    public static final String NAME = "index";

    public static final String PATH = "/search/index.html";

    public static final String A_post = "_post";

    public static final String P_searchView = "searchView";

    public static final String P_condition = "condition";

    public static final String P_name = "name";

    public static final String P_id = "id";

    @Meta(name = "bornOf", value = "/update/input.html")
    protected SearchViewDto searchView = new com.example.dto.search.SearchViewDto();

    @Metas({@Meta(name = "property", value = "condition"), @Meta(name = "bornOf", value = "/update/input.html")})
    protected ConditionDto condition = new com.example.dto.search.ConditionDto();

    @Meta(name = "bornOf", value = "/update/input.html")
    protected Integer id;

    @Meta(name = "bornOf", value = "/update/input.html")
    public SearchViewDto getSearchView() {
        return this.searchView;
    }

    @Metas({@Meta(name = "formProperty", value = "condition"), @Meta(name = "bornOf", value = "/update/input.html")})
    public String getName() {
        return this.condition.getName();
    }

    @Metas({@Meta(name = "formProperty", value = "condition"), @Meta(name = "bornOf", value = "/update/input.html")})
    @RequestParameter
    public void setName(String name) {
        this.condition.setName(name);
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
    public void _prerender() {

    }

    public void _get() {

    }

    public void _get_search() {

    }

    @Metas({@Meta(name = "bornOf", value = "/update/input.html"), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }
}
