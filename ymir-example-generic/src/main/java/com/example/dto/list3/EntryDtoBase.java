package com.example.dto.list3;

import java.io.Serializable;

public class EntryDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    protected boolean checked;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    protected String name;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    protected net.skirnir.freyja.render.html.Radio radio = new net.skirnir.freyja.render.html.Radio();


    public EntryDtoBase() {
    }

    public EntryDtoBase(boolean checked, String name, net.skirnir.freyja.render.html.Radio radio) {
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

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    public boolean isChecked() {
        return this.checked;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    public String getName() {
        return this.name;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    public void setName(String name) {
        this.name = name;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    public net.skirnir.freyja.render.html.Radio getRadio() {
        return this.radio;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list3/index.html")
    public void setRadio(net.skirnir.freyja.render.html.Radio radio) {
        this.radio = radio;
    }
}
