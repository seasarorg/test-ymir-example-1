package com.example.web.update;

import org.seasar.ymir.Response;
import org.seasar.ymir.conversation.annotation.Conversation;

import com.example.web.update.InputPageBase._get_retry;
import com.example.ymir.util.Redirect;

// 確認画面です。
// 確認画面は編集画面（input）だけから遷移してくるため、followAfterを"input"としています。
@Conversation(name = "update", phase = "confirm", followAfter = "input")
public class ConfirmPage extends ConfirmPageBase {
    // 「戻る」ボタンに対応するアクションです。
    // 戻った際にフォームの内容を初期化してしまわないよう、@Beginアノテーションのついてないアクション
    // （InputPage#_get_retry()）に遷移するようにしています。
    @Override
    public Response _post_back() {
        return Redirect.to(InputPage.class, _get_retry.method);
    }

    // 「完了」ボタンに対応するアクションです。
    // これに@Endアノテーションをつけてここでカンバセーションを終了させても良いですが、例外が発生した場合に
    // カンバセーションが終了してしまうと困る場合（例外ハンドラ等で処理をリカバリさせたい場合など）は、処理成功後
    // の遷移先（CompletePage#_get()）に@Endアノテーションを付与してカンバセーションを終了させるようにします。
    @Override
    public Response _post_complete() {
        // 「完了」ボタンが押されたのでエンティティを更新します。

        // 更新するために、フォームの内容をエンティティに反映させます。
        formConverter.copyDtoToEntity(form, entity);

        // エンティティを更新します。
        entityLogic.update(entity);

        // 完了画面に遷移します。
        return Redirect.to(CompletePage.class);
    }
}
