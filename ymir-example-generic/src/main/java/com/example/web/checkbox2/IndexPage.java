package com.example.web.checkbox2;

import java.util.ArrayList;
import java.util.List;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        // 選択されているチェックボックスの名前をビューDTOに設定します。

        List<String> list = new ArrayList<String>();

        if (getForm().getSmokingInput().isChecked()) {
            list.add(getForm().getSmokingInput().getContentAsString());
        }
        if (getForm().getDrinkingInput().isChecked()) {
            list.add(getForm().getDrinkingInput().getContentAsString());
        }
        if (getForm().getGamblingInput().isChecked()) {
            list.add(getForm().getGamblingInput().getContentAsString());
        }

        getView().setAttributes(list);
    }
}
