package pl.javastart.task;

public class NameUndefinedException extends RuntimeException {

    public NameUndefinedException(String errorField) {

        super("Podano za krótkie lub puste pole: " + errorField);
    }
}
