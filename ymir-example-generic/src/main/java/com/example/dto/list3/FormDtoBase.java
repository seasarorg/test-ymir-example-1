package com.example.dto.list3;

import java.io.Serializable;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    protected java.util.List<com.example.dto.list3.EntryDto> entries = new org.seasar.ymir.util.FlexibleList<com.example.dto.list3.EntryDto>();


    public FormDtoBase() {
    }

    public FormDtoBase(java.util.List<com.example.dto.list3.EntryDto> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("entries="), entries);
        sb.append(')');
        return toString(sb);
    }

    protected StringBuilder append(StringBuilder sb, Object obj) {
        if (obj != null && obj.getClass().isArray()) {
            sb.append('{');
            int len = java.lang.reflect.Array.getLength(obj);
            String delim = "";
            for (int i = 0; i < len; i++) {
                sb.append(delim);
                delim = ", ";
                append(sb, java.lang.reflect.Array.get(obj, i));
            }
            sb.append('}');
        } else {
            sb.append(obj);
        }
        return sb;
    }

    protected String toString(StringBuilder sb) {
        return sb.toString();
    }

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public java.util.List<com.example.dto.list3.EntryDto> getEntries() {
        return this.entries;
    }
}
