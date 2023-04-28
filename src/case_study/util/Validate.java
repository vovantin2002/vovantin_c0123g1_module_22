package case_study.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Validate {
    static Scanner sc = new Scanner(System.in);

    public static String checkIdEmployee() {
        String id = null;
        boolean flag = true;
        while (flag) {
            System.out.print("Enter id: ");
            id = String.valueOf(sc.nextLine());
            if (id.matches("^NV-[0-9]{4}$")) {
                flag = false;
            }
        }
        return id;
    }public static String checkIdCustomer() {
        String id = null;
        boolean flag = true;
        while (flag) {
            System.out.print("Enter id: ");
            id = String.valueOf(sc.nextLine());
            if (id.matches("^KH-[0-9]{4}$")) {
                flag = false;
            }
        }
        return id;
    }

    public static String checkName() {
        boolean flag = true;
        String name = null;
        while (flag) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            if (name.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                flag = false;
            }
        }
        return name;
    }

    public static String checkBirthday() {
        boolean flag = true;
        String birthday = null;
        while (flag) {
            System.out.print("Enter birthday: ");
            birthday = sc.nextLine();
            // kiểm tra định dạng chuỗi ngày sinh có hợp lệ không
            if (birthday.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateOfBirth = LocalDate.parse(birthday, formatter);
                LocalDate currentDate = LocalDate.now();

                int age = Period.between(dateOfBirth, currentDate).getYears();

                if (age >= 18) {
                    flag = false;
                    break;
                } else {
                    System.out.println("Người dùng chưa đủ 18 tuổi");
                }
            } else {
                System.out.println("Định dạng ngày sinh không hợp lệ");
            }
        }
        return birthday;
    }

    public static String checkIdentityCard() {
        boolean flag = true;
        String identityCard = null;
        while (flag) {
            System.out.print("Enter identityCard: ");
            identityCard = sc.nextLine();
            if (identityCard.matches("^[0-9]{9}|[0-9]{12}$")) {
                flag = false;
            }
        }
        return identityCard;
    }

    public static String checkPhoneNumber() {
        boolean flag = true;
        String phoneNumber = null;
        while (flag) {
            System.out.print("Enter phoneNumber: ");
            phoneNumber = sc.nextLine();
            if (phoneNumber.matches("^0[0-9]{9}$")) {
                flag = false;
            }
        }
        return phoneNumber;
    }

    public static String checkSalary() {
        boolean flag = true;
        String salary = null;
        while (flag) {
            System.out.print("Enter salary: ");
            salary = sc.nextLine();
            if (salary.matches("^[1-9]{1,100}$")) {
                flag = false;
            }
        }
        return salary;
    }

}
