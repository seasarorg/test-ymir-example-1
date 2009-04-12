package com.example.dto.list4;

import java.io.Serializable;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    protected org.seasar.ymir.render.Selector entrySelector;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    protected java.util.List<com.example.dto.list4.EntryDto> entries = new org.seasar.ymir.util.FlexibleList<com.example.dto.list4.EntryDto>();


    public FormDtoBase() {
    }

    public FormDtoBase(java.util.List<com.example.dto.list4.EntryDto> entries, org.seasar.ymir.render.Selector entrySelector) {
        this.entries = entries;
        this.entrySelector = entrySelector;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("entrySelector="), entrySelector).append(", ");
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

    @org.seasar.ymir.annotation.Metas({@org.seasar.ymir.annotation.Meta(name = "formProperty", value = "form"), @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")})
    @org.seasar.ymir.scope.annotation.RequestParameter
    public org.seasar.ymir.render.Selector getEntrySelector() {
        return this.entrySelector;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public java.util.List<com.example.dto.list4.EntryDto> getEntries() {
        return this.entries;
    }
}
