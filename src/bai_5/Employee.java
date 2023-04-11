package bai_5;

public class Employee {
    //tính bao đóng
    private String name;
    //tính bao đóng
    private int phoneNumber;
    //tính bao đóng
    private String workingParts;
    //biến dùng chung
    private static String companyName="ABC";
    public Employee() {
    }

    public Employee(String name, int phoneNumber, String workingParts, String companyName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.workingParts = workingParts;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", workingParts='" + workingParts + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
