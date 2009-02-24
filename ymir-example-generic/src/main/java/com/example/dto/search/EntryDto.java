package com.example.dto.search;

import java.io.Serializable;

public class EntryDto extends EntryDtoBase implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    public EntryDto() {
    }

    public EntryDto(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
