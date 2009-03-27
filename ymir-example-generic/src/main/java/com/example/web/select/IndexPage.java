package com.example.web.select;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.Option;

public class IndexPage extends IndexPageBase {
    private static final String VALUE_UNSELECTED = "";

    @Override
    public void _prerender() {
        // ドロップダウンリストのモデルであるSelectの準備をします。

        List<Option> list = new ArrayList<Option>();

        Option option = new Option();
        option.setValue(VALUE_UNSELECTED).setContent("-選択して下さい-");
        list.add(option);

        option = new Option();
        option.setValue("apple").setContent("りんご");
        list.add(option);

        option = new Option();
        option.setValue("orange").setContent("みかん");
        list.add(option);

        option = new Option();
        option.setValue("grape").setContent("ぶどう");
        list.add(option);

        getForm().getFruitsSelect().setOptions(list);

        // 選択されているドロップダウンリストの名前をビューDTOに設定します。

        for (Option tag : getForm().getFruitsSelect().getSelectedOptions()) {
            if (!VALUE_UNSELECTED.equals(tag.getValue())) {
                getView().setName(tag.getContentAsString());
            }
        }
    }
}
