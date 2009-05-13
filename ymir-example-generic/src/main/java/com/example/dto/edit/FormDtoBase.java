package com.example.dto.edit;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.render.html.Select;

@Meta(name = "conversion", value = "com.example.dao.edit.Product")
public class FormDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = {"/edit/confirm.html", "/edit/input.html"})
    protected String description;

    @Meta(name = "bornOf", value = {"/edit/confirm.html", "/edit/input.html"})
    protected String name;

    @Meta(name = "bornOf", value = "/edit/input.html")
    protected Select productTypeSelect = new Select();


    public FormDtoBase() {
    }

    public FormDtoBase(String description, String name, Select productTypeSelect) {
        this.description = description;
        this.name = name;
        this.productTypeSelect = productTypeSelect;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("description="), description).append(", ");
        append(sb.append("name="), name).append(", ");
        append(sb.append("productTypeSelect="), productTypeSelect);
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

    @Meta(name = "bornOf", value = {"/edit/confirm.html", "/edit/input.html"})
    public String getDescription() {
        return this.description;
    }

    @Meta(name = "bornOf", value = {"/edit/confirm.html", "/edit/input.html"})
    public void setDescription(String description) {
        this.description = description;
    }

    @Meta(name = "bornOf", value = {"/edit/confirm.html", "/edit/input.html"})
    public String getName() {
        return this.name;
    }

    @Meta(name = "bornOf", value = {"/edit/confirm.html", "/edit/input.html"})
    public void setName(String name) {
        this.name = name;
    }

    @Meta(name = "bornOf", value = "/edit/input.html")
    public Select getProductTypeSelect() {
        return this.productTypeSelect;
    }

    @Meta(name = "bornOf", value = "/edit/input.html")
    public void setProductTypeSelect(Select productTypeSelect) {
        this.productTypeSelect = productTypeSelect;
    }
}
