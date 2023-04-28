package case_study.controller;

import case_study.model.person.Customer;
import case_study.service.person.CustomerService;
import case_study.service.person.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    static CustomerService customerService=new CustomerService();
    static EmployeeService employeeService = new EmployeeService();
    static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        while (true) {
            System.out.print("----------------Furama Controller----------------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "0. Thoat\n" +
                    "Enter your selection: ");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid selection, please re-enter. ");
            }
        }
    }

    public static void employeeManagement() {
        String choss = "-1";
        while (!choss.equals("4")) {
            System.out.print("-------------employee Management--------------\n" +
                    "1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Return main menu\n" +
                    "Enter your selection: ");
            choss = sc.nextLine();
            switch (choss) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":

                    break;
                default:
                    System.err.println("Invalid selection, please re-enter. ");
            }
        }
    }

    public static void customerManagement() {
        String choss = "-1";
        while (!choss.equals("4")) {
            System.out.print("--------------customer Management-------------\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n" +
                    "Enter your selection: ");
            choss = sc.nextLine();
            switch (choss) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":

                    break;
                default:
                    System.err.println("Invalid selection, please re-enter. ");
            }
        }
    }

    public static void facilityManagement() {
        String choss = "-1";
        while (!choss.equals("4")) {
            System.out.print("-------------facility Management------------\n" +
                    "1 Display list facility\n" +
                    "2 Add new facility\n" +
                    "3 Display list facility maintenance\n" +
                    "4 Return main menu\n" +
                    "Enter your selection: ");
            choss = sc.nextLine();
            switch (choss) {
                case "1":
//                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":

                    break;
                default:
                    System.err.println("Invalid selection, please re-enter. ");
            }
        }
    }

    public static void bookingManagement() {
        String choss = "-1";
        while (!choss.equals("6")) {
            System.out.print("-------------booking Management------------\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "Enter your selection: ");
            choss = sc.nextLine();
            switch (choss) {
                case "1":
//                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    customerManagement();
                    break;
                case "4":
                    customerManagement();
                    break;
                case "5":
                    facilityManagement();
                    break;
                case "6":

                    break;
                default:
                    System.err.println("Invalid selection, please re-enter. ");
            }
        }
    }

    public static void promotionManagement() {
        String choss = "-1";
        while (!choss.equals("3")) {
            System.out.print("-------------promotion Management-------------\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n" +
                    "Enter your selection: ");
            choss = sc.nextLine();
            switch (choss) {
                case "1":
//                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    break;
                default:
                    System.err.println("Invalid selection, please re-enter. ");
            }
        }
    }
}
