package luyen_tap_giai_thuat;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 7, 8, 9, 234, 12, 6};
        int n = arr.length;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if((arr[i]+arr[j]==a)&&(arr[i]!=arr[j])){
                    System.out.println(i+","+j);
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }

        }
    }
}
