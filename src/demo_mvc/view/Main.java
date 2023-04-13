package demo_mvc.view;

import demo_mvc.controller.StudentController;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentController studentController = new StudentController();

    public static void main(String[] args) {
        int choss = -1;
        while(choss!=3) {
            System.out.println("DANH SACH HOC SINH \n" +
                    "1.hien thi danh sach \n" +
                    "2.them moi hoc sinh \n" +
                    "3.thoat. \n" +
                    "nhap lua chon cua ban: ");
            choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
                case 1:
                    studentController.display();
                    break;
                case 2:
                    studentController.add();
                    break;
                case 3:
                    System.out.println("ban da thoat. ");
                    break;
                default:
                    System.out.println("vui long chon lai. ");
            }
        }

    }
}
