package com.example.web.edit;

import org.seasar.ymir.Response;
import org.seasar.ymir.constraint.annotation.Required;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.conversation.annotation.Conversation;
import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;
import org.seasar.ymir.scope.annotation.Out;

import com.example.dto.edit.FormDto;
import com.example.ymir.util.Redirect;

@Conversation(name = "edit", phase = InputPage.NAME, followAfter = ConfirmPage.NAME)
public class InputPage extends InputPageBase {
    // 各PageクラスのBaseクラスには、formフィールドやformフィールドのためのGetter/Setterが必要に応じて
    // 自動生成されています。
    // もしも共通の親クラスであるPageBaseにformフィールドとformのSetterやGetterを定義したとしても、
    // PageBaseのformフィールドによって隠されてしまい、予期せぬ挙動をすることになります。
    // 従って、formフィールドやGetter/SetterはPageBaseに定義せずに、面倒でも各Pageクラスに定義したほうが良いです。

    // このメソッドは、戻るボタンでこの画面に遷移してきた場合にConversationからformオブジェクトを復元するために必要です。
    @In(ConversationScope.class)
    public void setForm(FormDto form) {
        this.form = form;
    }

    @Override
    @Begin
    public void _get() {
        if (id == null) {
            throw new IllegalStateException();
        }
        product = productLogic.getProduct(id);
        formConverter.copyEntityToDto(product, form);
    }

    public void _get_backed() {
    }

    @Override
    @Required( { P_name, P_description })
    public Response _post_next() {
        return Redirect.to(ConfirmPage.class);
    }

    @Out(ConversationScope.class)
    public FormDto getForm() {
        return form;
    }
}
