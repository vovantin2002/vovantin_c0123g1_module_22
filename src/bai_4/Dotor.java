package bai_4;

public class Dotor {
    String name;
    int age;
    String email;
    int numberPhone;
    String workingPosition;

    public Dotor() {
    }

    public Dotor(String name, int age, String email, int numberPhone, String workingPosition) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.numberPhone = numberPhone;
        this.workingPosition = workingPosition;
    }

    @Override
    public String toString() {
        return "Dotor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", numberPhone=" + numberPhone +
                ", workingPosition='" + workingPosition + '\'' +
                '}';
    }
}
