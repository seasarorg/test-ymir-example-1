package com.example.web.search;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.search.ConditionDto;
import com.example.dto.search.SearchViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.search";

    public static final String NAME = "index";

    public static final String PATH = "/search/index.html";

    @Meta(name = "bornOf", value = "/search/index.html")
    public static final String P_id = "id";

    @Meta(name = "bornOf", value = "/search/index.html")
    public static final String P_name = "name";

    @Metas({@Meta(name = "bornOf", value = "/search/index.html"), @Meta(name = "property", value = "condition")})
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

    @Metas({@Meta(name = "bornOf", value = "/search/index.html"), @Meta(name = "formProperty", value = "condition")})
    public String getName() {
        return this.condition.getName();
    }

    @Metas({@Meta(name = "bornOf", value = "/search/index.html"), @Meta(name = "formProperty", value = "condition")})
    @RequestParameter
    public void setName(String name) {
        this.condition.setName(name);
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public SearchViewDto getSearchView() {
        return this.searchView;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void _get() {

    }

    public static interface _get_search extends GetAction {
        public static final String NAME = "_get_search";

        public static final String KEY = "search";

        public static final Class<? extends GetAction> method = _get_search.class;
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void _get_search() {

    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void _prerender() {

    }
}
