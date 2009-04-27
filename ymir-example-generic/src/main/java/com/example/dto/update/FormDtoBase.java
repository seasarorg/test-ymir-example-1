package com.example.dto.update;

import java.io.Serializable;

import org.seasar.ymir.annotation.Meta;

@Meta(name = "conversion", value = "com.example.dao.update.Entity")
public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/update/input.html")
    protected String name;

    @Meta(name = "bornOf", value = "/update/input.html")
    protected String furigana;


    public FormDtoBase() {
    }

    public FormDtoBase(String furigana, String name) {
        this.furigana = furigana;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("name="), name).append(", ");
        append(sb.append("furigana="), furigana);
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
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void setName(String name) {
        this.name = name;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public String getFurigana() {
        return this.furigana;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void setFurigana(String furigana) {
        this.furigana = furigana;
    }
}
