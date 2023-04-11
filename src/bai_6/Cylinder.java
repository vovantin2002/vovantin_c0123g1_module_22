package bai_6;

public class Cylinder extends Circle {
    private double heigth;

    //overload Cylinder
    public Cylinder() {

    }

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);//kế thừa
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolume() {
        return super.getArea() * this.heigth;
    }

    //đây là override
    @Override
    public String toString() {
        return "A Cylinder with heigth is"
                +
                this.heigth
                + ", which is a subclass of "
                + super.toString();
    }
}
