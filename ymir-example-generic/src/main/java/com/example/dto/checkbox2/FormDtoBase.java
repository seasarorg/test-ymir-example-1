package com.example.dto.checkbox2;

import java.io.Serializable;

import net.skirnir.freyja.render.html.Input;
import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    protected Input smokingInput = new net.skirnir.freyja.render.html.Input();

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    protected Input drinkingInput = new net.skirnir.freyja.render.html.Input();

    @Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"})
    protected Input gamblingInput = new net.skirnir.freyja.render.html.Input();


    public FormDtoBase() {
    }

    public FormDtoBase(Input drinkingInput, Input gamblingInput, Input smokingInput) {
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

    @Metas({@Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public Input getSmokingInput() {
        return this.smokingInput;
    }

    @Metas({@Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public Input getDrinkingInput() {
        return this.drinkingInput;
    }

    @Metas({@Meta(name = "bornOf", value = {"/checkbox2/index.html", "/update/input.html"}), @Meta(name = "formProperty", value = "form")})
    public Input getGamblingInput() {
        return this.gamblingInput;
    }
}
