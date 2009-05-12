package com.example.converter.edit;

import org.seasar.ymir.render.html.Option;

import com.example.dao.edit.Product;
import com.example.dao.edit.ProductType;
import com.example.dto.edit.FormDto;

public class FormConverter extends FormConverterBase {
    @Override
    public FormDto copyEntityToDto(Product entity, FormDto dto) {
        dto.getProductTypeSelect().setOptions(
                new Option(ProductType.STANDARD.getId(), "標準仕様"),
                new Option(ProductType.SPECIAL.getId(), "特別仕様"));

        return super.copyEntityToDto(entity, dto);
    }

    @Override
    protected ProductType extractProductTypeFromDto(FormDto dto) {
        return ProductType.enumOf(dto.getProductTypeSelect()
                .getSelectedValueAsInteger());
    }

    @Override
    protected String extractProductTypeFromEntity(Product entity) {
        return entity.getProductType() != null ? String.valueOf(entity
                .getProductType().getId()) : null;
    }
    /*
     * For example, if you want to convert empty String as null value
     * when it is set to an entity, override this method by uncommenting
     * the following lines.
     *
     * @see FormConverterBase#convertForEntity(Object, Class)
     */
    //    protected <T> T convertForEntity(Object value, Class<T> type) {
    //        return emptyToNull(typeConversionManager.convert(value, type));
    //    }
}
