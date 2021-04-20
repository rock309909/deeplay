package dto;

import java.util.Objects;
/**
 * Используется как посредник при создании объекта Animal из файла с параметрами животных. Позволяет передавать доп. информацию не меняя класс Animal
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public class AnimalDTO {
    String height, type, weight;

    public AnimalDTO(String[] properties) {
        setHeight(properties[0]);
        setType(properties[1]);
        setWeight(properties[2]);
    }

    @Override
    public String toString() {
        return "AnimalDTO{" +
                "height='" + height + '\'' +
                ", type='" + type + '\'' +
                ", weight='" + weight + '\'' +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalDTO animalDTO = (AnimalDTO) o;
        return Objects.equals(height, animalDTO.height) &&
                Objects.equals(type, animalDTO.type) &&
                Objects.equals(weight, animalDTO.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, type, weight);
    }
}
