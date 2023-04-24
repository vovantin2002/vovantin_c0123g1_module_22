package bai_13.service;

import bai_13.model.WorkflowManagement;
import bai_13.util.IdNotFoundException;
import bai_13.util.UniqueIDException;

import java.util.List;

public interface IWorkflowManagementService {
    void display();

    void add() throws UniqueIDException;

    List<WorkflowManagement> delete() throws IdNotFoundException;

    void edit();

    void searchById();

    void searchByName();
    void sortByName();
    void sortByAmount();
}
