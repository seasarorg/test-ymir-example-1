package com.example.web.select2;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import org.seasar.ymir.render.html.Option;

public class IndexPage extends IndexPageBase {
    @Override
    public void _prerender() {
        // 複数選択可能なリストボックスのモデルであるSelectの準備をします。

        List<Option> options = new ArrayList<Option>();

        Option option = new Option();
        option.setValue("apple").setContent("りんご");
        options.add(option);

        option = new Option();
        option.setValue("orange").setContent("みかん");
        options.add(option);

        option = new Option();
        option.setValue("grape").setContent("ぶどう");
        options.add(option);

        option = new Option();
        option.setValue("peach").setContent("もも");
        options.add(option);

        getForm().getFruitsSelect().setOptions(options);

        // 選択されているオプションの名前をビューDTOに設定します。
        getView().setNames(
                asList(getForm().getFruitsSelect().getSelectedContents()));
    }
}
