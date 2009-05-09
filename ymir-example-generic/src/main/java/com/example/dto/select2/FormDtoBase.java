package com.example.dto.select2;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.render.html.Select;

public class FormDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/select2/index.html")
    protected Select fruitsSelect = new Select();

    public FormDtoBase() {
    }

    public FormDtoBase(Select fruitsSelect) {
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
            int len = Array.getLength(obj);
            String delim = "";
            for (int i = 0; i < len; i++) {
                sb.append(delim);
                delim = ", ";
                append(sb, Array.get(obj, i));
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

    @Meta(name = "bornOf", value = "/select2/index.html")
    public Select getFruitsSelect() {
        return this.fruitsSelect;
    }

    @Meta(name = "bornOf", value = "/select2/index.html")
    public void setFruitsSelect(Select fruitsSelect) {
        this.fruitsSelect = fruitsSelect;
    }
}
