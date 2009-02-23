package com.example.web.update;

import org.seasar.ymir.Response;
import org.seasar.ymir.constraint.annotation.Validator;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.conversation.annotation.Conversation;

import com.example.update.IllegalPageStateRuntimeException;
import com.example.ymir.util.Redirect;

// 編集画面です。
// 編集画面は確認画面（confirm）だけから遷移してくるため、followAfterを"confirm"としています。
@Conversation(name = "update", phase = "input", followAfter = "confirm")
public class InputPage extends InputPageBase {
    @Validator("_get")
    public void validate() {
        if (id == null) {
            throw new IllegalPageStateRuntimeException("id is empty");
        }
    }

    @Begin
    @Override
    public void _get() {
        // 編集対象となるEntityをロジックを使って取得します。
        // この時点で、validate()メソッドによってidがnullでないことが保証されています。
        entity = entityLogic.get(id);

        // フォームの初期値を設定するため、Entityの内容をFormDtoにコピーします。
        formConverter.copyEntityToDto(entity, form);
    }

    @Override
    public Response _post_confirm() {
        return Redirect.to(ConfirmPage.class);
    }

    public void _get_retry() {
    }
}
