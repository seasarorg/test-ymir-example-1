package com.example.dto.select2;

import java.io.Serializable;

public class ViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    protected java.util.List<String> names = new java.util.ArrayList<String>();


    public ViewDtoBase() {
    }

    public ViewDtoBase(java.util.List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("names="), names);
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

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    public java.util.List<String> getNames() {
        return this.names;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select2/index.html")
    public void setNames(java.util.List<String> names) {
        this.names = names;
    }
}
