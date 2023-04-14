package bai_10.bai_1.service;

import bai_10.bai_1.model.Fruit;
import bai_10.bai_1.repository.FruitRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitService implements IFruitService {
   static  FruitRepository fruitRepository = new FruitRepository();
    static List<Fruit> listFruit = fruitRepository.getListFruit();
    static Scanner sc= new Scanner(System.in);

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
        fruitRepository.addNewFruit(fruit);
        System.out.println("Them moi thanh cong. ");
    }
}
