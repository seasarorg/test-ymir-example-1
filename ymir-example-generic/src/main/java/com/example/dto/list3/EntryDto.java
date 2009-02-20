package com.example.dto.list3;

import java.io.Serializable;

public class EntryDto extends EntryDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    public EntryDto() {
    }

    public EntryDto(String name) {
        super(false, name);
    }
}
