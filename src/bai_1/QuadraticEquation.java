package bai_1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    static Scanner sc = new Scanner(System.in);
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public static double getDiscriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static double getRoot1(int a, int b, int c) {
        return (-b + sqrt(getDiscriminant(a, b, c))) / (2 * a);
    }

    public static double getRoot2(int a, int b, int c) {
        return (-b - sqrt(getDiscriminant(a, b, c))) / (2 * a);
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        System.out.println("nhap b: ");
        int b = sc.nextInt();
        System.out.println("nhap c: ");
        int c = sc.nextInt();
        double delta = QuadraticEquation.getDiscriminant(a, b, c);
        System.out.println(delta);
        if (delta > 0) {
            System.out.println("nghiệm thứ nhất là: " + getRoot1(a, b, c));
            System.out.println("nghiệm thứ hai là: " + getRoot2(a, b, c));
        } else if (delta == 0) {
            System.out.println("nghiệm của phương trình là: " + getRoot1(a, b, c));
        } else {
            System.out.println("The equation has no roots. ");
        }
    }
}
