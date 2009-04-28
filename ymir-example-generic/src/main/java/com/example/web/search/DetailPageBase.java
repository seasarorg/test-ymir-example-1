package com.example.web.search;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.scope.annotation.Inject;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.converter.search.DetailViewConverter;
import com.example.dto.search.DetailViewDto;

public class DetailPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.search";

    public static final String NAME = "detail";

    public static final String PATH = "/search/detail.html";

    public static final String P_detailView = "detailView";

    public static final String P_detailViewConverter = "detailViewConverter";

    public static final String P_id = "id";

    @Meta(name = "bornOf", value = "/search/detail.html")
    protected DetailViewDto detailView = new DetailViewDto();

    protected DetailViewConverter detailViewConverter;

    protected Integer id;

    @Meta(name = "bornOf", value = "/search/detail.html")
    public DetailViewDto getDetailView() {
        return this.detailView;
    }

    @Inject
    public void setDetailViewConverter(DetailViewConverter detailViewConverter) {
        this.detailViewConverter = detailViewConverter;
    }

    public Integer getId() {
        return this.id;
    }

    @RequestParameter
    public void setId(Integer id) {
        this.id = id;
    }

    @Meta(name = "bornOf", value = "/search/detail.html")
    public Response _get_back() {

        return null;
    }

    @Meta(name = "bornOf", value = "/search/detail.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/search/detail.html")
    public void _prerender() {

    }
}
