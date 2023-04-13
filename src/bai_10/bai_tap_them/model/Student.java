package bai_10.bai_tap_them.model;

public class Student extends Person {
    private String classer;
    private int point;

    public Student(int id, String name, int birthday, String gender, String classer, int point) {
        super(id, name, birthday, gender);
        this.classer = classer;
        this.point = point;
    }

    public Student() {

    }

    public String getClasser() {
        return classer;
    }

    public void setClasser(String classer) {
        this.classer = classer;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", birthday=" + this.getBirthday() +
                ", gender='" + this.getGender() + '\'' +
                "classer='" + classer + '\'' +
                ", point=" + point +
                '}';
    }

}
