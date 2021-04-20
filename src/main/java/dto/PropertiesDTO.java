package dto;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Класс вмещающий себя одно правило отбора животных. Используется при анализе текстового файла с перечнем правил
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public class PropertiesDTO {
    ArrayList<String> heights = new ArrayList<>();
    ArrayList<String> types = new ArrayList<>();
    ArrayList<String> weights = new ArrayList<>();
    /**
     * @param allProperties - правило отбора животных
     * */
    String allProperties = "";
    String empty = "null";

    @Override
    public String toString() {
        return "PropertiesDTO{" +
                "heights=" + heights +
                ", types=" + types +
                ", weights=" + weights +
                ", allProperties='" + allProperties + '\'' +
                '}';
    }

    public PropertiesDTO(String[] properties) {
        setHeights(properties[0]);
        setTypes(properties[1]);
        setWeights(properties[2]);
        setAllProperties(properties);
    }

    public ArrayList<String> getHeights() {
        return heights;
    }

    public void setHeights(String height) {
        if(!empty.equals(height))
            Collections.addAll(heights, height.split(" "));
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(String type) {
        if(!empty.equals(type))
            Collections.addAll(types, type.split(" "));
    }

    public ArrayList<String> getWeights() {
        return weights;
    }

    public void setWeights(String weight) {
        if(!empty.equals(weight))
            Collections.addAll(weights, weight.split(" "));
    }

    public String getAllProperties() {
        return allProperties;
    }

    public void setAllProperties(String[] properties) {
        for (String property : properties){
            if(!empty.equals(property))
                allProperties = allProperties + property + " ";
            else continue;
        }
    }
}
