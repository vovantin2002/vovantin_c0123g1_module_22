package case_study.repository.person;

import case_study.model.person.Customer;
import case_study.util.ReadAndWriteCustomer;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    List<Customer>customerList= ReadAndWriteCustomer.read();
    @Override
    public List<Customer> getList() {
        return customerList;
    }
    public void add(Customer customer) {
        customerList.add(customer);
        ReadAndWriteCustomer.write(customerList);
    }

    public void edit(List<Customer> customerList) {
        ReadAndWriteCustomer.write(customerList);
    }
}
