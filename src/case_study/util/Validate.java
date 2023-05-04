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
    }

    public static String checkIdCustomer() {
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

    public static String checkIdVilla() {
        String id = null;
        boolean flag = true;
        while (flag) {
            System.out.print("Enter id: ");
            id = String.valueOf(sc.nextLine());
            if (id.matches("^SVVL-[0-9]{4}$")) {
                flag = false;
            }
        }
        return id;
    }

    public static String checkIdRoom() {
        String id = null;
        boolean flag = true;
        while (flag) {
            System.out.print("Enter id: ");
            id = String.valueOf(sc.nextLine());
            if (id.matches("^SVRO-[0-9]{4}$")) {
                flag = false;
            }
        }
        return id;
    }

    public static String checkIdHouse() {
        String id = null;
        boolean flag = true;
        while (flag) {
            System.out.print("Enter id: ");
            id = String.valueOf(sc.nextLine());
            if (id.matches("^VLHO-[0-9]{4}$")) {
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

    public static String checkRentalType() {
        boolean flag = true;
        String name = null;
        while (flag) {
            System.out.print("Enter RentalType: ");
            name = sc.nextLine();
            if (name.matches("^[A-Z][a-z]{0,6}(\\s[a-z]{0,6}){0,14}$")) {
                flag = false;
            }
        }
        return name;
    }

    public static String checkRoomStandard() {
        boolean flag = true;
        String name = null;
        while (flag) {
            System.out.print("Enter roomStandard: ");
            name = sc.nextLine();
            if (name.matches("^[A-Z][a-z]{0,6}(\\s[a-z]{0,6}){0,14}$")) {
                flag = false;
            }
        }
        return name;
    }

    public static String checkNameService() {
        boolean flag = true;
        String name = null;
        while (flag) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            if (name.matches("^[A-Z][a-z]{0,6}(\\s[a-z]{0,6}){0,14}$")) {
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
            if (salary.matches("^[1-9]+$")) {
                flag = false;
            }
        }
        return salary;
    }

    public static String checkNumOfLevel() {
        boolean flag = true;
        String numOfLevel = null;
        while (flag) {
            System.out.print("Enter numOfLevel: ");
            numOfLevel = sc.nextLine();
            if (numOfLevel.matches("^[1-9]+$")) {
                flag = false;
            }
        }
        return numOfLevel;
    }

    public static String checkPrice() {
        boolean flag = true;
        String price = null;
        while (flag) {
            System.out.print("Enter price: ");
            price = sc.nextLine();
            if (price.matches("^[1-9]+$")) {
                flag = false;
            }
        }
        return price;
    }

    public static String checkArea() {
        boolean flag = true;
        String area = null;
        while (flag) {
            System.out.print("Enter area: ");
            area = sc.nextLine();
            if (area.matches("^[1-9]+.[0-9]+$")) {
                flag = false;
            }
        }
        return area;
    }

    public static String checkNumberHumanMax() {
        boolean flag = true;
        String numberHumanMax = null;
        while (flag) {
            System.out.print("Enter area: ");
            numberHumanMax = sc.nextLine();
            if (numberHumanMax.matches("^[1-9]+$") && Integer.parseInt(numberHumanMax) < 20) {
                flag = false;
            }
        }
        return numberHumanMax;
    }

}
