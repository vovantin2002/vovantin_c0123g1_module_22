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
        Employee employee1 = new Employee();
        boolean flagg = true;
        display();
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                System.out.print("Select the content you want to edit: \n" +
                        "1. Fix all.\n" +
                        "2. Edit each part\n");
                String choss = sc.nextLine();
                switch (choss) {
                    case "1":
                        boolean flag = true;
                        String name = Validate.checkName();
                        employeeList.get(i).setName(name);
                        String birthday = Validate.checkBirthday();
                        employeeList.get(i).setBirthday(birthday);
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
                        employeeList.get(i).setGender(gender);
                        String identityCard = Validate.checkIdentityCard();
                        employeeList.get(i).setIdentityCard(identityCard);
                        String phoneNumber = Validate.checkPhoneNumber();
                        employeeList.get(i).setPhoneNumber(phoneNumber);
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
                        employeeList.get(i).setEmail(email);
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
                        employeeList.get(i).setAbility(ability);
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
                            String chosss = sc.nextLine();
                            switch (chosss) {
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
                        employeeList.get(i).setPosition(position);
                        String salary = Validate.checkSalary();
                        employeeList.get(i).setSalary(salary);
                        employeeRepository.edit(employeeList);
                        System.out.println("successful fix. ");
                        flagg = true;
                        break;
                    case "2":
                        while (true) {
                            System.out.println("Select the content you want to edit:\n" +
                                    "1. name\n" +
                                    "2. birthday\n" +
                                    "3. gender\n" +
                                    "4. identityCard\n" +
                                    "5. phoneNumber\n" +
                                    "6. email\n" +
                                    "7. ability\n" +
                                    "8. position\n" +
                                    "9. salary\n" +
                                    "0. exit. ");
                            String chos = sc.nextLine();
                            switch (chos) {
                                case "0":
                                    System.out.println("Exit. ");
                                    System.exit(0);
                                    break;
                                case "1":
                                    String name1 = Validate.checkName();
                                    employeeList.get(i).setName(name1);
                                    break;
                                case "2":
                                    String birthday1 = Validate.checkBirthday();
                                    employeeList.get(i).setBirthday(birthday1);
                                    break;
                                case "3":
                                    System.out.println("Enter gender: ");
                                    String gender1 = sc.nextLine();
                                    employeeList.get(i).setGender(gender1);
                                    break;
                                case "4":
                                    String identityCard1 = Validate.checkIdentityCard();
                                    employeeList.get(i).setIdentityCard(identityCard1);
                                    break;
                                case "5":
                                    String phoneNumber1 = Validate.checkPhoneNumber();
                                    employeeList.get(i).setPhoneNumber(phoneNumber1);
                                    break;
                                case "6":
                                    String email1 = sc.nextLine();
                                    employeeList.get(i).setEmail(email1);
                                    break;
                                case "7":
                                    flag = true;
                                    String ability1 = null;
                                    while (flag) {
                                        System.out.print("Enter ability: \n" +
                                                "1. Trung cap\n" +
                                                "2. Cao dang \n" +
                                                "3. Dai hoc\n" +
                                                "4. Sau dai hoc\n");
                                        String chosss = sc.nextLine();
                                        switch (chosss) {
                                            case "1":
                                                ability1 = "Trung cap";
                                                flag = false;
                                                break;
                                            case "2":
                                                ability1 = "Cao dang";
                                                flag = false;
                                                break;
                                            case "3":
                                                ability1 = "Dai hoc";
                                                flag = false;
                                                break;
                                            case "4":
                                                ability1 = "Sau dai hoc";
                                                flag = false;
                                                break;
                                            default:
                                                System.out.print("Invalid selection, please re-enter.");
                                        }
                                        employeeList.get(i).setAbility(ability1);
                                        break;
                                    }
                                case "8":
                                    flag = true;
                                    String position1 = null;
                                    while (flag) {
                                        System.out.print("Enter position: \n" +
                                                "1. Receptionist\n" +
                                                "2. Waiter \n" +
                                                "3. Specialist\n" +
                                                "4. Supervisor\n" +
                                                "5. Manager\n" +
                                                "6. Director\n");
                                        String chosss = sc.nextLine();
                                        switch (chosss) {
                                            case "1":
                                                position1 = "Receptionist";
                                                flag = false;
                                                break;
                                            case "2":
                                                position1 = "Waiter";
                                                flag = false;
                                                break;
                                            case "3":
                                                position1 = "Specialist";
                                                flag = false;
                                                break;
                                            case "4":
                                                position1 = "Supervisor";
                                                flag = false;
                                                break;
                                            case "5":
                                                position1 = "Manager";
                                                flag = false;
                                                break;
                                            case "6":
                                                position1 = "Director";
                                                flag = false;
                                                break;
                                            default:
                                                System.out.print("Invalid selection, please re-enter.");
                                        }
                                    }
                                    employeeList.get(i).setPosition(position1);
                                    break;
                                case "9":
                                    String salary1 = Validate.checkSalary();
                                    employeeList.get(i).setSalary(salary1);
                                    break;
                                default:
                                    System.out.print("Invalid selection, please re-enter.");
                            }
                            employeeRepository.edit(employeeList);
                            System.out.println("successful fix. ");
                            flagg = true;
                            break;
                        }
                }
            } else {
                flagg = false;
            }
        }
        if (!flagg) {
            System.out.println("id not found. ");
        }
    }
}
