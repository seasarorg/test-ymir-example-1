package com.example.dto.checkbox3;

import java.io.Serializable;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})
    protected boolean smoking;

    @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})
    protected boolean drinking;

    @Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"})
    protected boolean gambling;


    public FormDtoBase() {
    }

    public FormDtoBase(boolean drinking, boolean gambling, boolean smoking) {
        this.drinking = drinking;
        this.gambling = gambling;
        this.smoking = smoking;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("smoking="), smoking).append(", ");
        append(sb.append("drinking="), drinking).append(", ");
        append(sb.append("gambling="), gambling);
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

    @Metas({@Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public boolean isSmoking() {
        return this.smoking;
    }

    @Metas({@Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    @Metas({@Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public boolean isDrinking() {
        return this.drinking;
    }

    @Metas({@Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public void setDrinking(boolean drinking) {
        this.drinking = drinking;
    }

    @Metas({@Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public boolean isGambling() {
        return this.gambling;
    }

    @Metas({@Meta(name = "bornOf", value = {"/checkbox3/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public void setGambling(boolean gambling) {
        this.gambling = gambling;
    }
}
