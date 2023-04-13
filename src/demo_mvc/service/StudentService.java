package demo_mvc.service;

import demo_mvc.repository.StudentRepository;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public void display() {
        studentRepository.display();
    }

    @Override
    public void add() {
        studentRepository.add();
    }
}
