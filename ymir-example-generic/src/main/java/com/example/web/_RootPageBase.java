package com.example.web;

@SuppressWarnings("unchecked")
public class _RootPageBase extends com.example.web.PageBase {

    @org.seasar.ymir.annotation.Meta(name="source",value="return \"redirect:index.html\";")
    public String _get() {
        return "redirect:index.html";
    }
}
