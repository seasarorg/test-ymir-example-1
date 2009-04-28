package com.example.dto.mailsender;

import java.io.Serializable;

import org.seasar.ymir.annotation.Meta;

public class MailDtoBase
    implements Serializable {
    private static final long serialVersionUID = 1L;

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    protected String to;

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    protected String text;


    public MailDtoBase() {
    }

    public MailDtoBase(String text, String to) {
        this.text = text;
        this.to = to;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append('(');
        append(sb.append("to="), to).append(", ");
        append(sb.append("text="), text);
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

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public String getTo() {
        return this.to;
    }

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public void setTo(String to) {
        this.to = to;
    }

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public String getText() {
        return this.text;
    }

    @Meta(name = "bornOf", value = "/mailsender/index.html")
    public void setText(String text) {
        this.text = text;
    }
}
