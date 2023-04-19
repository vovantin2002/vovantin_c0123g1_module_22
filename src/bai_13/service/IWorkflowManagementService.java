package bai_13.service;

public interface IWorkflowManagementService {
    void display();

    void add();

    void delete();

    void edit();

    void searchById();

    void searchByName();
    void sortByName();
    void sortByAmount();
}
