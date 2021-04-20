package property;
/**
 * Список вариантов веса животных
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public enum Weight {
    LIGHT("Легкое"),
    MEDIUM("Среднее"),
    HEAVY("Тяжелое");

    private String weight;

    Weight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public static String[] properties() {
        String[] properties = new String[3];
        int i = 0;
        for(Weight property : values()) {
            properties[i] = property.getWeight().toLowerCase();
            i++;
        }
        return properties;
    }
}
