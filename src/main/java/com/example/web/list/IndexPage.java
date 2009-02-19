package com.example.web.list;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        entries = getList();
    }
}
