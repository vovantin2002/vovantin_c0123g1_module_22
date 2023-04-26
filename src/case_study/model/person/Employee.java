package case_study.model.person;


public class Employee extends Person {
    protected String ability;
    protected String position;
    protected String salary;

    public Employee(String id, String name, String birthday, String gender, String identityCard, String phoneNumber, String email, String ability, String position, String salary) {
        super(id, name, birthday, gender, identityCard, phoneNumber, email);
        this.ability = ability;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "ability='" + ability + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getInfoToCsv() {
        return id + "," + name + "," + birthday + "," + gender + "," + identityCard + "," + phoneNumber + "," + email + "," + ability + "," + position + "," + salary;
    }
}
