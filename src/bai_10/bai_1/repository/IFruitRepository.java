package bai_10.bai_1.repository;

import bai_10.bai_1.model.Fruit;

import java.util.List;

public interface IFruitRepository {
    List<Fruit> getListFruit();
    void addNewFruit(Fruit fruit);
}
