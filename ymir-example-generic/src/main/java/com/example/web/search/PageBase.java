package com.example.web.search;

import org.seasar.ymir.scope.annotation.Inject;

import com.example.logic.search.EntryLogic;

public class PageBase extends com.example.web.PageBase {
    EntryLogic entryLogic;

    @Inject
    public void setEntryLogic(EntryLogic entryLogic) {
        this.entryLogic = entryLogic;
    }
}
