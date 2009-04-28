package com.example.dto.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.seasar.ymir.annotation.Meta;

public class SearchViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/search/index.html")
    protected List<EntryDto> entries = new ArrayList<EntryDto>();


    public SearchViewDtoBase() {
    }

    public SearchViewDtoBase(List<EntryDto> entries) {
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

    @Meta(name = "bornOf", value = "/search/index.html")
    public List<EntryDto> getEntries() {
        return this.entries;
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void setEntries(List<EntryDto> entries) {
        this.entries = entries;
    }
}
