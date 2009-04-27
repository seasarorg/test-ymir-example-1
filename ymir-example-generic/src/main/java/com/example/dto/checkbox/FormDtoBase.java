package com.example.dto.checkbox;

import java.io.Serializable;

import net.skirnir.freyja.render.html.Checkbox;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/checkbox/index.html", "/update/input.html"})
    protected Checkbox fruitsCheckbox = new net.skirnir.freyja.render.html.Checkbox();


    public FormDtoBase() {
    }

    public FormDtoBase(Checkbox fruitsCheckbox) {
        this.fruitsCheckbox = fruitsCheckbox;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("fruitsCheckbox="), fruitsCheckbox);
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

    @Metas({@Meta(name = "bornOf", value = {"/checkbox/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public Checkbox getFruitsCheckbox() {
        return this.fruitsCheckbox;
    }
}
