package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateFirstName(firstName);
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateFirstName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;

    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void validateFirstName(String firstName) {
        if (namesValidationCheck(firstName)) {
            throw new NameUndefinedException("Imię");
        }
    }

    private void validateLastName(String lastName) {
        if (namesValidationCheck(lastName)) {
            throw new NameUndefinedException("Nazwisko");
        }
    }

    private void validateAge(int age) {
        if (ageValidationCheck(age)) {
            throw new IncorrectAgeException();
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public boolean namesValidationCheck(String sign) {
        return (sign == null || sign.length() < 2);
    }

    public boolean ageValidationCheck(int number) {
        return  number < 1;
        }
}
