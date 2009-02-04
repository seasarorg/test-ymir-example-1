package com.example.web.radio;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.InputTag;
import net.skirnir.freyja.render.html.RadioInputTags;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;

public class IndexPage extends IndexPageBase {
    @Invoke(Phase.PAGECOMPONENT_CREATED)
    public void initialize() {
        // ラジオボタンのモデルであるRadioInputTagsの準備をします。
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

        getForm().setRadioInputTags(new RadioInputTags(list));
    }

    @Override
    public void setFruits(String fruits) {
        super.setFruits(fruits);

        // リクエストパラメータをRadioInputTagsオブジェクトにセットして
        // ラジオボタンの状態を更新します。
        getForm().getRadioInputTags().setValue(fruits);
    }

    @Override
    public void _prerender() {
        // 選択されているラジオボタンの名前をビューDTOに設定します。
        getView().setName(getForm().getRadioInputTags().getCheckedContent());
    }
}
