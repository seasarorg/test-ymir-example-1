package com.example.dto.list4;

import java.io.Serializable;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.annotation.Metas;
import org.seasar.ymir.render.Selector;
import org.seasar.ymir.scope.annotation.RequestParameter;

public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected Selector fruitSelector = new org.seasar.ymir.render.Selector();


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

    @Metas({@Meta(name = "formProperty", value = "form"), @Meta(name = "bornOf", value = "/list4/index.html")})
    @RequestParameter
    public Selector getFruitSelector() {
        return this.fruitSelector;
    }
}
