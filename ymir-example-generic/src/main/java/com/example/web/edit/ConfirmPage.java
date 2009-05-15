package com.example.web.edit;

import org.seasar.ymir.Response;
import org.seasar.ymir.conversation.annotation.Conversation;
import org.seasar.ymir.conversation.annotation.End;
import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;

import com.example.dto.edit.FormDto;
import com.example.web.edit.InputPageBase._get_backed;
import com.example.ymir.util.Redirect;

@Conversation(name = "edit", phase = ConfirmPage.NAME)
public class ConfirmPage extends ConfirmPageBase {
    @In(ConversationScope.class)
    public void setForm(FormDto form) {
        this.form = form;
    }

    @Override
    public Response _post_previous() {
        return Redirect.to(InputPage.class, _get_backed.method);
    }

    @Override
    @End
    public Response _post_next() {
        productLogic.update(formConverter.copyDtoToEntity(form, product));

        return Redirect.to(CompletePage.class);
    }
}
