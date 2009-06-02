package com.example.web.edit;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.ymir.conversation.impl.ConversationScope;
import org.seasar.ymir.scope.annotation.In;
import org.seasar.ymir.scope.annotation.Out;

import com.example.dao.edit.Product;
import com.example.dto.edit.FormDto;
import com.example.logic.edit.ProductLogic;

public class PageBase extends com.example.web.PageBase {
    protected ProductLogic productLogic;

    protected Product product;

    protected FormDto form = new FormDto();

    @Binding(bindingType = BindingType.MUST)
    final public void setProductLogic(ProductLogic productLogic) {
        this.productLogic = productLogic;
    }

    @In(ConversationScope.class)
    public void setProduct(Product product) {
        this.product = product;
    }

    @Out(ConversationScope.class)
    public Product getProduct() {
        return product;
    }

    @In(ConversationScope.class)
    public void setForm(FormDto form) {
        this.form = form;
    }

    @Out(ConversationScope.class)
    public FormDto getForm() {
        return form;
    }
}
