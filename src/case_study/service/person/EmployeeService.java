package case_study.service.person;

import case_study.model.person.Employee;
import case_study.repository.person.EmployeeRepository;
import case_study.util.Null;
import case_study.util.ValidateEmployee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
        String id = ValidateEmployee.checkId();
        String name = ValidateEmployee.checkName();
        String birthday = ValidateEmployee.checkBirthday();
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
        String identityCard = ValidateEmployee.checkIdentityCard();
        String phoneNumber = ValidateEmployee.checkPhoneNumber();
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
            System.out.print("Enter position: ");
            position = sc.nextLine();
            if (position == null || position.equals("")) {
                System.err.println("Please enter information. ");
            } else {
                flag = false;
            }
        }
        String salary = ValidateEmployee.checkSalary();
        Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
        employeeRepository.add(employee);
        System.out.println("successfully added new. ");
    }

    @Override
    public void edit() {
        display();
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                String name = ValidateEmployee.checkName();
                String birthday = ValidateEmployee.checkBirthday();
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                String identityCard = ValidateEmployee.checkIdentityCard();
                String phoneNumber = ValidateEmployee.checkPhoneNumber();
                System.out.print("Enter email: ");
                String email = sc.nextLine();
                System.out.print("Enter ability: ");
                String ability = sc.nextLine();
                System.out.print("Enter position: ");
                String position = sc.nextLine();
                String salary = ValidateEmployee.checkSalary();
                Employee employee = new Employee(id, name, birthday, gender, identityCard, phoneNumber, email, ability, position, salary);
                employeeList.set(i, employee);
                employeeRepository.edit(employeeList);
            }
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                employeeList.remove(i);
                employeeRepository.delete(employeeList);
            }
        }
    }
}
