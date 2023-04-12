package bai_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println("nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap email: ");
        String email = sc.nextLine();
        System.out.println("nhap so dien thoai: ");
        int numberPhone = Integer.parseInt(sc.nextLine());
        System.out.println("nhap vi tri lam viec: ");
        String workingPosition = sc.nextLine();
        Doctor doctor = new Doctor(name,age,email,numberPhone,workingPosition);
        System.out.println(doctor.toString());
    }
}
