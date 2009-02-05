package com.example.web.checkbox2;

import java.util.ArrayList;
import java.util.List;

public class IndexPage extends IndexPageBase {
    @Override
    public void setSmoking(boolean smoking) {
        super.setSmoking(smoking);

        // リクエストパラメータをInputTagオブジェクトにセットして
        // チェックボックスの状態を更新します。
        getForm().getSmokingInputTag().setChecked(smoking);
    }

    @Override
    public void setDrinking(boolean drinking) {
        super.setDrinking(drinking);

        // リクエストパラメータをInputTagオブジェクトにセットして
        // チェックボックスの状態を更新します。
        getForm().getDrinkingInputTag().setChecked(drinking);
    }

    @Override
    public void setGambling(boolean gambling) {
        super.setGambling(gambling);

        // リクエストパラメータをInputTagオブジェクトにセットして
        // チェックボックスの状態を更新します。
        getForm().getGamblingInputTag().setChecked(gambling);
    }

    @Override
    public void _prerender() {
        // 選択されているチェックボックスの名前をビューDTOに設定します。

        List<String> list = new ArrayList<String>();

        if (getForm().getSmokingInputTag().isChecked()) {
            list.add(getForm().getSmokingInputTag().getContentAsString());
        }
        if (getForm().getDrinkingInputTag().isChecked()) {
            list.add(getForm().getDrinkingInputTag().getContentAsString());
        }
        if (getForm().getGamblingInputTag().isChecked()) {
            list.add(getForm().getGamblingInputTag().getContentAsString());
        }

        getView().setAttributes(list);
    }
}
