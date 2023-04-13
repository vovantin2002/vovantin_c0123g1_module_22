package demo_mvc.controller;

import demo_mvc.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();
    public void display(){
        studentService.display();
    }
    public void add(){
        studentService.add();
    }
}
