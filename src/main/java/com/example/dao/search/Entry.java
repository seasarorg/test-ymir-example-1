package com.example.dao.search;

public class Entry implements Cloneable {
    private Integer id;

    private String name;

    public Entry() {
    }

    public Entry(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
