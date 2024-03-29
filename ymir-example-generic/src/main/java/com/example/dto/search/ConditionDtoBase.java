package com.example.dto.search;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;

public class ConditionDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/search/index.html")
    protected String name;


    public ConditionDtoBase() {
    }

    public ConditionDtoBase(String name) {
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

    @Meta(name = "bornOf", value = "/search/index.html")
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = "/search/index.html")
    public void setName(String name) {
        this.name = name;
    }
}
