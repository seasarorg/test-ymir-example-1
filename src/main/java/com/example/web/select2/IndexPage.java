package com.example.web.select2;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import net.skirnir.freyja.render.html.OptionTag;
import net.skirnir.freyja.render.html.SelectTag;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;

public class IndexPage extends IndexPageBase {
    @Invoke(Phase.PAGECOMPONENT_CREATED)
    public void initialize() {
        // 複数選択可能なリストボックスのモデルであるSelectTagの準備をします。
        // この準備はリクエストパラメータのポピュレートの前に行なう必要があるため、
        // @InvokeアノテーションにPhase.PAGECOMPONENT_CREATEDを指定しています。

        List<OptionTag> list = new ArrayList<OptionTag>();

        OptionTag option = new OptionTag();
        option.setValue("apple").setContent("りんご");
        list.add(option);

        option = new OptionTag();
        option.setValue("orange").setContent("みかん");
        list.add(option);

        option = new OptionTag();
        option.setValue("grape").setContent("ぶどう");
        list.add(option);

        option = new OptionTag();
        option.setValue("peach").setContent("もも");
        list.add(option);

        getForm().setSelectTag(new SelectTag(list));
    }

    @Override
    public void setFruits(String[] fruits) {
        super.setFruits(fruits);

        // リクエストパラメータをSelectTagオブジェクトにセットして
        // 複数選択可能なリストボックスの状態を更新します。
        getForm().getSelectTag().setValues(fruits);
    }

    @Override
    public void _prerender() {
        // 選択されているオプションの名前をビューDTOに設定します。
        getView().setNames(
                asList(getForm().getSelectTag().getSelectedContents()));
    }
}
