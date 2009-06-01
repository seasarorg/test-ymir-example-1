package com.example.web.edit;

import org.seasar.ymir.Response;
import org.seasar.ymir.conversation.annotation.Conversation;
import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;

import com.example.dto.edit.FormDto;
import com.example.ymir.util.Redirect;

@Conversation(name = "edit", phase = Input2Page.NAME, followAfter = ConfirmPage.NAME)
public class Input2Page extends Input2PageBase {
    // このメソッドは、戻るボタンでこの画面に遷移してきた場合にConversationからformオブジェクトを復元するために必要です。
    @In(ConversationScope.class)
    public void setForm(FormDto form) {
        this.form = form;
    }

    @Override
    public Response _post_previous() {
        return Redirect.to(InputPage.class, InputPage._get_backed.method);
    }

    @Override
    public Response _post_next() {
        return Redirect.to(ConfirmPage.class);
    }
}
