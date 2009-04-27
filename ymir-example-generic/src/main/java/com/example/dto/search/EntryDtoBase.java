package com.example.dto.search;

import java.io.Serializable;

import org.seasar.ymir.annotation.Meta;

@Meta(name = "conversion", value = "com.example.dao.search.Entry")
public class EntryDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/update/input.html")
    protected Integer id;

    @Meta(name = "bornOf", value = "/update/input.html")
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

    @Meta(name = "bornOf", value = "/update/input.html")
    public Integer getId() {
        return this.id;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void setId(Integer id) {
        this.id = id;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void setName(String name) {
        this.name = name;
    }
}
