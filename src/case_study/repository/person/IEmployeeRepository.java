package case_study.repository.person;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List getList();

    void delete(List<Employee>employeeList);

    void edit(List<Employee> employeeList);

    void add(Employee employee);
}
