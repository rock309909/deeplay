package service;

import dto.PropertiesDTO;
import model.Animal;

import java.io.File;
import java.util.*;

/**
 * Класс расчета результата
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public class Calculation {

    /**
     * @param fileWithLogic - внешний файл с логикой;
     * @param fileWithAnimals - внешний файл с параметрами животных
     * Метод проверяет пересечение параметров животных с параметрами логики отбора и возвращает карту логика отбора - количество животных
     * */
    public static Map<String, Integer> calculation(File fileWithLogic, File fileWithAnimals){
        ArrayList<PropertiesDTO> logic = WorkWithFile.calculationLogic(fileWithLogic);
        ArrayList<Animal> animalList = WorkWithFile.createAnimalList(fileWithAnimals);
        Map<String, Integer> result = new HashMap<>();

        for(PropertiesDTO propertiesDTO : logic) {
            int count = 0;
            for (Animal animal : animalList) {
                count = (crossingProperties(animal, propertiesDTO)) ? count+1 : count;
            }
            result.put(propertiesDTO.getAllProperties(), count);
        }
        return  result;
    }

    private static boolean crossingProperties (Animal animal, PropertiesDTO propertiesDTO) {
        return  crossingHeight(animal, propertiesDTO) &&
                crossingType(animal, propertiesDTO) &&
                crossingWeight(animal, propertiesDTO);
    }

    private static boolean crossingHeight (Animal animal, PropertiesDTO propertiesDTO) {
        boolean result = false;
        if(propertiesDTO.getHeights().isEmpty()) {
            result = true;
        } else {
            result = propertiesDTO.getHeights().contains(animal.getHeight());
        }
        return result;
    }

    private static boolean crossingType (Animal animal, PropertiesDTO propertiesDTO) {
        boolean result = false;
        if(propertiesDTO.getTypes().isEmpty()) {
            result = true;
        } else {
            result = propertiesDTO.getTypes().contains(animal.getType());
        }
        return result;
    }

    private static boolean crossingWeight (Animal animal, PropertiesDTO propertiesDTO) {
        boolean result = false;
        if(propertiesDTO.getWeights().isEmpty()) {
            result = true;
        } else {
            result = propertiesDTO.getWeights().contains(animal.getWeight());
        }
        return result;
    }
}
