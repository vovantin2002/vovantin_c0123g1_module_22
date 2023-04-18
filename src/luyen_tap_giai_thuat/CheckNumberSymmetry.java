package luyen_tap_giai_thuat;

import java.util.Scanner;

public class CheckNumberSymmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra: ");
        int n = Integer.parseInt(sc.nextLine());
        int nReverse = 0;
        int b = n;
        while (b > 0) {
            nReverse = nReverse * 10 + b % 10;
            b = b / 10;
        }
        System.out.println(nReverse);
        if (nReverse == n) {
            System.out.println("so doi xung. ");
        } else {
            System.out.println("khong doi xung. ");
        }


    }
}
