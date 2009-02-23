package com.example.web.update;

import org.seasar.ymir.annotation.Meta;
import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;
import org.seasar.ymir.scope.annotation.Inject;
import org.seasar.ymir.scope.annotation.Out;

import com.example.converter.update.FormConverter;
import com.example.dao.update.Entity;
import com.example.dto.update.FormDto;
import com.example.logic.update.EntityLogic;

// 編集→確認→完了画面の親クラスです。
// 編集、確認、完了画面のそれぞれで編集フォームの情報を共有するため、このクラスにFormDtoのフィールドとGetter・Setterを
// 持たせています。Getter・Setterにはカンバセーションスコープへのアウトジェクトやカンバセーションスコープからのインジェクト
// のためのアノテーションを付与していますので、自動的にカンバセーション内で共有されます。
// また、編集対象のエンティティも同様にカンバセーションに保存するようにしています。
// こうすることで、エンティティの更新の際にロジックからエンティティを再取得する必要がないようにしています。
public class PageBase extends com.example.web.PageBase {
    EntityLogic entityLogic;

    FormConverter formConverter;

    @Meta(name = "property", value = "form")
    FormDto form = new FormDto();

    Entity entity;

    @Inject
    public void setEntityLogic(EntityLogic entityLogic) {
        this.entityLogic = entityLogic;
    }

    @Inject
    public void setFormConverter(
            com.example.converter.update.FormConverter formConverter) {
        this.formConverter = formConverter;
    }

    @In(ConversationScope.class)
    public void setForm(FormDto form) {
        this.form = form;
    }

    @In(ConversationScope.class)
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    @Out(ConversationScope.class)
    public FormDto getForm() {
        return this.form;
    }

    @Out(ConversationScope.class)
    public Entity getEntity() {
        return entity;
    }
}
