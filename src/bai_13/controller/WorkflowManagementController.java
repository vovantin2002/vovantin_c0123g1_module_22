package bai_13.controller;

import bai_13.service.WorkflowManagementService;
import bai_13.util.IdNotFoundException;
import bai_13.util.UniqueIDException;

public class WorkflowManagementController {
    WorkflowManagementService workflowManagementService = new WorkflowManagementService();

    public void display() {
        workflowManagementService.display();
    }

    public void add() {
        boolean flag = true;
        while (flag) {
            try {
                workflowManagementService.add();
                flag = false;
            } catch (UniqueIDException e) {
                flag = true;
                System.err.println("id da ton tai, vui long nhap lai. ");
            }
        }
    }

    public void delete() {
        boolean flag = true;
        while (flag) {
            try {
                workflowManagementService.delete();
                flag = false;
            } catch (IdNotFoundException e) {
                flag = true;
                System.err.println("id khong ton tai. ");
            }
        }
    }

    public void edit() {
        workflowManagementService.edit();
    }

    public void searchById() {
        workflowManagementService.searchById();
    }

    public void searchByName() {
        workflowManagementService.searchByName();
    }

    public void sortByName() {
        workflowManagementService.sortByName();
    }

    public void sortByAmount() {
        workflowManagementService.sortByAmount();
    }
}
