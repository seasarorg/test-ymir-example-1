package com.example.dto.list2;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.List;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.util.FlexibleList;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/list2/index.html")
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
            int len = Array.getLength(obj);
            String delim = "";
            for (int i = 0; i < len; i++) {
                sb.append(delim);
                delim = ", ";
                append(sb, Array.get(obj, i));
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

    @Meta(name = "bornOf", value = "/list2/index.html")
    public List<EntryDto> getEntries() {
        return this.entries;
    }
}
