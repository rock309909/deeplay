import dto.PropertiesDTO;
import exeption.AnimalException;
import model.Animal;
import property.Height;
import service.Calculation;
import service.WorkWithFile;

import javax.swing.plaf.basic.BasicTableHeaderUI;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, AnimalException{
        File fileAnimal = new File("animal.txt");
        File fileLogic = new File("logic.txt");

        Map<String, Integer> i = Calculation.calculation(fileLogic, fileAnimal);
        System.out.println("результат " + i.toString());
    }
}



