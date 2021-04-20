package model;

import model.abstractAnimal.AbstractAnimal;
import property.Height;
import property.Type;
import property.Weight;

public class Animal extends AbstractAnimal {
    public Animal(String height, String type, String weight) {
        super(height, type, weight);
    }
}
