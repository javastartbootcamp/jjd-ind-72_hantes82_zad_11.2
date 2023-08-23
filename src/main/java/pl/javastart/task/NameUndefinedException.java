package pl.javastart.task;

public class NameUndefinedException extends RuntimeException {

    public NameUndefinedException() {
        super("Podano za krótkie lub puste pole imienia lub nazwiska");
    }
}
