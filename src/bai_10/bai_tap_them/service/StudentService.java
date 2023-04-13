package bai_10.bai_tap_them.service;


import bai_10.bai_tap_them.repository.StudentRepository;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public void addNewStudent() {
        studentRepository.addNewStudent();
    }

    @Override
    public void removeStudent() {
        studentRepository.removeStudent();
    }

    @Override
    public void displayStudent() {
        studentRepository.displayStudent();
    }
}
