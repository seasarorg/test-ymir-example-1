package com.example.dto.radio;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String fruits;

    protected net.skirnir.freyja.render.html.RadioInputTags radioInputTags;


    public FormDtoBase() {
    }

    public FormDtoBase(String fruits, net.skirnir.freyja.render.html.RadioInputTags radioInputTags) {
        this.fruits = fruits;
        this.radioInputTags = radioInputTags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("fruits="), fruits).append(", ");
        append(sb.append("radioInputTags="), radioInputTags);
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

    public net.skirnir.freyja.render.html.RadioInputTags getRadioInputTags() {
        return this.radioInputTags;
    }

    public void setRadioInputTags(net.skirnir.freyja.render.html.RadioInputTags radioInputTags) {
        this.radioInputTags = radioInputTags;
    }
}
