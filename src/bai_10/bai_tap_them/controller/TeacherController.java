package bai_10.bai_tap_them.controller;

import bai_10.bai_tap_them.service.TeacherService;

public class TeacherController {
    TeacherService teacherService = new TeacherService();

    public void addNewTeacher() {
        teacherService.addNewTeacher();
    }

    public void removeTeacher() {
        teacherService.removeTeacher();
    }

    public void displayTeacher() {
        teacherService.displayTeacher();
    }
}
