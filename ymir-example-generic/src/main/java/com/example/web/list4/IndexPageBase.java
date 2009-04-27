package com.example.web.list4;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.render.Selector;
import org.seasar.ymir.scope.annotation.Inject;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.converter.list4.FruitCandidateConverter;
import com.example.dto.list4.FormDto;
import com.example.dto.list4.ViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list4";

    public static final String NAME = "index";

    public static final String PATH = "/list4/index.html";

    public static final String A_get = "_get";

    public static final String A_post = "_post";

    public static final String P_view = "view";

    public static final String P_form = "form";

    public static final String P_fruitSelector = "fruitSelector";

    public static final String P_fruitCandidateConverter = "fruitCandidateConverter";

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected ViewDto view = new com.example.dto.list4.ViewDto();

    @Metas({@Meta(name = "property", value = "form"), @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})})
    protected FormDto form = new com.example.dto.list4.FormDto();

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected Selector fruitSelector = new org.seasar.ymir.render.Selector();

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected FruitCandidateConverter fruitCandidateConverter;

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public ViewDto getView() {
        return this.view;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public FormDto getForm() {
        return this.form;
    }

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})})
    @RequestParameter
    public Selector getFruitSelector() {
        return this.form.getFruitSelector();
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    @Inject
    public void setFruitCandidateConverter(FruitCandidateConverter fruitCandidateConverter) {
        this.fruitCandidateConverter = fruitCandidateConverter;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public void _get() {

    }

    @Metas({@Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"}), @Meta(name = "source", value = "return new org.seasar.ymir.response.PassthroughResponse();")})
    public Response _post() {
        return new org.seasar.ymir.response.PassthroughResponse();
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public void _prerender() {

    }
}
