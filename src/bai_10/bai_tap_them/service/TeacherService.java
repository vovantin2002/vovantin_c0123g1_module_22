package bai_10.bai_tap_them.service;

import bai_10.bai_tap_them.model.Teacher;
import bai_10.bai_tap_them.repository.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    static Scanner sc = new Scanner(System.in);
    TeacherRepository teacherRepository = new TeacherRepository();
    List<Teacher> teacherList = teacherRepository.getTeacherList();

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
        teacherRepository.addNewTeacher(teacher);
        System.out.println("Them moi giang vien thanh cong. ");
    }

    @Override
    public void removeTeacher() {
        displayTeacher();
        System.out.println("Nhap ma giang vien muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                teacherList.remove(i);
                System.out.println("Xoa giang vien thanh cong. ");
            }
        }
        displayTeacher();
    }

    @Override
    public void displayTeacher() {
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
    }
}
