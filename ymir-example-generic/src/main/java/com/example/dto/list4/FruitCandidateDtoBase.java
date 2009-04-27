package com.example.dto.list4;

import java.io.Serializable;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.render.Candidate;
import org.seasar.ymir.render.Selector;

@Meta(name = "conversion", value = "com.example.dao.list4.Fruit")
public class FruitCandidateDtoBase
    implements Serializable, Candidate {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected String value;

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected boolean selected;

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected String name;

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected Selector fruitCountSelector = new org.seasar.ymir.render.Selector();


    public FruitCandidateDtoBase() {
    }

    public FruitCandidateDtoBase(Selector fruitCountSelector, String name, boolean selected, String value) {
        this.fruitCountSelector = fruitCountSelector;
        this.name = name;
        this.selected = selected;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("value="), value).append(", ");
        append(sb.append("selected="), selected).append(", ");
        append(sb.append("name="), name).append(", ");
        append(sb.append("fruitCountSelector="), fruitCountSelector);
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

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public String getValue() {
        return this.value;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public void setValue(String value) {
        this.value = value;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public boolean isSelected() {
        return this.selected;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public void setName(String name) {
        this.name = name;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public Selector getFruitCountSelector() {
        return this.fruitCountSelector;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public void setFruitCountSelector(Selector fruitCountSelector) {
        this.fruitCountSelector = fruitCountSelector;
    }
}
