package bai_10.bai_tap_them.model;

public class Teacher extends Person {
    private String expertise;

    public Teacher() {
    }

    public Teacher(int id, String name, int birthday, String gender, String expertise) {
        super(id, name, birthday, gender);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", birthday=" + this.getBirthday() +
                ", gender='" + this.getGender() + '\'' +
                "expertise='" + expertise + '\'' +
                '}';
    }

}
