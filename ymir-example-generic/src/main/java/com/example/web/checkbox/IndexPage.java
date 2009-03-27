package com.example.web.checkbox;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.Input;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        // チェックボックスのモデルであるCheckboxInputTagsの準備をします。

        List<Input> list = new ArrayList<Input>();

        Input input = new Input();
        input.setInputValue("apple").setContent("りんご");
        list.add(input);

        input = new Input();
        input.setInputValue("orange").setContent("みかん");
        list.add(input);

        input = new Input();
        input.setInputValue("grape").setContent("ぶどう");
        list.add(input);

        getForm().getFruitsCheckbox().setInputs(list);

        // 選択されているチェックボックスの名前をビューDTOに設定します。

        getView().setNames(
                asList(getForm().getFruitsCheckbox().getCheckedContents()));
    }
}
