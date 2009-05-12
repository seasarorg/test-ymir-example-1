package com.example.logic.edit;

import com.example.dao.edit.Product;
import com.example.dao.edit.ProductType;

public class ProductLogic {
    public Product getProduct(Integer id) {
        if (id.intValue() == 1) {
            Product product = new Product();
            product.setId(id);
            product.setName("Thinkpad");
            product.setDescription("ノートPCです。");
            product.setProductType(ProductType.STANDARD);
            return product;
        } else {
            return null;
        }
    }

    public void update(Product product) {
        // 実際はここで永続化するようにします。
    }
}
