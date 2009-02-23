package com.example.converter.update;

public class FormConverter extends FormConverterBase {
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
