package com.example.web.list2;

import org.seasar.ymir.Phase;
import org.seasar.ymir.Response;
import org.seasar.ymir.annotation.Invoke;

public class IndexPage extends IndexPageBase {
    @Invoke(Phase.OBJECT_INJECTED)
    public void initialize() {
        // 初期値をフォームに設定しておきます。
        getEntries().addAll(getList());
    }

    @Override
    public void _get() {
        // 結果表示を空にするためにこうする必要があります。
        getView().setEntry(null);
    }

    @Override
    public Response _post_update(int index) {
        // indexに押されたボタンの添え字が入ってきます。
        getView().setEntry(getEntries().get(index));

        return super._post_update(index);
    }
}
