package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        if (namesValidationCheck(firstName) || namesValidationCheck(lastName)) {
            throw new NameUndefinedException();
        }
        if (ageValidationCheck(age)) {
            throw new IncorrectAgeException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (namesValidationCheck(firstName)) {
            throw new NameUndefinedException();
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (namesValidationCheck(lastName)) {
            throw new NameUndefinedException();
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (ageValidationCheck(age)) {
            throw new IncorrectAgeException();
        } else {
            this.age = age;
        }
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
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
        if (sign == null || sign.length() < 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ageValidationCheck(int number) {
        if (number < 1) {
            return  true;
        } else {
            return false;
        }

    }

}
