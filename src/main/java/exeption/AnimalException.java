package exeption;

public class AnimalException extends Exception {
    private AnimalErrorCode error;

    public AnimalException(String error){
        super();
    }

    public AnimalException(AnimalErrorCode error, Throwable cause) {
        super(error.getErrorString(), cause);
    }

    public AnimalException(AnimalErrorCode error) {
         super(error.getErrorString());
    }

    public AnimalException(AnimalErrorCode error, String param) {
        super(String.format(error.getErrorString(), param));
    }
}