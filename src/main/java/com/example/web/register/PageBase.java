package com.example.web.register;

import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;
import org.seasar.ymir.scope.annotation.Out;

import com.example.dto.register.FormDto;

// 入力→確認→完了画面の親クラスです。
// 入力、確認、完了画面のそれぞれで入力フォームの情報を共有するため、このクラスにFormDtoのフィールドとGetter・Setterを
// 持たせています。Getter・Setterにはカンバセーションスコープへのアウトジェクトやカンバセーションスコープからのインジェクト
// のためのアノテーションを付与していますので、自動的にカンバセーション内で共有されます。
public class PageBase {
    @org.seasar.ymir.annotation.Meta(name = "property", value = "form")
    protected com.example.dto.register.FormDto form = new com.example.dto.register.FormDto();

    @In(ConversationScope.class)
    public void setForm(FormDto form) {
        this.form = form;
    }

    @Out(ConversationScope.class)
    public FormDto getForm() {
        return form;
    }
}
