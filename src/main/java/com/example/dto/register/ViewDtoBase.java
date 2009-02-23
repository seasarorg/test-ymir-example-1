package com.example.dto.register;

import java.io.Serializable;

public class ViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected com.example.dto.register.FormDto form = new com.example.dto.register.FormDto();


    public ViewDtoBase() {
    }

    public ViewDtoBase(com.example.dto.register.FormDto form) {
        this.form = form;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("form="), form);
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

    public com.example.dto.register.FormDto getForm() {
        return this.form;
    }

    public void setForm(com.example.dto.register.FormDto form) {
        this.form = form;
    }
}
