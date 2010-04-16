package org.seasar.dbflute.cbean;

import java.util.List;

import org.seasar.ymir.render.Paging;

public class PagingResultBean<E> {
    private List<E> selectedList;

    private Paging paging;

    public PagingResultBean(List<E> selectedList, Paging paging) {
        this.selectedList = selectedList;
        this.paging = paging;
    }

    public List<E> getSelectedList() {
        return selectedList;
    }

    public int getAllRecordCount() {
        return paging.getAllRecordCount();
    }

    public int getAllPageCount() {
        return paging.getAllPageCount();
    }

    public int getPageSize() {
        return paging.getPageSize();
    }

    public int getCurrentPageNumber() {
        return paging.getCurrentPageNumber();
    }

    public int getPageRangeSize() {
        return paging.getPageRangeSize();
    }
}
