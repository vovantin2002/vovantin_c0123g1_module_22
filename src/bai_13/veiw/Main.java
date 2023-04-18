package bai_13.veiw;

import bai_13.controller.WorkflowManagementController;

import java.util.Scanner;

public class Main {
    static WorkflowManagementController workflowManagementController = new WorkflowManagementController();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("---------QUẢN LÝ CÔNG VIỆC---------- \n" +
                    "1. Hiển thị danh sách \n" +
                    "2. Thêm \n" +
                    "3. Xóa \n" +
                    "4. Sửa \n" +
                    "5. Tìm kiếm theo mã chi tiêu \n" +
                    "6. Tìm kiếm gần đúng theo tên chi tiêu \n" +
                    "7. Thoat. \n" +
                    "Nhập lựa chọn của bạn: ");
            String choss = sc.nextLine();
            switch (choss) {
                case "1":
                    workflowManagementController.display();
                    break;
                case "2":
                    workflowManagementController.add();
                    break;
                case "3":
                    workflowManagementController.delete();
                    break;
                case "4":
                    workflowManagementController.edit();
                    break;
                case "5":
                    workflowManagementController.searchById();
                    break;
                case "6":
                    workflowManagementController.searchByName();
                    break;
                case "7":
                    System.out.println("Ban da thoat. ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon lai. ");
            }
        }
    }
}
