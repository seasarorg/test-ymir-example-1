package com.example.logic.list4;

import java.util.Arrays;
import java.util.List;

import com.example.dao.list4.Fruit;

public class FruitLogic {
    public List<Fruit> getFruitList() {
        return Arrays.asList(new Fruit(1, "りんご", 1), new Fruit(2, "ぶどう", 2),
                new Fruit(3, "すいか", 1), new Fruit(4, "もも", 2), new Fruit(5,
                        "バナナ", 1));
    }
}
