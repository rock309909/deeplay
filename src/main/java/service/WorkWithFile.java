package service;

import dto.AnimalDTO;
import dto.PropertiesDTO;
import exeption.AnimalException;
import model.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Класс для работы с внешними ресурсами (файлами)
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public class WorkWithFile {
    /**
     * @param file - файл с параметрами животных ;
     * Метод создает ArrayList из Animal из файла после проверки входящих данных
     * */
    public static ArrayList<Animal> createAnimalList(File file) {
        ArrayList<Animal> animals = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] properties = line.split(" ");
                CheckProperty.checkProperties(properties);
                AnimalDTO animalDTO = new AnimalDTO(properties);
                animals.add(new Animal(animalDTO.getHeight(),
                        animalDTO.getType(),
                        animalDTO.getWeight()));
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return animals;
    }

    /**
     * @param file - файл с логикой отбора животных ;
     * Метод создает ArrayList из PropertiesDTO
     * */
    public static ArrayList<PropertiesDTO> calculationLogic(File file) {
        ArrayList<PropertiesDTO> logic = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(", ");
                PropertiesDTO propertiesDTO = new PropertiesDTO(str);
                logic.add(propertiesDTO);
            }
        } catch (
                IOException e) {
            e.getMessage();
        }
        return logic;
    }
}
