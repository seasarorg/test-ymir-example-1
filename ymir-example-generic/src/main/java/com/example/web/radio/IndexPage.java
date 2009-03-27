package com.example.web.radio;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.Input;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        // ラジオボタンのモデルであるRadioの準備をします。

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

        getForm().getFruitsRadio().setInputs(list);

        // 選択されているラジオボタンの名前をビューDTOに設定します。
        getView().setName(getForm().getFruitsRadio().getCheckedContent());
    }
}
