package com.example.web.list2;

import java.util.List;

import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.dto.list2.EntryDto;
import com.example.dto.list2.FormDto;
import com.example.dto.list2.ViewDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list2";

    public static final String NAME = "index";

    public static final String PATH = "/list2/index.html";

    public static final String P_entries = "entries";

    @Metas({@Meta(name = "bornOf", value = "/list2/index.html"), @Meta(name = "property", value = "form")})
    protected FormDto form = new FormDto();

    @Meta(name = "bornOf", value = "/list2/index.html")
    protected ViewDto view = new ViewDto();

    @Metas({@Meta(name = "bornOf", value = "/list2/index.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public List<EntryDto> getEntries() {
        return this.form.getEntries();
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
    public FormDto getForm() {
        return this.form;
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
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

    public static interface _post_update extends PostAction {
        public static final String NAME = "_post_update";

        public static final String KEY = "update[0]";

        public static final Class<? extends PostAction> method = _post_update.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/list2/index.html"), @Meta(name = "source", value = {"return new PassthroughResponse();", "index"}, classValue = PassthroughResponse.class)})
    public Response _post_update(int index) {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
    public void _prerender() {

    }
}
