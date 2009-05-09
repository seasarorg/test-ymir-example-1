package com.example.web.radio;

import java.util.ArrayList;
import java.util.List;

import com.example.dto.radio.FruitCandidateDto;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        // ラジオボタンのモデルであるRadioの準備をします。

        List<FruitCandidateDto> list = new ArrayList<FruitCandidateDto>();

        list.add(new FruitCandidateDto("apple", "りんご"));
        list.add(new FruitCandidateDto("orange", "みかん"));
        list.add(new FruitCandidateDto("grape", "ぶどう"));

        getForm().getFruitSelector().setCandidateList(list);

        // 選択されているラジオボタンの名前をビューDTOに設定します。
        FruitCandidateDto dto = getForm().getFruitSelector()
                .getSelectedCandidate();
        if (dto != null) {
            getView().setName(dto.getName());
        }
    }
}
