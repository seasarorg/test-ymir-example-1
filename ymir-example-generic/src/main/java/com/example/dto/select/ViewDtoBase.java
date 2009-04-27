package com.example.dto.select;

import java.io.Serializable;

public class ViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select/index.html")
    protected String name;


    public ViewDtoBase() {
    }

    public ViewDtoBase(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("name="), name);
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

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select/index.html")
    public String getName() {
        return this.name;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select/index.html")
    public void setName(String name) {
        this.name = name;
    }
}
