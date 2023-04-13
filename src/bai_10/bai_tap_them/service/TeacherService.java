package bai_10.bai_tap_them.service;

import bai_10.bai_tap_them.repository.TeacherRepository;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void addNewTeacher() {
        teacherRepository.addNewTeacher();
    }

    @Override
    public void removeTeacher() {
        teacherRepository.removeTeacher();
    }

    @Override
    public void displayTeacher() {
        teacherRepository.displayTeacher();
    }
}
