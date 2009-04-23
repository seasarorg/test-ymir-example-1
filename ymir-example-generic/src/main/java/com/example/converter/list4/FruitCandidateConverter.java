package com.example.converter.list4;

import com.example.dao.list4.Fruit;
import com.example.dto.list4.FruitCandidateDto;

public class FruitCandidateConverter extends FruitCandidateConverterBase {
    /*
     * For example, if you want to convert empty String as null value
     * when it is set to an entity, override this method by uncommenting
     * the following lines.
     *
     * @see FruitCandidateConverterBase#convertForEntity(Object, Class)
     */
    //    protected <T> T convertForEntity(Object value, Class<T> type) {
    //        return emptyToNull(typeConversionManager.convert(value, type));
    //    }
    @Override
    public FruitCandidateDto copyEntityToDto(Fruit entity, FruitCandidateDto dto) {
        super.copyEntityToDto(entity, dto);

        dto.setValue(valueOf(entity.getId()));

        // FruitCountCandidateにFruitのcountの情報を設定しておきます。
        dto.getFruitCountSelector().setSelectedValueObject(entity.getCount());

        return dto;
    }
}
