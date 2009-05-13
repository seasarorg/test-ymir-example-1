package com.example.dto.checkbox2;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.render.html.Input;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected Input drinkingInput = new Input();

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected Input gamblingInput = new Input();

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    protected Input smokingInput = new Input();


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
        append(sb.append("drinkingInput="), drinkingInput).append(", ");
        append(sb.append("gamblingInput="), gamblingInput).append(", ");
        append(sb.append("smokingInput="), smokingInput);
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

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public Input getDrinkingInput() {
        return this.drinkingInput;
    }

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public Input getGamblingInput() {
        return this.gamblingInput;
    }

    @Meta(name = "bornOf", value = "/checkbox2/index.html")
    public Input getSmokingInput() {
        return this.smokingInput;
    }
}
