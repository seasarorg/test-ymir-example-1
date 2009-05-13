package com.example.dto.list4;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.render.AbstractCandidate;
import org.seasar.ymir.render.Candidate;
import org.seasar.ymir.render.Selector;

@Meta(name = "conversion", value = "com.example.dao.list4.Fruit")
public class FruitCandidateDtoBase extends AbstractCandidate
    implements Serializable, Candidate {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected Selector fruitCountSelector = new Selector();

    @Meta(name = "bornOf", value = "/list4/index.html")
    protected String name;


    public FruitCandidateDtoBase() {
    }

    public FruitCandidateDtoBase(Selector fruitCountSelector, String name) {
        this.fruitCountSelector = fruitCountSelector;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        sb.append(super.toString()).append(", ");
        append(sb.append("fruitCountSelector="), fruitCountSelector).append(", ");
        append(sb.append("name="), name);
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

    @Meta(name = "bornOf", value = "/list4/index.html")
    public Selector getFruitCountSelector() {
        return this.fruitCountSelector;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public void setFruitCountSelector(Selector fruitCountSelector) {
        this.fruitCountSelector = fruitCountSelector;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = "/list4/index.html")
    public void setName(String name) {
        this.name = name;
    }
}
