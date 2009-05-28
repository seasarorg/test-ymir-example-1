package com.example.web.list4;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.render.Selector;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.Inject;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.converter.list4.FruitCandidateConverter;
import com.example.dto.list4.FormDto;
import com.example.dto.list4.ViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list4";

    public static final String NAME = "index";

    public static final String PATH = "/list4/index.html";

    public static final String P_fruitSelector = "fruitSelector";

    @Meta(name = "bornOf", value = "/list4/index.html")
    public static final String P_fruitSelector$selectedValues = "fruitSelector.selectedValues";

    @Metas({@Meta(name = "bornOf", value = "/list4/index.html"), @Meta(name = "property", value = "form")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected FruitCandidateConverter fruitCandidateConverter;

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected ViewDto view = new ViewDto();

    @Meta(name = "bornOf", value = "/list4/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    @Inject
    public void setFruitCandidateConverter(FruitCandidateConverter fruitCandidateConverter) {
        this.fruitCandidateConverter = fruitCandidateConverter;
    }

    @Metas({@Meta(name = "bornOf", value = "/list4/index.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public Selector getFruitSelector() {
        return this.form.getFruitSelector();
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public ViewDto getView() {
        return this.view;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/index.html")
    public void _get() {

    }

    public static interface _post extends PostAction {
        public static final String NAME = "_post";

        public static final String KEY = "";

        public static final Class<? extends PostAction> method = _post.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/list4/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post() {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public void _prerender() {

    }
}
