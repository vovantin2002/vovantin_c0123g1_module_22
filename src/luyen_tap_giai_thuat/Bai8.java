package luyen_tap_giai_thuat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bai8 {
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) throws IOException {

//        String string = "-1234.15";
//        boolean numeric = true;
//        numeric = string.matches("-?\\d+(\\.\\d+)?");
//        if (numeric) System.out.println(string + " is a number");
//        else System.out.println(string + " is not a number");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so: ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i = 0; so > 0; i++) {
            System.out.print(so % 10);
            so = so / 10;
        }
    }
}
