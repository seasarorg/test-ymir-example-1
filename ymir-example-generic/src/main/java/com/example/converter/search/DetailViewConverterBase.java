package com.example.converter.search;

import java.util.ArrayList;
import java.util.List;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.ymir.converter.TypeConversionManager;
import org.seasar.ymir.message.Messages;

import com.example.dto.search.DetailViewDto;
import com.example.dao.search.Entry;

/**
 * A class to convert Dto objects and entity objects.
 * <p>Developer can override methods to customize this class's behavior,
 * and add methods to gain conversion ability.
 * </p>
 */
public class DetailViewConverterBase {
    protected TypeConversionManager typeConversionManager;

    protected Messages messages;

    @Binding(bindingType = BindingType.MUST)
    final public void setConversionManager(
        TypeConversionManager typeConversionManager) {
        this.typeConversionManager = typeConversionManager;
    }

    @Binding(bindingType = BindingType.MUST)
    final public void setMessages(Messages messages) {
        this.messages = messages;
    }

    /**
     * Gets TypeConversionManager.
     * <p>Gets a TypeConversionManager instance to convert types of object.
     * </p>
     * 
     * @return A TypeConversionManager instance.
     */
    final protected TypeConversionManager getTypeConversionManager() {
        return typeConversionManager;
    }

    /**
     * Gets Messages.
     * <p>Gets a Messages instance to localize messages represented by keys.
     * </p>
     * 
     * @return A Messages instance.
     */
    final protected Messages getMessages() {
        return messages;
    }

    /**
     * Converts object by specified type.
     * <p>Converts object by specified type using TypeConversionManager.
     * </p>
     * 
     * @param value Source object.
     * @param type Destination type.
     * @return Conversion result.
     */
    protected <T> T convert(Object value, Class<T> type) {
        return typeConversionManager.convert(value, type);
    }

    /**
     * Converts object for entity by specified type.
     * <p>This method is used in order to set converted objects to entities.
     * You can change behavior of this method by overriding this method.
     * </p>
     * 
     * @param value source object.
     * @param type destination type.
     * @return conversion result.
     */
    protected <T> T convertForEntity(Object value, Class<T> type) {
        return typeConversionManager.convert(value, type);
    }

    /**
     * Gets String representation of object.
     * <p>Gets String representation of specified object.
     * If the object is null, null is returned.
     * </p>
     * 
     * @param obj Source object.
     * @return String representation.
     */
    final protected String valueOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    /**
     * Returns whether object is empty or not.
     * <p>Returns whether specified object is empty or not.
     * 'Empty' means that a object is null or 0-length String.
     * </p>
     *  
     * @param obj Target object.
     * @return Whether object is empty or not.
     */
    protected boolean isEmpty(Object obj) {
        return (obj == null || obj instanceof String
            && ((String) obj).trim().length() == 0);
    }

    /**
     * Converts null if object is empty.
     * <p>Converts null if specified object is empty.
     * 'Empty' means that a object is null or 0-length String.
     * </p>
     *  
     * @param obj Target object.
     * @return Original object, or null if it is empty.
     */
    protected <T> T emptyToNull(T obj) {
        if (isEmpty(obj)) {
            return null;
        } else {
            return obj;
        }
    }

    /**
     * Copies Entry entity to DetailViewDto instance.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>id</li>
     *   <li>name</li>
     * </ul>
     * 
     * @param entity Source object.
     * @param dto Destination object.
     * @return The first argument of this method.
     */
    public DetailViewDto copyEntityToDto(Entry entity, DetailViewDto dto) {
        reflectIdToDto(entity, dto);
        reflectNameToDto(entity, dto);

        return dto;
    }

    /**
     * Copies a List of Entry entity to a List of DetailViewDto.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>id</li>
     *   <li>name</li>
     * </ul>
     * 
     * @param entityList Source List.
     * @return Copied List of Dto.
     */
    public List<DetailViewDto> toDtoList(List<Entry> entityList) {
        List<DetailViewDto> dtoList = new ArrayList<DetailViewDto>();
        for (Entry entity : entityList) {
            dtoList.add(copyEntityToDto(entity, new DetailViewDto()));
        }
        return dtoList;
    }

    /**
     * Copies 'id' property of Entry entity to DetailViewDto instance's 'id' property.
     * 
     * @param entity Source object.
     * @param dto Destination object.
     */
    protected void reflectIdToDto(Entry entity, DetailViewDto dto) {
        dto.setId(extractIdFromEntity(entity));
    }

    /**
     * Extracts 'id' property of Entry entity in order to copy to DetailViewDto instance's 'id' property.
     * 
     * @param entity Source object.
     * @return Extracted value.
     */
    protected Integer extractIdFromEntity(Entry entity) {
        return convert(entity.getId(), Integer.class);
    }

    /**
     * Copies 'name' property of Entry entity to DetailViewDto instance's 'name' property.
     * 
     * @param entity Source object.
     * @param dto Destination object.
     */
    protected void reflectNameToDto(Entry entity, DetailViewDto dto) {
        dto.setName(extractNameFromEntity(entity));
    }

    /**
     * Extracts 'name' property of Entry entity in order to copy to DetailViewDto instance's 'name' property.
     * 
     * @param entity Source object.
     * @return Extracted value.
     */
    protected String extractNameFromEntity(Entry entity) {
        return convert(entity.getName(), String.class);
    }

    /**
     * Copies DetailViewDto entity to Entry instance.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>id</li>
     *   <li>name</li>
     * </ul>
     * 
     * @param dto Source object.
     * @param entity Destination object.
     * @return The first argument of this method.
     */
    public Entry copyDtoToEntity(DetailViewDto dto, Entry entity) {
        reflectIdToEntity(dto, entity);
        reflectNameToEntity(dto, entity);

        return entity;
    }

    /**
     * Copies a List of DetailViewDto entity to a List of Entry.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>id</li>
     *   <li>name</li>
     * </ul>
     * 
     * @param dtoList Source List.
     * @return Copied List of entity.
     */
    public List<Entry> toEntityList(List<DetailViewDto> dtoList) {
        List<Entry> entityList = new ArrayList<Entry>();
        for (DetailViewDto dto : dtoList) {
            entityList.add(copyDtoToEntity(dto, new Entry()));
        }
        return entityList;
    }

    /**
     * Copies 'id' property of DetailViewDto entity to Entry instance's 'id' property.
     * 
     * @param dto Source object.
     * @param entity Destination object.
     */
    protected void reflectIdToEntity(DetailViewDto dto, Entry entity) {
        entity.setId(extractIdFromDto(dto));
    }

    /**
     * Extracts 'id' property of DetailViewDto entity in order to copy to Entry instance's 'id' property.
     * 
     * @param dto Source object.
     * @return Extracted value.
     */
    protected Integer extractIdFromDto(DetailViewDto dto) {
        return convertForEntity(dto.getId(), Integer.class);
    }

    /**
     * Copies 'name' property of DetailViewDto entity to Entry instance's 'name' property.
     * 
     * @param dto Source object.
     * @param entity Destination object.
     */
    protected void reflectNameToEntity(DetailViewDto dto, Entry entity) {
        entity.setName(extractNameFromDto(dto));
    }

    /**
     * Extracts 'name' property of DetailViewDto entity in order to copy to Entry instance's 'name' property.
     * 
     * @param dto Source object.
     * @return Extracted value.
     */
    protected String extractNameFromDto(DetailViewDto dto) {
        return convertForEntity(dto.getName(), String.class);
    }

}
