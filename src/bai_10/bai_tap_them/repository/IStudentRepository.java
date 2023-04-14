package bai_10.bai_tap_them.repository;

import bai_10.bai_tap_them.model.Student;

import java.util.List;

public interface IStudentRepository {

    void addNewStudent(Student student);

    boolean removeStudentById(int id);

    List<Student> getStudentList();

}
