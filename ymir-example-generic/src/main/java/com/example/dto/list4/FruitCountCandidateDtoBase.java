package com.example.dto.list4;

import java.io.Serializable;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.render.Candidate;

public class FruitCountCandidateDtoBase
    implements Serializable, Candidate {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected String value;

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected boolean selected;

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected String label;


    public FruitCountCandidateDtoBase() {
    }

    public FruitCountCandidateDtoBase(String label, boolean selected, String value) {
        this.label = label;
        this.selected = selected;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("value="), value).append(", ");
        append(sb.append("selected="), selected).append(", ");
        append(sb.append("label="), label);
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

    @Meta(name = "bornOf", value = "/list4/index.html")
    public String getValue() {
        return this.value;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public void setValue(String value) {
        this.value = value;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public boolean isSelected() {
        return this.selected;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public String getLabel() {
        return this.label;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public void setLabel(String label) {
        this.label = label;
    }
}
