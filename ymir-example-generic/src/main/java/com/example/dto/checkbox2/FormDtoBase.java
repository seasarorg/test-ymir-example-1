package com.example.dto.checkbox2;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    protected boolean drinking;

    protected net.skirnir.freyja.render.html.InputTag drinkingInputTag = new net.skirnir.freyja.render.html.InputTag();

    protected boolean gambling;

    protected net.skirnir.freyja.render.html.InputTag gamblingInputTag = new net.skirnir.freyja.render.html.InputTag();

    protected boolean smoking;

    protected net.skirnir.freyja.render.html.InputTag smokingInputTag = new net.skirnir.freyja.render.html.InputTag();


    public FormDtoBase() {
    }

    public FormDtoBase(boolean drinking, net.skirnir.freyja.render.html.InputTag drinkingInputTag, boolean gambling, net.skirnir.freyja.render.html.InputTag gamblingInputTag, boolean smoking, net.skirnir.freyja.render.html.InputTag smokingInputTag) {
        this.drinking = drinking;
        this.drinkingInputTag = drinkingInputTag;
        this.gambling = gambling;
        this.gamblingInputTag = gamblingInputTag;
        this.smoking = smoking;
        this.smokingInputTag = smokingInputTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("drinking="), drinking).append(", ");
        append(sb.append("drinkingInputTag="), drinkingInputTag).append(", ");
        append(sb.append("gambling="), gambling).append(", ");
        append(sb.append("gamblingInputTag="), gamblingInputTag).append(", ");
        append(sb.append("smoking="), smoking).append(", ");
        append(sb.append("smokingInputTag="), smokingInputTag);
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

    public net.skirnir.freyja.render.html.InputTag getDrinkingInputTag() {
        return this.drinkingInputTag;
    }

    public void setDrinkingInputTag(net.skirnir.freyja.render.html.InputTag drinkingInputTag) {
        this.drinkingInputTag = drinkingInputTag;
    }

    public boolean isGambling() {
        return this.gambling;
    }

    public void setGambling(boolean gambling) {
        this.gambling = gambling;
    }

    public net.skirnir.freyja.render.html.InputTag getGamblingInputTag() {
        return this.gamblingInputTag;
    }

    public void setGamblingInputTag(net.skirnir.freyja.render.html.InputTag gamblingInputTag) {
        this.gamblingInputTag = gamblingInputTag;
    }

    public boolean isSmoking() {
        return this.smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public net.skirnir.freyja.render.html.InputTag getSmokingInputTag() {
        return this.smokingInputTag;
    }

    public void setSmokingInputTag(net.skirnir.freyja.render.html.InputTag smokingInputTag) {
        this.smokingInputTag = smokingInputTag;
    }
}
