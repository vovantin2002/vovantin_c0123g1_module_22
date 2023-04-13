package bai_10.bai_1.controller;

import bai_10.bai_1.service.FruitService;

public class FruitController {
    FruitService fruitService = new FruitService();

    public void displayListFruit() {
        fruitService.displayListFruit();
    }

    public void addNewFruit() {
        fruitService.addNewFruit();
    }
}
