package com.example.dto.list2;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;

public class EntryDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/list2/index.html")
    protected Integer id;

    @Meta(name = "bornOf", value = "/list2/index.html")
    protected String name;


    public EntryDtoBase() {
    }

    public EntryDtoBase(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("id="), id).append(", ");
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

    @Meta(name = "bornOf", value = "/list2/index.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
    public void setId(Integer id) {
        this.id = id;
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = "/list2/index.html")
    public void setName(String name) {
        this.name = name;
    }
}
