package com.example.dto.list2;

import java.io.Serializable;

public class EntryDto extends EntryDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    public EntryDto() {
    }

    public EntryDto(Integer id, String name) {
        super(id, name);
    }
}
