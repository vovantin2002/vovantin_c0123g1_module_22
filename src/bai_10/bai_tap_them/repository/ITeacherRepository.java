package bai_10.bai_tap_them.repository;


import bai_10.bai_tap_them.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    void addNewTeacher(Teacher teacher);

    boolean removeTeacherById(int id);

    List<Teacher> getTeacherList();
}
