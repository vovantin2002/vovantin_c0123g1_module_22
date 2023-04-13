package bai_10.service;

import bai_10.repository.FruitRepository;

public class FruitService implements IFruitService {
    FruitRepository fruitRepository = new FruitRepository();

    @Override
    public void displayListFruit() {
        fruitRepository.displayListFruit();
    }

    @Override
    public void addNewFruit() {
        fruitRepository.addNewFruit();
    }
}
