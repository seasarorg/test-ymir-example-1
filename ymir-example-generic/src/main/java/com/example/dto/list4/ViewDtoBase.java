package com.example.dto.list4;

import java.io.Serializable;
import java.util.List;

import org.seasar.ymir.annotation.Meta;

public class ViewDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    protected List<FruitCandidateDto> fruitCandidates = new java.util.ArrayList<com.example.dto.list4.FruitCandidateDto>();


    public ViewDtoBase() {
    }

    public ViewDtoBase(List<FruitCandidateDto> fruitCandidates) {
        this.fruitCandidates = fruitCandidates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("fruitCandidates="), fruitCandidates);
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
    public List<FruitCandidateDto> getFruitCandidates() {
        return this.fruitCandidates;
    }

    @Meta(name = "bornOf", value = {"/list4/index.html", "/update/input.html"})
    public void setFruitCandidates(List<FruitCandidateDto> fruitCandidates) {
        this.fruitCandidates = fruitCandidates;
    }
}
