package bai_13.repository;

import bai_13.model.WorkflowManagement;

import java.util.List;

public interface IWorkflowManagementRepository {
    List<WorkflowManagement> getList();

    void add(List<WorkflowManagement> workflowManagementList);

    void delete(List<WorkflowManagement> workflowManagementList);

    void edit(List<WorkflowManagement> workflowManagementList);

    void searchById(int id);

    void searchByName(String name);
}
