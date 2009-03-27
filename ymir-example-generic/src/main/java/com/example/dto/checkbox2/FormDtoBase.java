package com.example.dto.checkbox2;

import java.io.Serializable;

public class FormDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected net.skirnir.freyja.render.html.Input smokingInput = new net.skirnir.freyja.render.html.Input();

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected net.skirnir.freyja.render.html.Input drinkingInput = new net.skirnir.freyja.render.html.Input();

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected net.skirnir.freyja.render.html.Input gamblingInput = new net.skirnir.freyja.render.html.Input();

    public FormDtoBase() {
    }

    public FormDtoBase(net.skirnir.freyja.render.html.Input drinkingInput,
            net.skirnir.freyja.render.html.Input gamblingInput,
            net.skirnir.freyja.render.html.Input smokingInput) {
        this.drinkingInput = drinkingInput;
        this.gamblingInput = gamblingInput;
        this.smokingInput = smokingInput;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("smokingInput="), smokingInput).append(", ");
        append(sb.append("drinkingInput="), drinkingInput).append(", ");
        append(sb.append("gamblingInput="), gamblingInput);
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

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    public net.skirnir.freyja.render.html.Input getSmokingInput() {
        return this.smokingInput;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    public net.skirnir.freyja.render.html.Input getDrinkingInput() {
        return this.drinkingInput;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/checkbox2/index.html")
    public net.skirnir.freyja.render.html.Input getGamblingInput() {
        return this.gamblingInput;
    }
}
