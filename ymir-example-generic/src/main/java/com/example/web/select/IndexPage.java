package com.example.web.select;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.OptionTag;
import net.skirnir.freyja.render.html.SelectTag;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;

public class IndexPage extends IndexPageBase {
    private static final String VALUE_UNSELECTED = "";

    @Invoke(Phase.PAGECOMPONENT_CREATED)
    public void initialize() {
        // ドロップダウンリストのモデルであるSelectTagの準備をします。
        // この準備はリクエストパラメータのポピュレートの前に行なう必要があるため、
        // @InvokeアノテーションにPhase.PAGECOMPONENT_CREATEDを指定しています。

        List<OptionTag> list = new ArrayList<OptionTag>();

        OptionTag option = new OptionTag();
        option.setValue(VALUE_UNSELECTED).setContent("-選択して下さい-");
        list.add(option);

        option = new OptionTag();
        option.setValue("apple").setContent("りんご");
        list.add(option);

        option = new OptionTag();
        option.setValue("orange").setContent("みかん");
        list.add(option);

        option = new OptionTag();
        option.setValue("grape").setContent("ぶどう");
        list.add(option);

        getForm().setSelectTag(new SelectTag(list));
    }

    @Override
    public void setFruits(String fruits) {
        super.setFruits(fruits);

        // リクエストパラメータをSelectTagオブジェクトにセットして
        // ドロップダウンリストの状態を更新します。
        getForm().getSelectTag().setValues(fruits);
    }

    @Override
    public void _prerender() {
        // 選択されているドロップダウンリストの名前をビューDTOに設定します。

        for (OptionTag tag : getForm().getSelectTag().getSelectedOptions()) {
            if (!VALUE_UNSELECTED.equals(tag.getValue())) {
                getView().setName(tag.getContentAsString());
            }
        }
    }
}
