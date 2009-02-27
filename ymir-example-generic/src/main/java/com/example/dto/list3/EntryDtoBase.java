package com.example.dto.list3;

import java.io.Serializable;

public class EntryDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected boolean checked;

    protected String name;

    protected net.skirnir.freyja.render.html.RadioInputTags radioInputTags;


    public EntryDtoBase() {
    }

    public EntryDtoBase(boolean checked, String name, net.skirnir.freyja.render.html.RadioInputTags radioInputTags) {
        this.checked = checked;
        this.name = name;
        this.radioInputTags = radioInputTags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("checked="), checked).append(", ");
        append(sb.append("name="), name).append(", ");
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

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public net.skirnir.freyja.render.html.RadioInputTags getRadioInputTags() {
        return this.radioInputTags;
    }

    public void setRadioInputTags(net.skirnir.freyja.render.html.RadioInputTags radioInputTags) {
        this.radioInputTags = radioInputTags;
    }
}