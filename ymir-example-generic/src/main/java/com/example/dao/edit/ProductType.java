package com.example.dao.edit;

public enum ProductType {
    STANDARD(0), SPECIAL(1);

    private int id;

    private ProductType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ProductType enumOf(Integer id) {
        if (id == null) {
            return null;
        }
        for (ProductType enm : values()) {
            if (id.intValue() == enm.getId()) {
                return enm;
            }
        }
        return null;
    }
}
