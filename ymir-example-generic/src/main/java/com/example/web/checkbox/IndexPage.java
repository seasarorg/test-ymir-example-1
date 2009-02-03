package com.example.web.checkbox;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.CheckboxInputTags;
import net.skirnir.freyja.render.html.InputTag;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;

public class IndexPage extends IndexPageBase {
    @Invoke(Phase.PAGECOMPONENT_CREATED)
    public void initialize() {
        // チェックボックスのモデルであるCheckboxInputTagsの準備をします。
        // この準備はリクエストパラメータのポピュレートの前に行なう必要があるため、
        // @InvokeアノテーションにPhase.PAGECOMPONENT_CREATEDを指定しています。

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

        getForm().setCheckboxInputTags(new CheckboxInputTags(list));
    }

    @Override
    public void setFruits(String[] fruits) {
        super.setFruits(fruits);

        // リクエストパラメータをCheckboxInputTagsオブジェクトにセットして
        // チェックボックスの状態を更新します。
        getForm().getCheckboxInputTags().setValues(fruits);
    }

    @Override
    public void _prerender() {
        // 選択されているチェックボックスの名前をビューDTOに設定します。

        List<String> names = new ArrayList<String>();
        for (InputTag tag : getForm().getCheckboxInputTags().getCheckedInputs()) {
            names.add(tag.getContentAsString());
        }
        getView().setNames(names);
    }
}
