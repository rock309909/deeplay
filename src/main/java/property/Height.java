package property;
/**
 * Список вариантов роста животных
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public enum Height {
    SMALL("Маленькое"),
    LOW("Невысокое"),
    HIGH("Высокое");

    private String height;

    Height(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public static String[] properties() {
        String[] properties = new String[values().length];
        int i = 0;
        for(Height property : values()) {
            properties[i] = property.getHeight();
            i++;
        }
        return properties;
    }


}
