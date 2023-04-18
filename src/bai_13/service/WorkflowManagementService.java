package bai_13.service;

import bai_13.model.WorkflowManagement;
import bai_13.repository.WorkflowManagementRepository;

import java.util.List;
import java.util.Scanner;

public class WorkflowManagementService implements IWorkflowManagementService {
    Scanner sc = new Scanner(System.in);
    WorkflowManagementRepository workflowManagementRepository = new WorkflowManagementRepository();
    List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getList();

    @Override
    public void display() {
        for (WorkflowManagement w : workflowManagementList) {
            System.out.println(w);
        }

    }

    @Override
    public void add() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap ngay: ");
        String date = sc.nextLine();
        System.out.println("Nhap so tien : ");
        int spendingAmount = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap mo ta: ");
        String moreDescription = sc.nextLine();
        WorkflowManagement workflowManagement = new WorkflowManagement(id, name, date, spendingAmount, moreDescription);
        workflowManagementRepository.add(workflowManagement);
        System.out.println("Them moi thanh cong. ");
    }

    @Override
    public void delete() {
        display();
        System.out.println("Nhap id muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (id == workflowManagementList.get(i).getId()) {
                workflowManagementList.remove(i);
                System.out.println("Xoa thanh cong. ");
            } else {
                System.out.println("Khong tim thay id muon xoa. ");
                break;
            }
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("Nhap id muon sua: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (id == workflowManagementList.get(i).getId()) {
                System.out.println("Nhap id: ");
                id = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap ten: ");
                String name = sc.nextLine();
                System.out.println("Nhap ngay: ");
                String date = sc.nextLine();
                System.out.println("Nhap so tien : ");
                int spendingAmount = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap mo ta: ");
                String moreDescription = sc.nextLine();
                WorkflowManagement workflowManagement = new WorkflowManagement(id, name, date, spendingAmount, moreDescription);
                workflowManagementList.set(i, workflowManagement);
                System.out.println("Sua thanh cong. ");
            } else {
                System.out.println("Khong tim thay id muon sua. ");
                break;
            }
        }
    }

    @Override
    public void searchById() {
        System.out.println("Nhap id muon tim kiem: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (id == workflowManagementList.get(i).getId()) {
                System.out.println(workflowManagementList.get(i));
            } else {
                System.out.println("Khong tim thay id. ");
                break;
            }
        }
    }

    @Override
    public void searchByName() {
        System.out.println("Nhap ten muon tim kiem: ");
        String name = sc.nextLine();
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (name.equals(workflowManagementList.get(i).getSpendingName())) {
                System.out.println(workflowManagementList.get(i));
            } else {
                System.out.println("Khong tim thay id. ");
                break;
            }
        }
    }
}
