package com.example.dao.update;

public class Entity {
    private String furigana;

    private Integer id;

    private String name;

    public Entity() {
    }

    public Entity(String furigana, Integer id, String name) {
        this.furigana = furigana;
        this.id = id;
        this.name = name;
    }

    public String getFurigana() {
        return furigana;
    }

    public void setFurigana(String furigana) {
        this.furigana = furigana;
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
