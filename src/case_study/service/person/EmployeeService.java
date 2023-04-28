package case_study.service.person;

import case_study.model.person.Employee;
import case_study.repository.person.EmployeeRepository;
import case_study.util.Validate;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    List<Employee> employeeList = employeeRepository.getList();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        boolean flag = true;
        String id = Validate.checkIdEmployee();
        String name = Validate.checkName();
        String birthday = Validate.checkBirthday();
        String gender = null;
        while (flag) {
            System.out.print("Enter gender: ");
            gender = sc.nextLine();
            if (gender == null || gender.equals("")) {
                System.err.print("Please enter information. ");
            } else {
                flag = false;
            }
        }
        String identityCard = Validate.checkIdentityCard();
        String phoneNumber = Validate.checkPhoneNumber();
        flag = true;
        String email = null;
        while (flag) {
            System.out.print("Enter email: ");
            email = sc.nextLine();
            if (email == null || email.equals("")) {
                System.err.println("Please enter information. ");
            } else {
                flag = false;
            }
        }
        flag = true;
        String ability = null;
        while (flag) {
            System.out.print("Enter ability: \n" +
                    "1. Trung cap\n" +
                    "2. Cao dang \n" +
                    "3. Dai hoc\n" +
                    "4. Sau dai hoc\n");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    ability = "Trung cap";
                    flag = false;
                    break;
                case "2":
                    ability = "Cao dang";
                    flag = false;
                    break;
                case "3":
                    ability = "Dai hoc";
                    flag = false;
                    break;
                case "4":
                    ability = "Sau dai hoc";
                    flag = false;
                    break;
                default:
                    System.out.print("Invalid selection, please re-enter.");
            }
        }
        flag = true;
        String position = null;
        while (flag) {
            System.out.print("Enter position: \n" +
                    "1. Receptionist\n" +
                    "2. Waiter \n" +
                    "3. Specialist\n" +
                    "4. Supervisor\n" +
                    "5. Manager\n" +
                    "6. Director\n");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    position = "Receptionist";
                    flag = false;
                    break;
                case "2":
                    position = "Waiter";
                    flag = false;
                    break;
                case "3":
                    position = "Specialist";
                    flag = false;
                    break;
                case "4":
                    position = "Supervisor";
                    flag = false;
                    break;
                case "5":
                    position = "Manager";
                    flag = false;
                    break;
                case "6":
                    position = "Director";
                    flag = false;
                    break;
                default:
                    System.out.print("Invalid selection, please re-enter.");
            }
        }
        String salary = Validate.checkSalary();
        Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
        employeeRepository.add(employee);
        System.out.println("successfully added new. ");
    }

    @Override
    public void edit() {
        boolean flagg = true;
        display();
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                boolean flag = true;
                String name = Validate.checkName();
                String birthday = Validate.checkBirthday();
                String gender = null;
                while (flag) {
                    System.out.print("Enter gender: ");
                    gender = sc.nextLine();
                    if (gender == null || gender.equals("")) {
                        System.err.print("Please enter information. ");
                    } else {
                        flag = false;
                    }
                }
                String identityCard = Validate.checkIdentityCard();
                String phoneNumber = Validate.checkPhoneNumber();
                flag = true;
                String email = null;
                while (flag) {
                    System.out.print("Enter email: ");
                    email = sc.nextLine();
                    if (email == null || email.equals("")) {
                        System.err.println("Please enter information. ");
                    } else {
                        flag = false;
                    }
                }
                flag = true;
                String ability = null;
                while (flag) {
                    System.out.print("Enter ability: ");
                    ability = sc.nextLine();
                    if (ability == null || ability.equals("")) {
                        System.err.println("Please enter information. ");
                    } else {
                        flag = false;
                    }
                }
                flag = true;
                String position = null;
                while (flag) {
                    System.out.print("Enter position: \n" +
                            "1. Receptionist\n" +
                            "2. Waiter \n" +
                            "3. Specialist\n" +
                            "4. Supervisor\n" +
                            "5. Manager\n" +
                            "6. Director\n");
                    String choss = sc.nextLine();
                    switch (choss) {
                        case "1":
                            position = "Receptionist";
                            flag = false;
                            break;
                        case "2":
                            position = "Waiter";
                            flag = false;
                            break;
                        case "3":
                            position = "Specialist";
                            flag = false;
                            break;
                        case "4":
                            position = "Supervisor";
                            flag = false;
                            break;
                        case "5":
                            position = "Manager";
                            flag = false;
                            break;
                        case "6":
                            position = "Director";
                            flag = false;
                            break;
                        default:
                            System.out.print("Invalid selection, please re-enter.");
                    }
                }
                String salary = Validate.checkSalary();
                Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
                employeeList.set(i, employee);
                employeeRepository.edit(employeeList);
                System.out.println("successful fix. ");
                flagg = true;
                break;
            } else {
                flagg = false;
            }
        }
        if (!flagg) {
            System.out.println("id not found. ");
        }
    }
}
