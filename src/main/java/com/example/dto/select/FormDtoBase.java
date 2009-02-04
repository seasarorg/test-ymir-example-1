package com.example.dto.select;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String fruits;

    protected net.skirnir.freyja.render.html.SelectTag selectTag;


    public FormDtoBase() {
    }

    public FormDtoBase(String fruits, net.skirnir.freyja.render.html.SelectTag selectTag) {
        this.fruits = fruits;
        this.selectTag = selectTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("fruits="), fruits).append(", ");
        append(sb.append("selectTag="), selectTag);
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

    public String getFruits() {
        return this.fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public net.skirnir.freyja.render.html.SelectTag getSelectTag() {
        return this.selectTag;
    }

    public void setSelectTag(net.skirnir.freyja.render.html.SelectTag selectTag) {
        this.selectTag = selectTag;
    }
}
