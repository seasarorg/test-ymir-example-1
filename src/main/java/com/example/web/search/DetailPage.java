package com.example.web.search;

import org.seasar.ymir.Response;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.conversation.annotation.Conversation;
import org.seasar.ymir.conversation.annotation.End;

//詳細画面のためのカンバセーション指定です。
@Conversation(name = "detail")
public class DetailPage extends DetailPageBase {
    // 初期表示のためのアクションです。
    // 基本的に、IndexPage#_get_detail()から遷移してきます。
    @Begin
    @Override
    public void _get() {
    }

    // 詳細画面から検索画面に戻るためのアクションです。
    // 検索画面以外から詳細画面に遷移するような実装にした場合は、自動的に元のカンバセーションの@BeginSubConversationの
    // reenter属性で指定した遷移先に復帰します。
    @End
    @Override
    public Response _get_back() {
        // ダミーです。
        // 元のカンバセーションの@BeginSubConversationのreenter属性で指定した値に置き換えられます。
        return null;
    }

    @Override
    public void _prerender() {
        // 指定されたidに対応するエントリを取り出してDTOにコピーします。
        detailViewConverter
                .copyEntityToDto(entryLogic.get(id), getDetailView());
    }
}
