package com.example.dto.list3;

import java.io.Serializable;
import java.util.List;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;
import org.seasar.ymir.util.FlexibleList;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/list3/index.html")
    protected List<EntryDto> entries = new FlexibleList<EntryDto>();


    public FormDtoBase() {
    }

    public FormDtoBase(List<EntryDto> entries) {
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

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/list3/index.html")})
    @RequestParameter
    public List<EntryDto> getEntries() {
        return this.entries;
    }
}
