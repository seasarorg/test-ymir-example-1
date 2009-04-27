package com.example.dto.checkbox;

import java.io.Serializable;
import java.util.List;

import org.seasar.ymir.annotation.Meta;

public class ViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/checkbox/index.html", "/update/input.html"})
    protected List<String> names = new java.util.ArrayList<String>();


    public ViewDtoBase() {
    }

    public ViewDtoBase(List<String> names) {
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

    @Meta(name = "bornOf", value = {"/checkbox/index.html", "/update/input.html"})
    public List<String> getNames() {
        return this.names;
    }

    @Meta(name = "bornOf", value = {"/checkbox/index.html", "/update/input.html"})
    public void setNames(List<String> names) {
        this.names = names;
    }
}
