package bai_10.bai_1.repository;

import bai_10.bai_1.model.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitRepository implements IFruitRepository {
    static Scanner sc = new Scanner(System.in);
    static List<Fruit> listFruit = new ArrayList<>();

    static {
        Fruit fruit = new Fruit("cam", "viet nam", 20 / 1 / 2023, 1, "viet nam", 10);
        Fruit fruit1 = new Fruit("chuoi", "viet nam", 20 / 1 / 2023, 1, "viet nam", 15);
        Fruit fruit2 = new Fruit("nhan", "viet nam", 20 / 1 / 2023, 1, "viet nam", 17);
        Fruit fruit3 = new Fruit("dua hau", "viet nam", 20 / 1 / 2023, 1, "viet nam", 13);
        Fruit fruit4 = new Fruit("dau", "viet nam", 20 / 1 / 2023, 1, "viet nam", 20);
        listFruit.add(fruit);
        listFruit.add(fruit1);
        listFruit.add(fruit2);
        listFruit.add(fruit3);
        listFruit.add(fruit4);
    }


    @Override
    public void displayListFruit() {
        for (Fruit s : listFruit) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewFruit() {
        System.out.println("nhap ten trai cay: ");
        String fruitName = sc.nextLine();
        System.out.println("nhap loai trai cay: ");
        String typeOfFruit = sc.nextLine();
        System.out.println("nhap ngay san xuat: ");
        int productionDate = Integer.parseInt(sc.nextLine());
        System.out.println("nhap han su dung: ");
        int expiryDate = Integer.parseInt(sc.nextLine());
        System.out.println("nhap xuat xu: ");
        String origin = sc.nextLine();
        System.out.println("nhap gia: ");
        int price = Integer.parseInt(sc.nextLine());
        Fruit fruit = new Fruit(fruitName, typeOfFruit, productionDate, expiryDate, origin, price);
        listFruit.add(fruit);
        System.out.println("Them moi thanh cong. ");
    }
}
