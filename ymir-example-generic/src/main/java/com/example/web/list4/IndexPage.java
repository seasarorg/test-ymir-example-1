package com.example.web.list4;

import java.util.List;

import org.seasar.ymir.Phase;
import org.seasar.ymir.annotation.Invoke;
import org.seasar.ymir.scope.annotation.Inject;

import com.example.dto.list4.FruitCandidateDto;
import com.example.logic.list4.FruitLogic;

public class IndexPage extends IndexPageBase {
    private FruitLogic logic;

    @Inject
    public void setLogic(FruitLogic logic) {
        this.logic = logic;
    }

    @Invoke(Phase.OBJECT_INJECTED)
    public void initialize() {
        // FruitCandidateDtoをフォームに設定しておきます。
        // _prerender()で行なわないのは、初期表示の設定をリクエストパラメータのポピュレートよりも先に行なう必要があるからです。

        List<FruitCandidateDto> fruitDtoList = fruitCandidateConverter
                .toDtoList(logic.getFruitList());

        // チェック状態を初期化する場合はここでします。
        fruitDtoList.get(0).setSelected(true);

        getForm().getFruitSelector().setCandidateList(fruitDtoList);
    }

    @Override
    public void _prerender() {
        // 選択されたエントリだけをビューに格納します。
        List<FruitCandidateDto> fruitCandidateDtoList = getForm()
                .getFruitSelector().getSelectedCandidateList();
        getView().setFruitCandidates(fruitCandidateDtoList);
    }
}
