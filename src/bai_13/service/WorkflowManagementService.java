package bai_13.service;

import bai_13.model.WorkflowManagement;
import bai_13.repository.WorkflowManagementRepository;
import bai_13.util.IdNotFoundException;
import bai_13.util.ReadAndWrite;
import bai_13.util.SortByAmount;
import bai_13.util.UniqueIDException;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WorkflowManagementService implements IWorkflowManagementService {
    Scanner sc = new Scanner(System.in);
    static WorkflowManagementRepository workflowManagementRepository = new WorkflowManagementRepository();
    static List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getList();
    List<WorkflowManagement> workflowManagementList1 = ReadAndWrite.read();

    @Override
    public void display() {
        for (WorkflowManagement w : workflowManagementList1) {
            System.out.println(w);
        }
    }

    @Override
    public void add() throws UniqueIDException {
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList1.size(); i++) {
            if (id == workflowManagementList1.get(i).getId()) {
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
    public List<WorkflowManagement> delete() throws IdNotFoundException {
        boolean flag = true;
        display();
        System.out.println("Nhap id muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList1.size(); i++) {
            if (id == workflowManagementList1.get(i).getId()) {
                workflowManagementList1.remove(i);
                workflowManagementRepository.delete(workflowManagementList1);
                System.out.println("Xoa thanh cong. ");
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (!flag) {
            throw new IdNotFoundException("id khong ton tai. ");
        }
        return workflowManagementList1;
    }

    @Override
    public void edit() {
        display();
        System.out.println("Nhap id muon sua: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < workflowManagementList1.size(); i++) {
            if (id == workflowManagementList1.get(i).getId()) {
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
                workflowManagementList1.set(i, workflowManagement);
                workflowManagementRepository.delete(workflowManagementList1);
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
