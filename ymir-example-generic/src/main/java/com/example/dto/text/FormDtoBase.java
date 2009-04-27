package com.example.dto.text;

import java.io.Serializable;
import java.util.Date;

import org.seasar.ymir.annotation.Meta;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/update/input.html")
    protected Date date1;

    @Meta(name = "bornOf", value = "/update/input.html")
    protected Date date2;


    public FormDtoBase() {
    }

    public FormDtoBase(Date date1, Date date2) {
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

    @Meta(name = "bornOf", value = "/update/input.html")
    public Date getDate1() {
        return this.date1;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public Date getDate2() {
        return this.date2;
    }

    @Meta(name = "bornOf", value = "/update/input.html")
    public void setDate2(Date date2) {
        this.date2 = date2;
    }
}
