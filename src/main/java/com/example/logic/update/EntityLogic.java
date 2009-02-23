package com.example.logic.update;

import com.example.dao.update.Entity;
import com.example.update.EntityAlreadyDeletedRuntimeException;

public class EntityLogic {
    public Entity get(Integer id) {
        if (id.intValue() == 1) {
            return new Entity("ゆみるたろう", 1, "湯見太郎");
        } else {
            throw new EntityAlreadyDeletedRuntimeException();
        }
    }

    public void update(Entity entity) {
        // エンティティの更新処理を書きます。
    }
}
