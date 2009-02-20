package com.example.web.list2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.dto.list2.EntryDto;

public class PageBase {
    private static final List<EntryDto> ENTRIES = new ArrayList<EntryDto>(
            Arrays.asList(new EntryDto[] { new EntryDto(1, "りんご"),
                    new EntryDto(2, "ぶどう"), new EntryDto(3, "すいか"),
                    new EntryDto(4, "もも"), new EntryDto(5, "バナナ"), }));

    List<EntryDto> getList() {
        return new ArrayList<EntryDto>(ENTRIES);
    }
}
