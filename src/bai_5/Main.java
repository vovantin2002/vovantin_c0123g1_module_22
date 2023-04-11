package bai_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println("nhap so dien thoai:  ");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("nhap bộ phận làm việc: ");
        String workingParts = sc.nextLine();
        System.out.println("nhap tên công ty:  ");
        String companyName = sc.nextLine();
        Employee employee = new Employee(name,phoneNumber, workingParts, companyName );
        System.out.println(employee.toString());
    }
}
