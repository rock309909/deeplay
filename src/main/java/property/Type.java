package property;
/**
 * Список вариантов типа животного
 * @author Sitnikov I.
 * @version 1.0.0
 * */
public enum Type {
    HERBIVORE("Травоядное"),
    CARNIVORE("Плотоядное"),
    OMNIVORE("Всеядное");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static String[] properties() {
        String[] properties = new String[3];
        int i = 0;
        for(Type property : values()) {
            properties[i] = property.getType().toLowerCase();
            i++;
        }
        return properties;
    }
}
