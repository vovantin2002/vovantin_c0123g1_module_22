package bai_10.bai_tap_them.repository;

import bai_10.bai_tap_them.model.Person;
import bai_10.bai_tap_them.model.Student;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    static Scanner sc = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();

    static {
        Student student = new Student(123, "vovantin", 9, "nam", "c0223g1", 10);
        Student student1 = new Student(124, "vo van tin", 9, "nam", "c0223g1", 10);
        Student student2 = new Student(125, "tincute", 9, "nam", "c0223g1", 10);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhap ma hoc sinh: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten hoc sinh: ");
        String name = sc.nextLine();
        System.out.println("Nhap ngay sinh hoc sinh: ");
        int birthday = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        String gender = sc.nextLine();
        System.out.println("Nhap lop hoc sinh: ");
        String classer = sc.nextLine();
        System.out.println("Nhap diem hoc sinh: ");
        int point = Integer.parseInt(sc.nextLine());
        Student student = new Student(id, name, birthday, gender, classer, point);
        studentList.add(student);
        System.out.println("Them moi hoc sinh thanh cong. ");
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhap ma hoc sinh muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                studentList.remove(i);
                System.out.println("Xoa hoc sinh thanh cong. ");
            }
        }
    }

    @Override
    public void displayStudent() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
