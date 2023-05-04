package case_study.service.person;

import case_study.model.person.Customer;
import case_study.repository.person.CustomerRepository;
import case_study.util.Validate;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner sc = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    List<Customer> customerList = customerRepository.getList();

    @Override
    public void display() {
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        boolean flag = true;
        String id = Validate.checkIdCustomer();
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
        String typeOfCustomer = null;
        while (flag) {
            System.out.print("Enter typeOfCustomer: \n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    typeOfCustomer = "Diamond";
                    flag = false;
                    break;
                case "2":
                    typeOfCustomer = "Platinum";
                    flag = false;
                    break;
                case "3":
                    typeOfCustomer = "Gold";
                    flag = false;
                    break;
                case "4":
                    typeOfCustomer = "Silver";
                    flag = false;
                    break;
                case "5":
                    typeOfCustomer = "Member";
                    flag = false;
                    break;
                default:
                    System.out.print("Invalid selection, please re-enter.");
            }
        }
        flag = true;
        String address = null;
        while (flag) {
            System.out.print("Enter address: ");
            address = sc.nextLine();
            if (address == null || address.equals("")) {
                System.err.println("Please enter information. ");
            } else {
                flag = false;
            }
        }
        Customer customer = new Customer(id, name, birthday, gender, identityCard, phoneNumber, email, typeOfCustomer, address);
        customerRepository.add(customer);
        System.out.println("successfully added new. ");
    }

    @Override
    public void edit() {
        display();
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        boolean flagg = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (id.equals(customerList.get(i).getId())) {
                String name = Validate.checkName();
                String birthday = Validate.checkBirthday();
                String gender = null;
                boolean flag = true;
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
                String typeOfCustomer = null;
                while (flag) {
                    System.out.print("Enter typeOfCustomer: \n" +
                            "1. Diamond\n" +
                            "2. Platinum\n" +
                            "3. Gold\n" +
                            "4. Silver\n" +
                            "5. Member\n");
                    String choss = sc.nextLine();
                    switch (choss) {
                        case "1":
                            typeOfCustomer = "Diamond";
                            flag = false;
                            break;
                        case "2":
                            typeOfCustomer = "Platinum";
                            flag = false;
                            break;
                        case "3":
                            typeOfCustomer = "Gold";
                            flag = false;
                            break;
                        case "4":
                            typeOfCustomer = "Silver";
                            flag = false;
                            break;
                        case "5":
                            typeOfCustomer = "Member";
                            flag = false;
                            break;
                        default:
                            System.out.print("Invalid selection, please re-enter.");
                    }
                }
                flag = true;
                String address = null;
                while (flag) {
                    System.out.print("Enter address: ");
                    address = sc.nextLine();
                    if (address == null || address.equals("")) {
                        System.err.println("Please enter information. ");
                    } else {
                        flag = false;
                    }
                }
                Customer customer = new Customer(id, name, birthday, gender, identityCard, phoneNumber, email, typeOfCustomer, address);
                customerList.set(i, customer);
                customerRepository.edit(customerList);
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
