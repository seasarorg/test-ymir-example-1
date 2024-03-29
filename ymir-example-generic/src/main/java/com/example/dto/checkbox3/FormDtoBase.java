package com.example.dto.checkbox3;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    protected boolean drinking;

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    protected boolean gambling;

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    protected boolean smoking;


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
        append(sb.append("drinking="), drinking).append(", ");
        append(sb.append("gambling="), gambling).append(", ");
        append(sb.append("smoking="), smoking);
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

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public boolean isDrinking() {
        return this.drinking;
    }

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public void setDrinking(boolean drinking) {
        this.drinking = drinking;
    }

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public boolean isGambling() {
        return this.gambling;
    }

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public void setGambling(boolean gambling) {
        this.gambling = gambling;
    }

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public boolean isSmoking() {
        return this.smoking;
    }

    @Meta(name = "bornOf", value = "/checkbox3/index.html")
    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }
}
