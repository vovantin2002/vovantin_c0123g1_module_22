package bai_10.bai_tap_them.view;

import bai_10.bai_tap_them.controller.StudentController;
import bai_10.bai_tap_them.controller.TeacherController;

import java.util.Scanner;

public class Main {
    static StudentController studentController = new StudentController();
    static TeacherController teacherController = new TeacherController();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choss = -1;
        while (choss != 4) {
            System.out.println("---------CHUONG TRINH QUAN LY SINH VIEN---------- \n" +
                    "1. Them moi giang vien hoac hoc sinh \n" +
                    "2. Xoa giang vien hoac hoc sinh. \n" +
                    "3. Hien thi danh sach giang vien hoac hoc sinh \n" +
                    "4. Thoat. \n" +
                    "Nhap lua chon cua ban: \n");
            choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
                case 1:
                    int chosss = -1;
                    while (chosss != 3) {
                        System.out.println("Them moi giang vien hoac hoc sinh \n" +
                                "1. Them moi giang vien \n" +
                                "2. Them moi hoc sinh \n" +
                                "3. Quay lai menu" +
                                "Nhap lua chon cua ban:");
                        chosss = Integer.parseInt(sc.nextLine());
                        switch (chosss) {
                            case 1:
                                System.out.println("Them moi giang vien: ");
                                teacherController.addNewTeacher();
                                break;
                            case 2:
                                System.out.println("Them moi hoc sinh: ");
                                studentController.addNewStudent();
                                break;
                            case 3:
                                System.out.println("Quay lai menu. \n");
                                break;
                            default:
                                System.out.println("Vui long chon lai. ");
                        }

                    }

                case 2:
                    int chossss = -1;
                    while (chossss != 3) {
                        System.out.println("Xoa giang vien hoac hoc sinh \n" +
                                "1. Xoa giang vien \n" +
                                "2. Xoa hoc sinh \n" +
                                "3. Quay lai menu \n" +
                                "Nhap lua chon cua ban:");
                        chossss = Integer.parseInt(sc.nextLine());
                        switch (chossss) {
                            case 1:
                                System.out.println("Xoa giang vien: ");
                                teacherController.removeTeacher();
                                break;
                            case 2:
                                System.out.println("Xoa hoc sinh: ");
                                studentController.removeStudent();
                                break;
                            case 3:
                                System.out.println("Quay lai menu. \n");
                                break;
                            default:
                                System.out.println("Vui long chon lai. ");
                        }
                    }
                case 3:
                    int chosssss = -1;
                    while (chosssss != 3) {
                        System.out.println("Hien thi danh sach giang vien hoac hoc sinh \n" +
                                "1. Hien thi danh sach giang vien \n" +
                                "2. Hien thi danh sach hoc sinh \n" +
                                "3. Quay lai menu \n" +
                                "Nhap lua chon cua ban:");
                        chosssss = Integer.parseInt(sc.nextLine());
                        switch (chosssss) {
                            case 1:
                                System.out.println("Hien thi danh sach giang vien: ");
                                teacherController.displayTeacher();
                                break;
                            case 2:
                                System.out.println("Hien thi danh sach hoc sinh: ");
                                studentController.displayStudent();
                                break;
                            case 3:
                                System.out.println("Quay lai menu. \n");
                                break;
                            default:
                                System.out.println("Vui long chon lai. ");
                        }
                    }
                case 4:
                    System.out.println("Ban da thoat. ");
                    break;
                default:
                    System.out.println("Vui long chon lai. ");
            }
        }
    }
}
