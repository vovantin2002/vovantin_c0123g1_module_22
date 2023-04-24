package luyen_tap_giai_thuat;

import java.util.Scanner;

public class Bai888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("nhap b: ");
        int b = Integer.parseInt(sc.nextLine());
        average(a, b);
    }

    public static void average(int a, int b) {
        int a1 = 0;
        double b1 = 0;
        if (a > b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    a1 = i;
                }
            }
        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    a1 = i;
                }
            }
        }
        for (int i = 1; true; i++) {
            if (i % a == 0 & i % b == 0) {
                b1 = i;
                break;
            }
        }
        System.out.println(a1 + "," + b1);
        System.out.println((a1 + b1) / 2);
    }
}
