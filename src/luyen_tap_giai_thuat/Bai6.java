package luyen_tap_giai_thuat;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1="abcabcabcdef";
        String []str2=str1.split("");
        System.out.println("nhap tu muon kiem tra: ");
        String str=sc.next();
        int cout=0 ;
        for (int i = 0; i <str1.length() ; i++) {
            if(str.equals(str2[i])){
                cout++;
            }
        }System.out.println(cout);

    }
}
