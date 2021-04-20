package exeption;

public enum AnimalErrorCode {
    EMPTY_PROPERTY ("Пустое свойство"),
    WRONG_PROPERTY("Некорректное свойство"),
    WRONG_QUANTITY_PROPERTIES("Неправильное количество параметров");

    private String errorString;

    private AnimalErrorCode(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {return errorString;}
}