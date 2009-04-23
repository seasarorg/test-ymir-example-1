package com.example.dao.list4;

public class Fruit {
    private Integer id;

    private String name;

    private Integer count;

    public Fruit() {
        this(null, null, null);
    }

    public Fruit(Integer id, String name) {
        this(id, name, null);
    }

    public Fruit(Integer id, String name, Integer count) {
        this.id = id;
        this.name = name;
        this.count = count;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
