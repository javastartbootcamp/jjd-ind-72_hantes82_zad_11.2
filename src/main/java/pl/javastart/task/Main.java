package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
//            Person person = new Person("Jan", null, 25, "1234567890");
//            System.out.println(person);
            Person person2 = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person2);
            person2.setAge(-10);
            System.out.println(person2);

        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
