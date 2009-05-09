package com.example.web.checkbox;

import java.util.ArrayList;
import java.util.List;

import com.example.dto.checkbox.FruitCandidateDto;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        // チェックボックスのモデルであるFruitCandidateDtoの準備をします。

        List<FruitCandidateDto> list = new ArrayList<FruitCandidateDto>();

        list.add(new FruitCandidateDto("apple", "りんご"));
        list.add(new FruitCandidateDto("orange", "みかん"));
        list.add(new FruitCandidateDto("grape", "ぶどう"));

        getForm().getFruitSelector().setCandidateList(list);

        // 選択されているチェックボックスの名前をビューDTOに設定します。

        List<String> nameList = new ArrayList<String>();
        List<FruitCandidateDto> dtoList = getForm().getFruitSelector()
                .getSelectedCandidateList();
        for (FruitCandidateDto dto : dtoList) {
            nameList.add(dto.getName());
        }
        getView().setNames(nameList);
    }
}
