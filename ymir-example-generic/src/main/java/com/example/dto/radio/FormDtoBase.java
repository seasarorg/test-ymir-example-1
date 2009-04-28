package com.example.dto.radio;

import java.io.Serializable;

import net.skirnir.freyja.render.html.Radio;
import org.seasar.ymir.annotation.Meta;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/radio/index.html")
    protected Radio fruitsRadio = new Radio();


    public FormDtoBase() {
    }

    public FormDtoBase(Radio fruitsRadio) {
        this.fruitsRadio = fruitsRadio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("fruitsRadio="), fruitsRadio);
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

    @Meta(name = "bornOf", value = "/radio/index.html")
    public Radio getFruitsRadio() {
        return this.fruitsRadio;
    }
}
