package com.example.web.upload;

import java.io.IOException;

import org.seasar.ymir.FormFile;
import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.id.action.GetAction;
import org.seasar.ymir.id.action.PostAction;
import org.seasar.ymir.response.PassthroughResponse;
import org.seasar.ymir.scope.annotation.RequestParameter;

import com.example.web.PageBase;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.upload";

    public static final String NAME = "index";

    public static final String PATH = "/upload/index.html";

    @Meta(name = "bornOf", value = "/upload/index.html")
    public static final String P_file = "file";

    @Meta(name = "bornOf", value = "/upload/index.html")
    protected FormFile file;

    @Meta(name = "bornOf", value = "/upload/index.html")
    public FormFile getFile() {
        return this.file;
    }

    @Meta(name = "bornOf", value = "/upload/index.html")
    @RequestParameter
    public void setFile(FormFile file) {
        this.file = file;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = {"/index.html", "/upload/index.html"})
    public void _get() {

    }

    public static interface _post extends PostAction {
        public static final String NAME = "_post";

        public static final String KEY = "";

        public static final Class<? extends PostAction> method = _post.class;
    }

    @Metas({@Meta(name = "bornOf", value = "/upload/index.html"), @Meta(name = "source", value = "return new PassthroughResponse();", classValue = PassthroughResponse.class)})
    public Response _post()
        throws IOException {
        return new PassthroughResponse();
    }

    @Meta(name = "bornOf", value = {"/index.html", "/upload/index.html"})
    public void _prerender() {

    }
}
