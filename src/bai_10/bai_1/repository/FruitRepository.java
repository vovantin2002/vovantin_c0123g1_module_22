package bai_10.bai_1.repository;

import bai_10.bai_1.model.Fruit;

import java.util.LinkedHashMap;
import java.util.Map;

public class FruitRepository implements IFruitRepository {
    static Map<String, Fruit> listFruit = new LinkedHashMap<>();

    static {
        Fruit fruit = new Fruit("cam", "viet nam", 20 / 1 / 2023, 1, "viet nam", 10);
        Fruit fruit1 = new Fruit("chuoi", "viet nam", 20 / 1 / 2023, 1, "viet nam", 15);
        Fruit fruit2 = new Fruit("nhan", "viet nam", 20 / 1 / 2023, 1, "viet nam", 17);
        Fruit fruit3 = new Fruit("dua hau", "viet nam", 20 / 1 / 2023, 1, "viet nam", 13);
        Fruit fruit4 = new Fruit("dau", "viet nam", 20 / 1 / 2023, 1, "viet nam", 20);
        listFruit.put("0123", fruit);
        listFruit.put("0124", fruit1);
        listFruit.put("0125", fruit2);
        listFruit.put("0126", fruit3);
        listFruit.put("0127", fruit4);
    }


    @Override
    public Map<String, Fruit> getListFruit() {
        return listFruit;
    }

    @Override
    public void addNewFruit(String id, Fruit fruit) {
        listFruit.put(id, fruit);
    }

    @Override
    public boolean deleteFruit(String id) {
        boolean flag=false;
        if (listFruit.containsKey(id)) {
            flag=true;
            System.out.println("Xoa thanh cong. ");
        }else{
            flag=false;
            System.out.println("Khong tim thay id. ");
        }
        return flag;
    }

    @Override
    public boolean editFruit(String id) {
        boolean flag=false;
        if(listFruit.containsKey(id)){
            flag=true;
        }else{
            System.out.println("Khong tim thay id. ");
            flag=false;
        }
        return flag;
    }


}
