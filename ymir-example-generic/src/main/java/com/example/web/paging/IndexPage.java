package com.example.web.paging;

import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.ymir.render.Paging;
import org.seasar.ymir.scope.annotation.Inject;

import com.example.dto.paging.EntityDto;
import com.example.logic.paging.EntityLogic;

public class IndexPage extends IndexPageBase {
    private static final int COUNT_BY_PAGE = 10;

    private EntityLogic entityLogic;

    @Inject
    public void setEntityLogic(EntityLogic entityLogic) {
        this.entityLogic = entityLogic;
    }

    @Override
    public Integer getP() {
        // パラメータ「p」はセットされないこともあるので、セットされていない場合はデフォルト値を
        // 返すようにしています。
        // なお「p」として数字以外の文字列が指定された場合はsetP(null)が呼び出されることに
        // 注意して下さい。そのため、例えばIndexPageのコンストラクタでpにデフォルト値を設定しておく
        // 方式はとらないようにして下さい。
        return p != null ? p : 1;
    }

    @Override
    public void _get() {
        PagingResultBean<EntityDto> bean = entityLogic.selectPage(
                COUNT_BY_PAGE, getP());
        // PagingResultBeanからページング情報を持つDtoを作成してフィールドにセットしておきます。
        paging = new Paging(bean);
        // PagingResultBeanから表示するエンティティのリストを取り出してフィールドにセットしておきます。
        entities = bean.getSelectedList();
    }
}
