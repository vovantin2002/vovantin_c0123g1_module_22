package bai_10.bai_tap_them.repository;


import bai_10.bai_tap_them.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {

    static List<Teacher> teacherList = new ArrayList<>();

    static {
        Teacher teacher = new Teacher(123, "vovantin", 9, "nam", "giang vien");
        Teacher teacher1 = new Teacher(124, "vo van tin", 9, "nam", "giao vu");
        Teacher teacher2 = new Teacher(125, "tincute", 9, "nam", "tuyen sinh");
        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
    }


    @Override
    public void addNewTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public boolean removeTeacherById(int id) {
        return false;
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
