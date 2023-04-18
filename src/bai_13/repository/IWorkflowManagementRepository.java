package bai_13.repository;

import bai_13.model.WorkflowManagement;

import java.util.List;

public interface IWorkflowManagementRepository {
    List<WorkflowManagement> getList();

    void add(WorkflowManagement workflowManagement);

    boolean delete(int id);

    boolean edit();

    boolean searchById();

    boolean searchByName();
}
