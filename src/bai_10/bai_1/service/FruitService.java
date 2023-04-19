package bai_10.bai_1.service;

import bai_10.bai_1.model.Fruit;
import bai_10.bai_1.repository.FruitRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FruitService implements IFruitService {
     FruitRepository fruitRepository = new FruitRepository();
     Map<String, Fruit> listFruit = fruitRepository.getListFruit();
     Scanner sc = new Scanner(System.in);

    public void displayListFruit() {
        for (Map.Entry<String, Fruit> s : listFruit.entrySet()) {
            System.out.println(s.getKey() + "-" + s.getValue());
        }
    }

    public void displayListFruitSetKey() {
        Set<String> stringSet = listFruit.keySet();
        for (String s : stringSet) {
            System.out.println(s + "-" + listFruit.get(s));
        }
    }

    @Override
    public void addNewFruit() {
        System.out.println("nhap id trai cay: ");
        String id = sc.nextLine();
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
        fruitRepository.addNewFruit(id, fruit);
        System.out.println("Them moi thanh cong. ");
    }

    @Override
    public void deleteFruit() {
        displayListFruit();
        System.out.println("Nhap id muon xoa: ");
        String id = sc.nextLine();
        if (fruitRepository.deleteFruit(id)) {
            listFruit.remove(id);
        }
    }

    @Override
    public void editFruit() {
        displayListFruit();
        System.out.println("Nhap id can sua: ");
        String id = sc.nextLine();
        if (fruitRepository.editFruit(id)) {
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
            listFruit.replace(id, fruit);
            System.out.println("Sua thanh cong. ");
        }
    }

}
