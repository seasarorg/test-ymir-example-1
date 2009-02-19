package com.example.web.list;

import com.example.dto.list.EntryDto;

public class DetailPage extends DetailPageBase {
    @Override
    public void _prerender() {
        for (EntryDto dto : getList()) {
            if (dto.getId().equals(id)) {
                entry = dto;
                break;
            }
        }
    }
}
