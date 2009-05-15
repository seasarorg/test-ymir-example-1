package com.example.web.register;

import org.seasar.ymir.Response;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.conversation.annotation.Conversation;

import com.example.ymir.util.Redirect;

// 入力画面です。
// 入力画面は確認画面（confirm）だけから遷移してくるため、followAfterを"confirm"としています。
@Conversation(name = "register", phase = "input", followAfter = "confirm")
public class InputPage extends InputPageBase {
    @Begin
    @Override
    public void _get() {
    }

    @Override
    public Response _post_confirm() {
        return Redirect.to(ConfirmPage.class);
    }
}
