package demo_mvc.repository;

import demo_mvc.model.Student;
import demo_mvc.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentList = new ArrayList<>();

    static Student[] students = new Student[5];

    static {
        Student student = new Student(1, "vovantin");
        Student student2 = new Student(2, "vo van tin");
        Student student3 = new Student(3, "vovantinnnnn");
        students[0] = student;
        students[1] = student2;
        students[2] = student3;

    }


    @Override
    public void display() {
        List<Student> students1 = ReadAndWrite.read();
        for (Student s : students1) {
            System.out.println(s.toString());
        }
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        Student student = new Student(id, name);
//        int n = students.length;
//        for (int i = 0; i < n; i++) {
//            if (students[i] == null) {
//                students[i] = student;
        ReadAndWrite.write(student);
        studentList.add(student);
        System.out.println("them hoc sinh thanh cong. ");
//                break;
//            }
//        }

    }
}
