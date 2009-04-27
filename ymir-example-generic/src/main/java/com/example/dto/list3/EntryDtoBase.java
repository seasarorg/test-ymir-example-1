package com.example.dto.list3;

import java.io.Serializable;

import net.skirnir.freyja.render.html.Radio;
import org.seasar.ymir.annotation.Meta;

public class EntryDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    protected boolean checked;

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    protected String name;

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    protected Radio radio = new net.skirnir.freyja.render.html.Radio();


    public EntryDtoBase() {
    }

    public EntryDtoBase(boolean checked, String name, Radio radio) {
        this.checked = checked;
        this.name = name;
        this.radio = radio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("checked="), checked).append(", ");
        append(sb.append("name="), name).append(", ");
        append(sb.append("radio="), radio);
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

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public boolean isChecked() {
        return this.checked;
    }

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public void setName(String name) {
        this.name = name;
    }

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public Radio getRadio() {
        return this.radio;
    }

    @Meta(name = "bornOf", value = {"/list3/index.html", "/update/input.html"})
    public void setRadio(Radio radio) {
        this.radio = radio;
    }
}
