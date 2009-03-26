package com.example.web.checkbox;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.InputTag;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        // チェックボックスのモデルであるCheckboxInputTagsの準備をします。

        List<InputTag> list = new ArrayList<InputTag>();

        InputTag input = new InputTag();
        input.setValue("apple").setContent("りんご");
        list.add(input);

        input = new InputTag();
        input.setValue("orange").setContent("みかん");
        list.add(input);

        input = new InputTag();
        input.setValue("grape").setContent("ぶどう");
        list.add(input);

        getForm().getFruitsCheckboxInputTags().setInputs(list);

        // 選択されているチェックボックスの名前をビューDTOに設定します。

        getView().setNames(
                asList(getForm().getFruitsCheckboxInputTags()
                        .getCheckedContents()));
    }
}
