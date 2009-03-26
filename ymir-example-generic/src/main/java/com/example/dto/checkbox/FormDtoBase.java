package com.example.dto.checkbox;

import java.io.Serializable;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected net.skirnir.freyja.render.html.CheckboxInputTags checkboxInputTags = new net.skirnir.freyja.render.html.CheckboxInputTags();

    protected String[] fruits = new String[0];

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")
    protected net.skirnir.freyja.render.html.CheckboxInputTags fruitsCheckboxInputTags = new net.skirnir.freyja.render.html.CheckboxInputTags();


    public FormDtoBase() {
    }

    public FormDtoBase(net.skirnir.freyja.render.html.CheckboxInputTags checkboxInputTags, String[] fruits, net.skirnir.freyja.render.html.CheckboxInputTags fruitsCheckboxInputTags) {
        this.checkboxInputTags = checkboxInputTags;
        this.fruits = fruits;
        this.fruitsCheckboxInputTags = fruitsCheckboxInputTags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("checkboxInputTags="), checkboxInputTags).append(", ");
        append(sb.append("fruits="), fruits).append(", ");
        append(sb.append("fruitsCheckboxInputTags="), fruitsCheckboxInputTags);
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

    public net.skirnir.freyja.render.html.CheckboxInputTags getCheckboxInputTags() {
        return this.checkboxInputTags;
    }

    public void setCheckboxInputTags(net.skirnir.freyja.render.html.CheckboxInputTags checkboxInputTags) {
        this.checkboxInputTags = checkboxInputTags;
    }

    public String[] getFruits() {
        return this.fruits;
    }

    public void setFruits(String[] fruits) {
        this.fruits = fruits;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox/index.html")
    public net.skirnir.freyja.render.html.CheckboxInputTags getFruitsCheckboxInputTags() {
        return this.fruitsCheckboxInputTags;
    }
}
