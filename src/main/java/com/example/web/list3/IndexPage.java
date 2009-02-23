package com.example.web.list3;

import java.util.ArrayList;
import java.util.List;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;

import com.example.dto.list3.EntryDto;

public class IndexPage extends IndexPageBase {
    @Invoke(Phase.OBJECT_INJECTED)
    public void initialize() {
        // 初期値をフォームに設定しておきます。
        getEntries().addAll(getList());
    }

    @Override
    public void _get() {
        // 初期表示でチェックをつけておきたい場合はここで行ないます。
        // initialize()でやってしまうと、初期表示以外でもチェックが残ってしまいます。
        getEntries().get(0).setChecked(true);
    }

    @Override
    public void _prerender() {
        // 選択されたエントリだけをビューに格納します。
        List<EntryDto> entries = new ArrayList<EntryDto>();
        for (EntryDto entry : getEntries()) {
            if (entry.isChecked()) {
                entries.add(entry);
            }
        }
        getView().setEntries(entries);
    }
}
