package luyen_tap_giai_thuat;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        System.out.println(isYear(n));

    }
    public static boolean isYear(int n){
        if((n%4==0&&n%100!=0)||(n%400==0)){
            return true;
        }else{
            return false;
        }
    }
}
