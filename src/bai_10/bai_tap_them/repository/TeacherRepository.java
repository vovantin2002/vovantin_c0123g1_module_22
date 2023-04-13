package bai_10.bai_tap_them.repository;


import bai_10.bai_tap_them.model.Student;
import bai_10.bai_tap_them.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository {
    static Scanner sc = new Scanner(System.in);
    static List<Teacher> teacherList = new ArrayList<>();

    static {
        Teacher teacher = new Teacher(123, "vovantin", 9, "nam", "giang vien");
        Teacher teacher1 = new Teacher(124, "vo van tin", 9, "nam", "giao vu");
        Teacher teacher2 = new Teacher(125, "tincute", 9, "nam", "tuyen sinh");
        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
    }

    @Override
    public void addNewTeacher() {
        System.out.println("Nhap ma giang vien: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten giang vien: ");
        String name = sc.nextLine();
        System.out.println("Nhap ngay sinh giang vien: ");
        int birthday = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        String gender = sc.nextLine();
        System.out.println("Nhap chuyen mon : ");
        String expertise = sc.nextLine();
        Teacher teacher = new Teacher(id, name, birthday, gender, expertise);
        teacherList.add(teacher);
        System.out.println("Them moi giang vien thanh cong. ");
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhap ma giang vien muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                teacherList.remove(i);
                System.out.println("Xoa giang vien thanh cong. ");
            }
        }
    }

    @Override
    public void displayTeacher() {
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
    }
}
