package model.abstractAnimal;

import property.Height;
import property.Type;
import property.Weight;
/**
 * @author Sitnikov I.
 * @version 1.0.0
 * */

public abstract class AbstractAnimal {
    String height;
    String type;
    String weight;

    public AbstractAnimal(String height, String type, String weight) {
        setHeight(height);
        setType(type);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", height=" + height +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
