package bai_10.bai_1.repository;

import bai_10.bai_1.model.Fruit;

import java.util.Map;

public interface IFruitRepository {
    Map<String, Fruit> getListFruit();

    void addNewFruit(String id, Fruit fruit);

    boolean deleteFruit(String id);

    boolean editFruit(String id);
}
