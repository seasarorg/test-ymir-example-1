package com.example.converter.update;

import java.util.ArrayList;
import java.util.List;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.ymir.converter.TypeConversionManager;
import org.seasar.ymir.message.Messages;

import com.example.dto.update.FormDto;
import com.example.dao.update.Entity;

/**
 * A class to convert Dto objects and entity objects.
 * <p>Developer can override methods to customize this class's behavior,
 * and add methods to gain conversion ability.
 * </p>
 */
public class FormConverterBase {
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
     * Copies Entity entity to FormDto instance.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>name</li>
     *   <li>furigana</li>
     * </ul>
     * 
     * @param entity Source object.
     * @param dto Destination object.
     * @return The first argument of this method.
     */
    public FormDto copyEntityToDto(Entity entity, FormDto dto) {
        reflectNameToDto(entity, dto);
        reflectFuriganaToDto(entity, dto);

        return dto;
    }

    /**
     * Copies a List of Entity entity to a List of FormDto.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>name</li>
     *   <li>furigana</li>
     * </ul>
     * 
     * @param entityList Source List.
     * @return Copied List of Dto.
     */
    public List<FormDto> toDtoList(List<Entity> entityList) {
        List<FormDto> dtoList = new ArrayList<FormDto>();
        for (Entity entity : entityList) {
            dtoList.add(copyEntityToDto(entity, new FormDto()));
        }
        return dtoList;
    }

    /**
     * Copies 'name' property of Entity entity to FormDto instance's 'name' property.
     * 
     * @param entity Source object.
     * @param dto Destination object.
     */
    protected void reflectNameToDto(Entity entity, FormDto dto) {
        dto.setName(extractNameFromEntity(entity));
    }

    /**
     * Extracts 'name' property of Entity entity in order to copy to FormDto instance's 'name' property.
     * 
     * @param entity Source object.
     * @return Extracted value.
     */
    protected String extractNameFromEntity(Entity entity) {
        return convert(entity.getName(), String.class);
    }

    /**
     * Copies 'furigana' property of Entity entity to FormDto instance's 'furigana' property.
     * 
     * @param entity Source object.
     * @param dto Destination object.
     */
    protected void reflectFuriganaToDto(Entity entity, FormDto dto) {
        dto.setFurigana(extractFuriganaFromEntity(entity));
    }

    /**
     * Extracts 'furigana' property of Entity entity in order to copy to FormDto instance's 'furigana' property.
     * 
     * @param entity Source object.
     * @return Extracted value.
     */
    protected String extractFuriganaFromEntity(Entity entity) {
        return convert(entity.getFurigana(), String.class);
    }

    /**
     * Copies FormDto entity to Entity instance.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>furigana</li>
     *   <li>name</li>
     * </ul>
     * 
     * @param dto Source object.
     * @param entity Destination object.
     * @return The first argument of this method.
     */
    public Entity copyDtoToEntity(FormDto dto, Entity entity) {
        reflectFuriganaToEntity(dto, entity);
        reflectNameToEntity(dto, entity);

        return entity;
    }

    /**
     * Copies a List of FormDto entity to a List of Entity.
     * <p>This methods copies the following properties automatically:</p>
     * <ul>
     *   <li>furigana</li>
     *   <li>name</li>
     * </ul>
     * 
     * @param dtoList Source List.
     * @return Copied List of entity.
     */
    public List<Entity> toEntityList(List<FormDto> dtoList) {
        List<Entity> entityList = new ArrayList<Entity>();
        for (FormDto dto : dtoList) {
            entityList.add(copyDtoToEntity(dto, new Entity()));
        }
        return entityList;
    }

    /**
     * Copies 'furigana' property of FormDto entity to Entity instance's 'furigana' property.
     * 
     * @param dto Source object.
     * @param entity Destination object.
     */
    protected void reflectFuriganaToEntity(FormDto dto, Entity entity) {
        entity.setFurigana(extractFuriganaFromDto(dto));
    }

    /**
     * Extracts 'furigana' property of FormDto entity in order to copy to Entity instance's 'furigana' property.
     * 
     * @param dto Source object.
     * @return Extracted value.
     */
    protected String extractFuriganaFromDto(FormDto dto) {
        return convertForEntity(dto.getFurigana(), String.class);
    }

    /**
     * Copies 'name' property of FormDto entity to Entity instance's 'name' property.
     * 
     * @param dto Source object.
     * @param entity Destination object.
     */
    protected void reflectNameToEntity(FormDto dto, Entity entity) {
        entity.setName(extractNameFromDto(dto));
    }

    /**
     * Extracts 'name' property of FormDto entity in order to copy to Entity instance's 'name' property.
     * 
     * @param dto Source object.
     * @return Extracted value.
     */
    protected String extractNameFromDto(FormDto dto) {
        return convertForEntity(dto.getName(), String.class);
    }

}
