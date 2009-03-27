package com.example.web.list3;

import java.util.ArrayList;
import java.util.List;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;

import com.example.dto.list3.EntryDto;

public class IndexPage extends IndexPageBase {
    @Invoke(Phase.OBJECT_INJECTED)
    public void initialize() {
        // entriesをフォームに設定しておきます。
        // _prerender()で行なわないのは、初期表示の設定を_get()で行なうためです。
        getForm().getEntries().addAll(getList());
    }

    @Override
    public void _get() {
        // 初期表示でチェックをつけておきたい場合はここで行ないます。

        // initialize()でやってしまうと、初期表示以外でもチェックが残ってしまいます。
        getForm().getEntries().get(0).setChecked(true);

        // ここではラジオボタンの初期値を設定しています。
        getForm().getEntries().get(0).getRadio().setCheckedValue(2);
    }

    @Override
    public void _prerender() {
        // 選択されたエントリだけをビューに格納します。
        List<EntryDto> entries = new ArrayList<EntryDto>();
        for (EntryDto entry : getForm().getEntries()) {
            if (entry.isChecked()) {
                entries.add(entry);
            }
        }
        getView().setEntries(entries);
    }
}
