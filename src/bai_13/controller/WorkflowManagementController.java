package bai_13.controller;

import bai_13.service.WorkflowManagementService;

public class WorkflowManagementController {
    WorkflowManagementService workflowManagementService = new WorkflowManagementService();

    public void display() {
        workflowManagementService.display();
    }

    public void add() {
        workflowManagementService.add();
    }

    public void delete() {
        workflowManagementService.delete();
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
}
