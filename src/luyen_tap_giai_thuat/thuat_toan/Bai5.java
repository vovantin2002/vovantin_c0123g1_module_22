package luyen_tap_giai_thuat.thuat_toan;

import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
        int [] arr={-1, 150, 165, 170, -1, -1, 160, 180};
        System.out.println("mang ban dau: "+Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]&&arr[i]!=-1&&arr[j]!=-1){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
