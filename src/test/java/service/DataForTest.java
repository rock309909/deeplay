package service;

import java.io.File;

public class DataForTest {
    File fileLogic = new File("logic.txt");
    File fileAnimal = new File("animal.txt");

    String logic =  "null, травоядное, null\n" +
                    "маленькое, травоядное плотоядное, null\n" +
                    "маленькое невысокое, всеядное, null\n" +
                    "null, плотоядное, null";

    public String animal = "высокое плотоядное тяжелое\n" +
                    "невысокое всеядное легкое\n" +
                    "невысокое травоядное легкое";

    String[] animalErrorEmptyProperty = new String[]{"высокое", "плотоядное"};


    String[] animalErrorWrongProperty = new String[]{"высокое", "плотоядное", "jevnriuj"};
}
