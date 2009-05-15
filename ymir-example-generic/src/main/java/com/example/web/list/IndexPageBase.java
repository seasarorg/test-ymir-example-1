package com.example.web.list;

import java.util.ArrayList;
import java.util.List;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.id.action.GetAction;

import com.example.dto.list.EntryDto;

public class IndexPageBase extends PageBase {
    public static final String PACKAGE = "com.example.web.list";

    public static final String NAME = "index";

    public static final String PATH = "/list/index.html";

    public static final String P_entries = "entries";

    @Meta(name = "bornOf", value = "/list/index.html")
    protected List<EntryDto> entries = new ArrayList<EntryDto>();

    @Meta(name = "bornOf", value = "/list/index.html")
    public List<EntryDto> getEntries() {
        return this.entries;
    }

    public static interface _get extends GetAction {
        public static final String NAME = "_get";

        public static final String KEY = "";

        public static final Class<? extends GetAction> method = _get.class;
    }

    @Meta(name = "bornOf", value = "/list/detail.html")
    public void _get() {

    }

    @Meta(name = "bornOf", value = "/list/index.html")
    public void _prerender() {

    }
}
