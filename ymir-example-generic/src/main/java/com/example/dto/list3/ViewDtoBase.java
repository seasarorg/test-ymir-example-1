package com.example.dto.list3;

import java.io.Serializable;

public class ViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected java.util.List<com.example.dto.list3.EntryDto> entries;


    public ViewDtoBase() {
    }

    public ViewDtoBase(java.util.List<com.example.dto.list3.EntryDto> entries) {
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

    public java.util.List<com.example.dto.list3.EntryDto> getEntries() {
        return this.entries;
    }

    public void setEntries(java.util.List<com.example.dto.list3.EntryDto> entries) {
        this.entries = entries;
    }
}
