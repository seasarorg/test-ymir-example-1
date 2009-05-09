package com.example.dto.checkbox;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.render.Selector;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/checkbox/index.html")
    protected Selector fruitSelector = new Selector();


    public FormDtoBase() {
    }

    public FormDtoBase(Selector fruitSelector) {
        this.fruitSelector = fruitSelector;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("fruitSelector="), fruitSelector);
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

    @Meta(name = "bornOf", value = "/checkbox/index.html")
    public Selector getFruitSelector() {
        return this.fruitSelector;
    }
}
