package com.example.web.register;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;
import org.seasar.ymir.scope.annotation.Out;

import com.example.dto.register.FormDto;

// 入力→確認→完了画面の親クラスです。
// 入力、確認、完了画面のそれぞれで入力フォームの情報を共有するため、このクラスにFormDtoのフィールドとGetter・Setterを
// 持たせています。Getter・Setterにはカンバセーションスコープへのアウトジェクトやカンバセーションスコープからのインジェクト
// のためのアノテーションを付与していますので、自動的にカンバセーション内で共有されます。
public class PageBase {
    @Meta(name = "property", value = "form")
    FormDto form = new FormDto();

    @In(ConversationScope.class)
    public void setForm(FormDto form) {
        this.form = form;
    }

    @Out(ConversationScope.class)
    public FormDto getForm() {
        return form;
    }
}
