package com.example.dto.decorate;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Date;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.scope.annotation.RequestParameter;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/decorate/index.html")
    protected Date date;

    @Meta(name = "bornOf", value = "/decorate/index.html")
    protected Date date2;


    public FormDtoBase() {
    }

    public FormDtoBase(Date date, Date date2) {
        this.date = date;
        this.date2 = date2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("date="), date).append(", ");
        append(sb.append("date2="), date2);
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

    @Metas({@Meta(name = "bornOf", value = "/decorate/index.html"), @Meta(name = "formProperty", value = "form")})
    public Date getDate() {
        return this.date;
    }

    @Metas({@Meta(name = "bornOf", value = "/decorate/index.html"), @Meta(name = "formProperty", value = "form")})
    @RequestParameter
    public void setDate(Date date) {
        this.date = date;
    }

    @Meta(name = "bornOf", value = "/decorate/index.html")
    public Date getDate2() {
        return this.date2;
    }

    @Meta(name = "bornOf", value = "/decorate/index.html")
    public void setDate2(Date date2) {
        this.date2 = date2;
    }
}
