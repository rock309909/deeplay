package service;

import exeption.AnimalErrorCode;
import exeption.AnimalException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import property.Height;
import property.Type;
import property.Weight;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Класс проверки валидности входящих из файла свойтств
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public class CheckProperty {
    private static final Logger LOGGER = LoggerFactory.getLogger(CheckProperty.class);
    /**
     * @param properties - массив свойств животных (одна строка свойств животных  в файле);
     * Метод проверяет валидность входящих свойств животных на количесиво свойств (=3), на пустое значение, на наличие свойства в перечне
     * */
    static void checkProperties(String[] properties) {
        try {
            checkQuantityProperties(properties);
            checkEmptyProperties(properties);
            checkAllProperties(properties);
        } catch (AnimalException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public static void checkQuantityProperties(String[] properties) throws AnimalException {
        if (properties.length != 3)
            throw new AnimalException(AnimalErrorCode.WRONG_QUANTITY_PROPERTIES);
    }

    public static void checkEmptyProperties(String[] properties) throws AnimalException {
        for(String property : properties) {
            if (property.isEmpty())
                throw new AnimalException(AnimalErrorCode.EMPTY_PROPERTY);
        }
    }

    public static void checkAllProperties(String[] properties) throws AnimalException {
        boolean result;
        result = Arrays.asList(Height.properties()).contains(properties[0].toLowerCase().trim());
        result = Arrays.asList(Type.properties()).contains(properties[1].toLowerCase().trim());
        result = Arrays.asList(Weight.properties()).contains(properties[2].toLowerCase().trim());
        //System.out.println(Height.properties());
        //System.out.println(Type.properties());
        //System.out.println(Weight.properties());
        if(result == false)
            throw new AnimalException(AnimalErrorCode.WRONG_PROPERTY);
    }



}
