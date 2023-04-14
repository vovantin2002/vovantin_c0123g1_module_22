package luyen_tap_giai_thuat.bai_1;

import java.util.Scanner;

public class SumSNT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n: ");
        int n= Integer.parseInt(sc.nextLine());
////        while(n)
//        for (int i = 0; i <n ; i++) {
//
//        }
        System.out.println(isSNT(n));
    }

    public static boolean isSNT(int n){

        int cout=0;
        for (int i = 2; i <=n ; i++) {
            if(n%i==0){
                cout++;
            }
        }if(cout==1){
            return true;
        }
        return false;
    }
    }

