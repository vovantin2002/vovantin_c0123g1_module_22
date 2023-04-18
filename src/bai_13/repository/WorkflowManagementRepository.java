package bai_13.repository;

import bai_13.model.WorkflowManagement;

import java.util.ArrayList;
import java.util.List;

public class WorkflowManagementRepository implements IWorkflowManagementRepository {
    static List<WorkflowManagement> workflowManagementList = new ArrayList<>();

    static {
        workflowManagementList.add(new WorkflowManagement(123, "tien an", "20/3", 500, "tu nau an"));
        workflowManagementList.add(new WorkflowManagement(124, "tien mua sam", "20/3", 500, "quan ao"));
        workflowManagementList.add(new WorkflowManagement(125, "tien xang", "20/3", 500, "mot thang"));
        workflowManagementList.add(new WorkflowManagement(126, "tien chi tieu ca nhan", "20/3", 500, "lat vat"));
    }


    @Override
    public List<WorkflowManagement> getList() {
        return workflowManagementList;
    }

    @Override
    public void add(WorkflowManagement workflowManagement) {
        workflowManagementList.add(workflowManagement);
    }

    @Override
    public boolean delete(int id) {

        return false;
    }

    @Override
    public boolean edit() {
        return false;
    }

    @Override
    public boolean searchById() {
        return false;
    }

    @Override
    public boolean searchByName() {
        return false;
    }
}
