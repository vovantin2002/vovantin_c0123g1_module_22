package bai_10.bai_1.model;

public class Fruit {
    private String fruitName;
    private String typeOfFruit;
    private int productionDate;
    private int expiryDate;
    private String origin;
    private int price;

    public Fruit(String fruitName, String typeOfFruit, int productionDate, int expiryDate, String origin, int price) {
        this.fruitName = fruitName;
        this.typeOfFruit = typeOfFruit;
        this.productionDate = productionDate;
        this.expiryDate = expiryDate;
        this.origin = origin;
        this.price = price;
    }

    public Fruit() {
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public void setTypeOfFruit(String typeOfFruit) {
        this.typeOfFruit = typeOfFruit;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", typeOfFruit='" + typeOfFruit + '\'' +
                ", productionDate=" + productionDate +
                ", expiryDate=" + expiryDate +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                '}';
    }
}
