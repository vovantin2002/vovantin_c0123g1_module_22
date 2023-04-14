package bai_10.bai_1.repository;

import bai_10.bai_1.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitRepository implements IFruitRepository {
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
    public List<Fruit> getListFruit() {
        return listFruit;
    }

    @Override
    public void addNewFruit(Fruit fruit) {
        listFruit.add(fruit);
    }


}
