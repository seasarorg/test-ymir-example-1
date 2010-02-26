package com.example.dto.paging;

import java.io.Serializable;

public class EntityDto extends EntityDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    public EntityDto() {
    }

    public EntityDto(String description, Integer id, String name) {
        super(description, id, name);
    }
}
