package case_study.repository.person;

import case_study.model.person.Employee;
import case_study.util.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    List<Employee>employeeList= ReadAndWriteEmployee.read();
    @Override
    public List<Employee> getList() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        ReadAndWriteEmployee.write(employeeList);
    }

    @Override
    public void delete(List<Employee>employeeList) {
        ReadAndWriteEmployee.write(employeeList);
    }

    @Override
    public void edit(List<Employee> employeeList) {
        ReadAndWriteEmployee.write(employeeList);
    }
}
