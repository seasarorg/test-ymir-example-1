package com.example.dto.list4;

import java.io.Serializable;

public class EntryDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    protected String value;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    protected boolean selected;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    protected String name;

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    protected org.seasar.ymir.render.Selector subEntrySelector;


    public EntryDtoBase() {
    }

    public EntryDtoBase(String name, boolean selected, org.seasar.ymir.render.Selector subEntrySelector, String value) {
        this.name = name;
        this.selected = selected;
        this.subEntrySelector = subEntrySelector;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("value="), value).append(", ");
        append(sb.append("selected="), selected).append(", ");
        append(sb.append("name="), name).append(", ");
        append(sb.append("subEntrySelector="), subEntrySelector);
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

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public String getValue() {
        return this.value;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public void setValue(String value) {
        this.value = value;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public boolean isSelected() {
        return this.selected;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public String getName() {
        return this.name;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public void setName(String name) {
        this.name = name;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public org.seasar.ymir.render.Selector getSubEntrySelector() {
        return this.subEntrySelector;
    }

    @org.seasar.ymir.annotation.Meta(name = "bornOf", value = "/list4/index.html")
    public void setSubEntrySelector(org.seasar.ymir.render.Selector subEntrySelector) {
        this.subEntrySelector = subEntrySelector;
    }
}
