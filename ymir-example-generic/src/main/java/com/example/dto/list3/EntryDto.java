package com.example.dto.list3;

import java.io.Serializable;

import net.skirnir.freyja.render.html.InputTag;
import net.skirnir.freyja.render.html.RadioInputTags;

public class EntryDto extends EntryDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;

    public EntryDto() {
    }

    public EntryDto(String name) {
        super(false, name, new RadioInputTags(new InputTag[] {
                new InputTag(1, "1つ"), new InputTag(2, "2つ"),
                new InputTag(3, "3つ"), }).setValue(1));
    }

    public EntryDto(String name, RadioInputTags radioInputTags) {
        super(false, name, radioInputTags);
    }
}
