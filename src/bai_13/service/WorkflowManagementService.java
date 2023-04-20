package bai_13.service;

import bai_13.model.WorkflowManagement;
import bai_13.repository.WorkflowManagementRepository;
import bai_13.util.IdNotFoundException;
import bai_13.util.UniqueIDException;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WorkflowManagementService implements IWorkflowManagementService {
    Scanner sc = new Scanner(System.in);
    static WorkflowManagementRepository workflowManagementRepository = new WorkflowManagementRepository();
    static List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getList();

    @Override
    public void display() {
        for (WorkflowManagement w : workflowManagementList) {
            System.out.println(w);
        }


    }

    @Override
    public void add() throws UniqueIDException {
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (id == workflowManagementList.get(i).getId()) {
                throw new UniqueIDException("id đã tồn tại, vui lòng nhập lại. ");
            }
        }
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
    public void delete() throws IdNotFoundException {
        display();
        System.out.println("Nhap id muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (id == workflowManagementList.get(i).getId()) {
                workflowManagementList.remove(i);
                System.out.println("Xoa thanh cong. ");
                break;
            } else {
                throw new IdNotFoundException("id khong ton tai. ");
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
            }
        }
    }

    @Override
    public void searchById() {
        System.out.println("Nhap id muon tim kiem: ");
        int id = Integer.parseInt(sc.nextLine());
        workflowManagementRepository.searchById(id);
    }

    @Override
    public void searchByName() {
        System.out.println("Nhap ten muon tim kiem: ");
        String name = sc.nextLine();
        workflowManagementRepository.searchByName(name);
    }

    @Override
    public void sortByName() {
        Collections.sort(workflowManagementList);
        for (WorkflowManagement w : workflowManagementList) {
            System.out.println(w);
        }
    }

    @Override
    public void sortByAmount() {
        Collections.sort(workflowManagementList, new SortByAmount());
        for (WorkflowManagement w : workflowManagementList) {
            System.out.println(w);
        }
    }
}
