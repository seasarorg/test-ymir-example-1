package com.example.dto.select;

import java.io.Serializable;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select/index.html")
    protected net.skirnir.freyja.render.html.Select fruitsSelect = new net.skirnir.freyja.render.html.Select();


    public FormDtoBase() {
    }

    public FormDtoBase(net.skirnir.freyja.render.html.Select fruitsSelect) {
        this.fruitsSelect = fruitsSelect;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("fruitsSelect="), fruitsSelect);
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

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select/index.html")
    public net.skirnir.freyja.render.html.Select getFruitsSelect() {
        return this.fruitsSelect;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/select/index.html")
    public void setFruitsSelect(net.skirnir.freyja.render.html.Select fruitsSelect) {
        this.fruitsSelect = fruitsSelect;
    }
}
