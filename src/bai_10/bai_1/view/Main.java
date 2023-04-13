package bai_10.bai_1.view;


import bai_10.bai_1.controller.FruitController;

import java.util.Scanner;

public class Main {
    static FruitController fruitController = new FruitController();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choss = -1;
        while (choss != 3) {
            System.out.println("---------QUAN LY TRAI CAY---------- \n" +
                    "1. Hien thi danh sach \n" +
                    "2. Them \n" +
                    "3. Thoat. \n" +
                    "Nhap lua chon cua ban: \n");
            choss = Integer.parseInt(sc.nextLine());
            switch (choss) {
                case 1:
                    fruitController.displayListFruit();
                    break;
                case 2:
                    fruitController.addNewFruit();
                    break;
                case 3:
                    System.out.println("Ban da thoat. ");
                    break;
                default:
                    System.out.println("Vui long chon lai. ");
            }
        }
    }
}
