package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IRepository {
    List getList();

    void add();

    void delete();

    void edit();

}
