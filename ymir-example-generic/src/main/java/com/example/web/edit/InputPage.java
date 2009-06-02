package com.example.web.edit;

import org.seasar.ymir.Response;
import org.seasar.ymir.constraint.annotation.Required;
import org.seasar.ymir.constraint.annotation.Validator;
import org.seasar.ymir.conversation.annotation.Begin;
import org.seasar.ymir.conversation.annotation.Conversation;

import com.example.ymir.util.Redirect;

@Conversation(name = "edit", phase = InputPage.NAME, followAfter = Input2Page.NAME)
public class InputPage extends InputPageBase {
    // 各PageクラスのBaseクラスには、formフィールドやformフィールドのためのGetter/Setterが必要に応じて
    // 自動生成されています。
    // もしも共通の親クラスであるPageBaseにformフィールドとformのSetterやGetterを定義したとしても、
    // PageBaseのformフィールドによって隠されてしまい、予期せぬ挙動をすることになります。
    // 従って、formフィールドやGetter/SetterはPageBaseに定義せずに、面倒でも各Pageクラスに定義したほうが良いです。

    @Validator(_get.NAME)
    public void validate() {
        if (id == null) {
            throw new IllegalArgumentException("id is empty");
        }
    }

    @Override
    @Begin
    public void _get() {
        product = productLogic.getProduct(id);
        formConverter.copyEntityToDto(product, form);
    }

    @Override
    @Required( { P_name, P_description })
    public Response _post_next() {
        return Redirect.to(Input2Page.class);
    }
}
