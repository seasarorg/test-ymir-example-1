package com.example.web.register;

import org.seasar.ymir.conversation.annotation.Conversation;
import org.seasar.ymir.conversation.annotation.End;

// 完了画面です。
// 完了画面は確認画面（confirm）だけから遷移してくるため、followAfterを"confirm"としています。
@Conversation(name = "register", phase = "complete", followAfter = "confirm")
public class CompletePage extends CompletePageBase {
    // @Endアノテーションを付与してregisterカンバセーションを終了しています。
    // これによってカンバセーションスコープが消滅し、中に格納されていたFormDtoも消されます。
    @End
    @Override
    public void _get() {
    }
}
