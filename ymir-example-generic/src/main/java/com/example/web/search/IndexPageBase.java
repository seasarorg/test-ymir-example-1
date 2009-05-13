package com.example.web.search;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.search.ConditionDto;
import com.example.dto.search.SearchViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.search";

    public static final String NAME = "index";

    public static final String PATH = "/search/index.html";

    public static final String P_condition = "condition";

    public static final String P_id = "id";

    public static final String P_name = "name";

    public static final String P_searchView = "searchView";

    @Meta(name = "property", value = "condition")
    @Metas({@Meta(name = "property", value = "condition"), @Meta(name = "bornOf", value = "/search/index.html")})
    protected ConditionDto condition = new ConditionDto();

    @Meta(name = "bornOf", value = "/search/index.html")
    protected Integer id;

    @Meta(name = "bornOf", value = "/search/index.html")
    protected SearchViewDto searchView = new SearchViewDto();

    @Meta(name = "bornOf", value = "/search/index.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    @Meta(name = "formProperty", value = "condition")
    @Metas({@Meta(name = "formProperty", value = "condition"), @Meta(name = "bornOf", value = "/search/index.html")})
    public String getName() {
        return this.condition.getName();
    }

    @Meta(name = "formProperty", value = "condition")
    @Metas({@Meta(name = "formProperty", value = "condition"), @Meta(name = "bornOf", value = "/search/index.html")})
    @RequestParameter
    public void setName(String name) {
        this.condition.setName(name);
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public SearchViewDto getSearchView() {
        return this.searchView;
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void _get_search() {

    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void _prerender() {

    }
}
