package bai_13.repository;

import bai_13.model.WorkflowManagement;
import bai_13.util.ReadAndWrite;
import bai_13.util.ReadAndWriteBinaryFile;

import java.util.ArrayList;
import java.util.List;

public class WorkflowManagementRepository implements IWorkflowManagementRepository {
    //    static List<WorkflowManagement> workflowManagementList = ReadAndWrite.read();
    List<WorkflowManagement> workflowManagementList = ReadAndWriteBinaryFile.read();

    @Override
    public List<WorkflowManagement> getList() {
        return workflowManagementList;
    }

    @Override
    public void add(List<WorkflowManagement> workflowManagementList1) {
        ReadAndWriteBinaryFile.write(workflowManagementList1);
    }

    @Override
    public void delete(List<WorkflowManagement> workflowManagementList) {
        ReadAndWriteBinaryFile.write(workflowManagementList);
    }

    @Override
    public void edit(List<WorkflowManagement> workflowManagementList) {
        ReadAndWriteBinaryFile.write(workflowManagementList);
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
