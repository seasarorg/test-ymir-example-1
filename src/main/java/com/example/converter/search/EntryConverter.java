package com.example.converter.search;

public class EntryConverter extends EntryConverterBase {
    /*
     * For example, if you want to convert empty String as null value
     * when it is set to an entity, override this method by uncommenting
     * the following lines.
     *
     * @see EntryConverterBase#convertForEntity(Object, Class)
     */      
//    protected <T> T convertForEntity(Object value, Class<T> type) {
//        return emptyToNull(typeConversionManager.convert(value, type));
//    }
}
