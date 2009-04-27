package com.example.dto.text;

import java.io.Serializable;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected java.util.Date date1;

    protected java.util.Date date2;


    public FormDtoBase() {
    }

    public FormDtoBase(java.util.Date date1, java.util.Date date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("date1="), date1).append(", ");
        append(sb.append("date2="), date2);
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

    public java.util.Date getDate1() {
        return this.date1;
    }

    public void setDate1(java.util.Date date1) {
        this.date1 = date1;
    }

    public java.util.Date getDate2() {
        return this.date2;
    }

    public void setDate2(java.util.Date date2) {
        this.date2 = date2;
    }
}
