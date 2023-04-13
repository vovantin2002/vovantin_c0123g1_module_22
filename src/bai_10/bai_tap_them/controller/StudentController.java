package bai_10.bai_tap_them.controller;

import bai_10.bai_tap_them.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();

    public void addNewStudent() {
        studentService.addNewStudent();
    }

    public void removeStudent() {
        studentService.removeStudent();
    }

    public void displayStudent() {
        studentService.displayStudent();
    }
}
