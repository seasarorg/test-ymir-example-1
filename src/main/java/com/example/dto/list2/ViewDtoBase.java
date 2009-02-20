package com.example.dto.list2;

import java.io.Serializable;

public class ViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected com.example.dto.list2.EntryDto entry = new com.example.dto.list2.EntryDto();


    public ViewDtoBase() {
    }

    public ViewDtoBase(com.example.dto.list2.EntryDto entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("entry="), entry);
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

    public com.example.dto.list2.EntryDto getEntry() {
        return this.entry;
    }

    public void setEntry(com.example.dto.list2.EntryDto entry) {
        this.entry = entry;
    }
}
