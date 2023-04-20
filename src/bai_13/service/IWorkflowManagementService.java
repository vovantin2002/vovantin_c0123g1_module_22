package bai_13.service;

import bai_13.util.IdNotFoundException;
import bai_13.util.UniqueIDException;

public interface IWorkflowManagementService {
    void display();

    void add() throws UniqueIDException;

    void delete() throws IdNotFoundException;

    void edit();

    void searchById();

    void searchByName();
    void sortByName();
    void sortByAmount();
}
