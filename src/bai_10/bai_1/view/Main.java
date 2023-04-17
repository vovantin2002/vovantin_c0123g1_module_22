package bai_10.bai_1.view;


import bai_10.bai_1.controller.FruitController;

import java.util.Scanner;

public class Main {
    static FruitController fruitController = new FruitController();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choss = -1;
        while (choss != 5) {
            System.out.println("---------QUAN LY TRAI CAY---------- \n" +
                    "1. Hien thi danh sach (keySet,entrySet). \n" +
                    "2. Them \n" +
                    "3. Xoa \n" +
                    "4. Sua \n" +
                    "5. Thoat. \n" +
                    "Nhap lua chon cua ban: \n");
            choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
                case 1:
                    int chosss = -1;
                    while (chosss != 3) {
                        System.out.println("Hien thi danh sach (keySet,entrySet). \n" +
                                "1. Hien thi danh sach (keySet) \n" +
                                "2. Hien thi danh sach (entry) \n" +
                                "3. Thoat. \n" +
                                "Nhap lua chon cua ban: ");
                        chosss = Integer.parseInt(sc.nextLine());
                        switch (chosss) {
                            case 1:
                                fruitController.displayListFruitSetKey();
                                break;
                            case 2:
                                fruitController.displayListFruit();
                                break;
                            case 3:
                                System.out.println("Ban da thoat. ");
                                break;
                            default:
                                System.out.println("Vui long chon lai. ");
                        }
                    }
                case 2:
                    fruitController.addNewFruit();
                    break;
                case 3:
                    fruitController.deleteFruit();
                    break;
                case 4:
                    fruitController.editFruit();
                    break;
                case 5:
                    System.out.println("Ban da thoat. ");
                    break;
                default:
                    System.out.println("Vui long chon lai. ");
            }
        }
    }
}
