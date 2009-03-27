package com.example.dto.list3;

import java.io.Serializable;

import net.skirnir.freyja.render.html.Input;
import net.skirnir.freyja.render.html.Radio;

public class EntryDto extends EntryDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    public EntryDto() {
    }

    public EntryDto(String name) {
        super(false, name, new Radio(new Input[] { new Input(1, "1つ"),
                new Input(2, "2つ"), new Input(3, "3つ"), }).setCheckedValue(1));
    }

    public EntryDto(String name, Radio radio) {
        super(false, name, radio);
    }
}
