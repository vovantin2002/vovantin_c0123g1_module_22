package bai_6;

public class Circle {
    // thành phần này không được kế thua
    private double radius;
    // thành phần này không được kế thua
    private String color;
    //overload Cylinder
    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    //đây là override
    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.radius
                + "And color is " + this.color;
    }
}
