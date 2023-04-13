package bai_10.bai_tap_them.model;

public class Person {
    private int id;
    private String name;
    private int birthday;
    private String gender;

    public Person(int id, String name, int birthday, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                '}';
    }
}
