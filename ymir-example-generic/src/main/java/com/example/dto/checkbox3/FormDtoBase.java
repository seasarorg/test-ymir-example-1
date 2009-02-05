package com.example.dto.checkbox3;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected boolean drinking;

    protected boolean gambling;

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

    public boolean isDrinking() {
        return this.drinking;
    }

    public void setDrinking(boolean drinking) {
        this.drinking = drinking;
    }

    public boolean isGambling() {
        return this.gambling;
    }

    public void setGambling(boolean gambling) {
        this.gambling = gambling;
    }

    public boolean isSmoking() {
        return this.smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }
}
