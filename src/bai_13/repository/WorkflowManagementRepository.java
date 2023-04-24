package bai_13.repository;

import bai_13.model.WorkflowManagement;
import bai_13.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class WorkflowManagementRepository implements IWorkflowManagementRepository {
    static List<WorkflowManagement> workflowManagementList = ReadAndWrite.read();

//    static {
//        workflowManagementList.add(new WorkflowManagement(123, "Nguyen Van C", "20/3", 200, "tu nau an"));
//        workflowManagementList.add(new WorkflowManagement(124, "Nguyen Van B", "20/3", 400, "quan ao"));
//        workflowManagementList.add(new WorkflowManagement(125, "Nguyen Van A", "20/3", 100, "mot thang"));
//        workflowManagementList.add(new WorkflowManagement(126, "Nguyen Van D", "20/3", 300, "lat vat"));
//    }


    @Override
    public List<WorkflowManagement> getList() {
        return workflowManagementList;
    }

    @Override
    public void add(WorkflowManagement workflowManagement) {
        ReadAndWrite.write(workflowManagement);
    }

    @Override
    public void delete(List<WorkflowManagement> workflowManagementList) {
        ReadAndWrite.writeToDelete(workflowManagementList);
    }

    @Override
    public void edit(List<WorkflowManagement> workflowManagementList) {
        ReadAndWrite.writeToDelete(workflowManagementList);
    }

    @Override
    public void searchById(int id) {
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (id == workflowManagementList.get(i).getId()) {
                System.out.println(workflowManagementList.get(i));
            }
        }
    }

    @Override
    public void searchByName(String name) {
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (workflowManagementList.get(i).getSpendingName().contains(name)) {
                System.out.println(workflowManagementList.get(i));
            } else {
                System.out.println("Khong tim thay ten. ");
                break;
            }
        }
    }
}
