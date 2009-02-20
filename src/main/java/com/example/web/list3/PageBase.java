package com.example.web.list3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.dto.list3.EntryDto;

public class PageBase {
    private static final List<EntryDto> ENTRIES = new ArrayList<EntryDto>(
            Arrays.asList(new EntryDto[] { new EntryDto("りんご"),
                    new EntryDto("ぶどう"), new EntryDto("すいか"),
                    new EntryDto("もも"), new EntryDto("バナナ"), }));

    List<EntryDto> getList() {
        return new ArrayList<EntryDto>(ENTRIES);
    }
}
