package com.example.web.paging;

import java.util.ArrayList;
import java.util.List;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.render.Paging;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.paging.EntityDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.paging";

    public static final String NAME = "index";

    public static final String PATH = "/paging/index.html";

    @Meta(name = "bornOf", value = "/paging/index.html")
    public static final String P_p = "p";

    @Meta(name = "bornOf", value = "/paging/index.html")
    protected List<EntityDto> entities = new ArrayList<EntityDto>();

    @Meta(name = "bornOf", value = "/paging/index.html")
    protected Integer p;

    @Meta(name = "bornOf", value = "/paging/index.html")
    protected Paging paging = new Paging();

    @Meta(name = "bornOf", value = "/paging/index.html")
    public List<EntityDto> getEntities() {
        return this.entities;
    }

    @Meta(name = "bornOf", value = "/paging/index.html")
    public Integer getP() {
        return this.p;
    }

    @Meta(name = "bornOf", value = "/paging/index.html")
    @RequestParameter
    public void setP(Integer p) {
        this.p = p;
    }

    @Meta(name = "bornOf", value = "/paging/index.html")
    public Paging getPaging() {
        return this.paging;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/paging/index.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/paging/index.html")
    public void _prerender() {

    }
}
