package bai_10.bai_tap_them.repository;

import bai_10.bai_tap_them.model.Student;


import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

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
    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean removeStudentById(int id) {
        boolean flag = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                 flag=true;
                System.out.println("Xoa thanh cong. ");
            }else{
                System.out.println("Khong tim thay id. ");
                  flag=false;
            }
        }
        return flag;
    }


    @Override
    public List<Student> getStudentList() {
        return studentList;
    }
}
